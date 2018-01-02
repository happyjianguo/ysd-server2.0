package com.rd.tpp.util;

import com.jcraft.jsch.*;
import org.apache.logging.log4j.LogManager;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

/**
 * TODO sftp文件的上传与下载
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年6月14日 下午3:57:32
 */
public class SftpUtil {

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(SftpUtil.class);

	// 定义 加密算法,可用 DES,DESede,Blowfish //keybyte为加密密钥，长度为24字节 //src为被加密的数据缓冲区（源）
	private static final String ALGORITHM = "DESede";
	
	protected static String host; //sftp服务器ip
	
	protected static int port;  //端口号
	
	protected static String username;  //用户名
	
	protected static String password;  //密码
	
	protected static String privateKey;//密钥文件路径

	protected static String passphrase; //密钥口令
	
	private   static String  rootPath;
	private static SftpUtil instance = null;
	
	/**
	 * 初始化参数
	 */
	private  void init() {
		host = TppPropertyUtil.getMessage("sftp_host");
		port = Integer.valueOf(TppPropertyUtil.getMessage("sftp_port"));
		username = TppPropertyUtil.getMessage("sftp_username");
		password = TppPropertyUtil.getMessage("sftp_password");
		rootPath = TppPropertyUtil.getMessage("sftp_rootPath");
		privateKey = TppPropertyUtil.class.getClassLoader().getResource("").getPath() + TppPropertyUtil.getMessage("sftp_privateKey");
//		passphrase = TppPropertyUtil.getMessage("sftp_passphrase");
	}
    /**
     * 私有构造器
     */
	private SftpUtil() {
		// 初始化
		init();
	}
	/*
	 * 单例设计模式
	 */
	public static SftpUtil getInstance() {
		if (instance == null) {
			instance = new SftpUtil();
		}
		return instance;
	}
	
	 public static void main(String[] args) {
		 try {
			 ChannelSftp sftp=SftpUtil.getInstance().connect();
			 
			 // session 连接关闭
			 sftp.getSession().disconnect();
			 // sftp连接
			 sftp.disconnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}
	}
	 
	/**
	 * 获取sftp连接
	 * @return
	 */
	private   ChannelSftp connect()  throws Exception{
		JSch jsch = new JSch();
		Channel channel = null;
		try {
			if (StringUtils.isNotBlank(privateKey)) {
				// 使用密钥验证方式，密钥可以使有口令的密钥，也可以是没有口令的密钥
				if (StringUtils.isNotBlank(passphrase)) {
					jsch.addIdentity(privateKey, passphrase);
				} else {
					jsch.addIdentity(privateKey);
				}
			}
			Session session = jsch.getSession(username, host, port);
			//连接不上 抛出异常
			if (session == null) {
				throw new Exception("sftp session is null,please check config");
			}
			if (StringUtils.isNotBlank(password)) {
				session.setPassword(password);
			}
			Properties sshConfig = new Properties();
			sshConfig.put("StrictHostKeyChecking", "no");// do not verify host
			session.setConfig(sshConfig);
		    session.setTimeout(10000);
			session.setServerAliveInterval(92000);//设置最大连接数为
			session.connect(1000000);////连接超时时间 10S
			LOGGER.info("创建sftp连接成功");
			// 参数sftp指明要打开的连接是sftp连接
			channel = session.openChannel("sftp");
			channel.connect();
		} catch (Exception e) {
			LOGGER.error(e);
			throw e;
		}
		return (ChannelSftp) channel;
	}

	/**
	 * 上传文件
	 * @param directory  上传的目录
	 * @param uploadFile  要上传的文件
	 * @param sftp
	 */
	public static void upload(String directory, String uploadFile, ChannelSftp sftp) {
		try {
			sftp.cd(directory);
			File file = new File(uploadFile);
			sftp.put(new FileInputStream(file), file.getName());
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
	
	/**
	 * 上传文件
	 * @param fileList
	 * @return
	 */
	public boolean uploadFile(String[][] fileList){
		boolean uploadFlag = false;
		try {
			ChannelSftp channelSftp = connect();
			// 以日期命名的文件夹
			String date = DateUtils.getDate(DateUtils.DATEFORMAT_STR_012);
			channelSftp.cd(rootPath);
			try {
				// 进入文件夹
				channelSftp.cd(date);
			} catch (SftpException sException) {
				if (ChannelSftp.SSH_FX_NO_SUCH_FILE == sException.id) {
					LOGGER.info("创建文件夹： " + date);
					// 若文件夹不存在，新建文件夹
					channelSftp.mkdir(date);
					channelSftp.cd(date);
				}
			}
			for (int i = 0; i < fileList.length; i++) {
				String[] filePath = fileList[i];
				channelSftp.put(filePath[0], filePath[1]);
			}
			uploadFlag = true;
			// 上传文件后关闭连接
			if (channelSftp != null) {
				try {
					if (channelSftp.getSession() != null) {
						channelSftp.getSession().disconnect();
						LOGGER.info("上传文件后关闭session连接");
					}
				} catch (JSchException e) {
					e.printStackTrace();
				}
				channelSftp.disconnect();
				LOGGER.info("上传文件后关闭sftp连接");
			}
		} catch (Exception e) {
			uploadFlag = false;
			LOGGER.error(e.getMessage());
		}
		return uploadFlag;
	}
	
	/**
	 * 下载文件
	 * @param filePath  本地存放路径
	 * @param remoteFilePath  远程的文件路径
	 * @param fileName  结果文件名称
	 * @param sftp
	 */
	public boolean download(String filePath, String remoteFilePath, String fileName) {
		LOGGER.info("下载sftp文件fileName：-->" + fileName);
		LOGGER.info("本地目录filePath：-->" + filePath);
		LOGGER.info("渤海文件路径remoteFilePath：-->" + remoteFilePath);
		// 判断目录，不存在时 是创建还是 return，商户自行决定,默认创建
		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		try {
			ChannelSftp sftp = connect();
			sftp.cd(rootPath + remoteFilePath);
			sftp.get(fileName, filePath);
			// 下载文件后关闭连接
			if (sftp != null) {
				try {
					if (sftp.getSession() != null) {
						sftp.getSession().disconnect();
						LOGGER.info("下载文件后关闭session连接");
					}
				} catch (JSchException e) {
					e.printStackTrace();
				}
				sftp.disconnect();
				LOGGER.info("下载文件后关闭sftp连接");
			}
			return true;
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return false;
		}
	}

	/**
	 * 设置数据流为解密模式
	 * @param des3Key
	 * @param inputStream
	 * @return
	 */
	public static CipherInputStream decryptMode(String ufxCustomerId,
			InputStream inputStream) {
		// MerchantTpp tpp = Global.getMerchantTpp(ufxCustomerId);
		// String des3Key = JsonUtil.get(tpp.getReserve(), "fileDes3Key");
		String des3Key = "192837464637281964738291";
		// 生成密钥
		SecretKey deskey = new SecretKeySpec(des3Key.getBytes(), ALGORITHM); // 解密
		return decryptMode(deskey, inputStream);
	}

	/**
	 * 设置数据流为解密模式
	 * @param secretKey
	 * @param inputStream
	 * @return
	 */
	public static CipherInputStream decryptMode(SecretKey secretKey,
			InputStream inputStream) {
		try {
			Cipher c1 = Cipher.getInstance(ALGORITHM);
			c1.init(Cipher.DECRYPT_MODE, secretKey);
			return new CipherInputStream(inputStream, c1);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取文件流
	 * @param remoteFilePath 文件路径
	 * @param fileName  文件名
	 */
	public InputStream getFileStream(String remoteFilePath, String fileName) {
		InputStream in = null;
		LOGGER.info("读取sftp对账文件输入流：" + fileName);
		try {
			ChannelSftp sftp = connect();
			sftp.cd(remoteFilePath);
			in = sftp.get(fileName);
			
			// 下载文件后关闭连接
			if (sftp != null) {
				try {
					if (sftp.getSession() != null) {
						sftp.getSession().disconnect();
						LOGGER.info("下载文件后关闭session连接");
					}
				} catch (JSchException e) {
					e.printStackTrace();
				}
				sftp.disconnect();
				LOGGER.info("下载文件后关闭sftp连接");
			}
		} catch (Exception e) {
			LOGGER.error("读取sftp输入流异常：", e);
		}
		return in;
	}

}
