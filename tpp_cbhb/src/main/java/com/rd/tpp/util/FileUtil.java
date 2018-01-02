package com.rd.tpp.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 文件工具类   生成txt文件放入本地data下面用于交互
 * @date 2017年6月7日
 */
public class FileUtil {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);
	private static final String FILESER_TYPE = TppPropertyUtil.getMessage("cbhb_fileser_type");
	/**
	 * 根据文件路径的绝对路径创建文件--单层  
	 * @date 2017年6月7日
	 * @param dir
	 */
	public static void createSingleFile(String dir) {
		try {
			File dirPath = new File(dir);//
			if (!dirPath.exists()) {
				dirPath.mkdir();
			}
		} catch (Exception e) {
			LOGGER.error("创建目录操作出错:{} " , e.getMessage());
		}
	}
	
	/**
	 * 创建文件夹--多层  
	 * @date 2017年6月7日
	 * @param dir
	 * @return
	 */
	public static boolean createMultilayerFile(String dir) {
		try {
			File dirPath = new File(dir);
			if (!dirPath.exists()) {
				dirPath.mkdirs();
			}
		} catch (Exception e) {
			LOGGER.error("创建多层目录操作出错: {}" , e.getMessage());
			return false;
		}
		return true;
	}
	
	
	/**
	 * 创建新的文件   若不存在  则创建一个
	 * @date 2017年6月7日
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static boolean createFile(String path) throws Exception {
		boolean flag = false;
		try {
			int lastLength = path.lastIndexOf("/");
			// 得到文件夹目录
			String dir = path.substring(0, lastLength);
			// 得到路径之后,先创建文件夹
			if (createMultilayerFile(dir) == true) {
				File filePath = new File(path);
				if (!filePath.exists()) {
					filePath.createNewFile();
				}
			}
		} catch (Exception e) {
			LOGGER.error("写入文件报错" + e.toString());
		}
		return flag;
	}
	
	/**
	 * 写入txt文件
	 * @date 2017年6月7日
	 * @param content
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static boolean writeTxtFile(String content, String path)
			throws Exception {
		boolean flag = false;
		FileOutputStream o = null;
		File fileName = new File(path);
		try {
			o = new FileOutputStream(fileName);
			o.write(content.getBytes("GBK"));
			o.close();
			flag = true;
		} catch (Exception e) {
			LOGGER.error("写入文件报错"+e.toString());
		}
		return flag;
	} 
	
	/** 
	 * 删除单个文件 
	 * @param   sPath    被删除文件的文件名 
	 * @return 单个文件删除成功返回true，否则返回false 
	 */  
	public static boolean deleteFile(String sPath) {  
	    boolean flag = false;  
	    File file = new File(sPath);  
	    // 路径为文件且不为空则进行删除  
	    if (file.isFile() && file.exists()) {  
	        file.delete();  
	        flag = true;  
	    }  
	    return flag;  
	}  
	
	
	/**
	 * 应用于渤海银行文件类  本地生成临时文件然后FTP上传到对方服务器
	 * @date 2017年6月7日
	 * @param path
	 * @param okPath
	 * @param txtContent
	 * @param fileName
	 * @param okFileName
	 * @return
	 */
	public static boolean createFileFTPToClient(String path,String okPath,String txtContent,String fileName,String okFileName){
		boolean uploadFlag  = false;
		try {
			path = getRootPath() + path;
			okPath = getRootPath() + okPath;
			LOGGER.info("path:{},okPath:{},fileName:{},okFileName:{}", path, okPath, fileName, okFileName);
			// 1-获取项目根目录 然后处理path和Okpath
			FileUtil.createFile(path);
			FileUtil.writeTxtFile(txtContent, path);
			FileUtil.createFile(okPath);
			FileUtil.writeTxtFile(StringUtils.EMPTY, okPath);
			
			// 为了避免多次连接关闭sftp，文件和OK文件一起上传
			String[][] fileList = new String[2][];
			String[] pathDetail = new String[2];
			pathDetail[0] = path;
			pathDetail[1] = fileName;
			fileList[0] = pathDetail;
			
			String[] okPathDetail = new String[2];
			okPathDetail[0] = okPath;
			okPathDetail[1] = okFileName;
			fileList[1] = okPathDetail;
			
			// 上传接口数据文件
//			uploadFlag = FileUtil.uploadFileToServ(path, fileName);
//			if (uploadFlag) {// 上传成功后 上传.ok标志文件
//				boolean uploadOkFlag = FileUtil.uploadFileToServ(okPath,
//						okFileName);
//				if (!uploadOkFlag) {
//					uploadFlag = false;
//				}
//			}
			uploadFlag = FileUtil.uploadFileToServ(fileList);
			
		} catch (Exception e) {
			LOGGER.error("创建文件失败,{}",e.toString());
		}
		return uploadFlag;
	}
	
	/**
	 * TODO 将文件上传到sftp
	 * @param fileList
	 * @return
	 * @author zza@erongdu.com
	 * @since 2017年6月19日 上午10:43:03
	 */
	private static boolean uploadFileToServ(String[][] fileList){
		boolean uploadFlag  = false;
		if ("1".equalsIgnoreCase(FILESER_TYPE)) { // sftp
			SftpUtil sftpUtil = SftpUtil.getInstance();
			uploadFlag = sftpUtil.uploadFile(fileList);
		} else { // ftp
			FtpUtil ftpUtil = FtpUtil.getInstance();
			uploadFlag = ftpUtil.uploadFile(fileList);
		}
		return uploadFlag;
	}
	
	/**
	 * 下载结果文件 到本地的指定路径
	 * @date 2017年6月7日
	 * @param filePath  本地存放路径
	 * @param remoteFilePath  远程的文件路径
	 * @param fileName  结果文件名称
	 */
	public static boolean  downloadResultFile(String filePath, String remoteFilePath, String fileName){
		filePath = getRootPath() + filePath;
//		FtpUtil ftp = FtpUtil.getInstance();
//		return ftp.downLoadFile(filePath, remoteFilePath, fileName);
		boolean uploadFlag  = false;
		if ("1".equalsIgnoreCase(FILESER_TYPE)) { // sftp
			SftpUtil sftpUtil = SftpUtil.getInstance();
			uploadFlag = sftpUtil.download(filePath, remoteFilePath, fileName);
		} else { // ftp
			FtpUtil ftp = FtpUtil.getInstance();
			return ftp.downLoadFile(filePath, remoteFilePath, fileName);
		}
		return uploadFlag;
		
	}
	
	/**
	 * 根据文件路径获取txt文件内容(一行一行读取)   返回每行以","逗号分隔的字符串
	 * @date 2017年3月13日
	 * @return
	 */
	public static String readTxtFile(String filePath){
		filePath = getRootPath() + filePath;
		LOGGER.info("下载文件路径：" + filePath);
		StringBuilder sb = new StringBuilder();
		String  encoding = "GBK";
		try {
			File file = new File(filePath);
			if(file.isFile() && file.exists()){ //判断文件是否存在
				InputStreamReader read = new InputStreamReader( new FileInputStream(file),encoding);//考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                	LOGGER.info(lineTxt);
                	sb.append(lineTxt).append(",");
                }
                read.close();
			}else{
				LOGGER.error("系统找不到指定的文件");
			}
		} catch (Exception e) {
			LOGGER.error("读取文件内容错误");
		}
		return sb.toString();
	}
	
	/**
	 * 获取第一行和其他行的信息 放入map
	 * @date 2017年6月7日
	 * @param filePath
	 * @return
	 */
	public static Map<String,Object> getContent(String filePath){
		Map<String,Object> map  = new HashMap<String,Object>();
		String txtContent = readTxtFile(filePath);
		if(txtContent.length()>0){
			int length = txtContent.lastIndexOf(",");
			txtContent = txtContent.substring(0,length);
			LOGGER.info("读取出来的内容：{}",txtContent);
			String[] content = txtContent.split(",");//最后一项是空字符串，过滤掉
			LOGGER.info("数组内容：{},{}",content[0],content[content.length-1]);
			String firstContent = StringUtils.EMPTY;
			StringBuilder other = new StringBuilder();
			String[] otherContent = new String[content.length-1];
			for (int i = 0; i < content.length; i++) {
				firstContent = content[0];//第一行
				if(i > 0 ){
					otherContent[i-1] = content[i];
					other.append(content[i]).append(",");
				}
			}
			LOGGER.info("第一行:{},剩下内容：{}",firstContent,other);
			map.put("firstContent", firstContent);
			map.put("otherContent", otherContent);
			
			
		}

		return map;
	}
	
	
	/**
	 * 下载result文件到本地 然后读取里面的内容 放入map中
	 * @date 2017年6月7日
	 * @param fileName
	 * @param filePath
	 * @return
	 */
	public static Map<String,Object> getResultFileContent(String filePath, String remotePath, String fileName){
		//1、FTP下载result文件到本地
		LOGGER.info("filePath:" + filePath);
		LOGGER.info("remotePath:" + remotePath);
		LOGGER.info("fileName:" + fileName);
		boolean download = downloadResultFile(filePath, remotePath, fileName);
		LOGGER.info("下载是否成功：{}",download);
		
		//2、读取文件中的内容 放入对象中
		return getContent(filePath + fileName);
	}
	
	/**
	 * 获取rootPath
	 * @date 2017年6月7日
	 * @return
	 */
	public static String getRootPath(){
        // 如果已经在配置文件配置root_path,则直接返回
        String configRootPath = TppPropertyUtil.getMessage("root_path");// 配置的rootPath
        if (org.apache.commons.lang3.StringUtils.isNotBlank(configRootPath)) {
            return configRootPath;
        }
        String rootPath = FileUtil.class.getClassLoader().getResource("").getPath();
		if(rootPath.contains("WEB-INF")){//获取classPath 根据本地和tomcat下的不同进行处理 获取根目录下的data路径
			rootPath = rootPath.replace("/WEB-INF/classes/",StringUtils.EMPTY);
		}else if(rootPath.contains("target")){
			rootPath = rootPath.replace("/target/classes/",StringUtils.EMPTY)+"/src/main/webapp";
		}
		LOGGER.info("项目根目录：{}",rootPath);
		return rootPath;
	}
}
