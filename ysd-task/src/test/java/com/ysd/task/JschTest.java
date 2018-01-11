package com.ysd.task;


/**
 * @author xishengchun on 2017-09-15.
 */
public class JschTest {
/*
    private Logger logger = LogManager.getLogger(JschTest.class);

    private String privateKey = "/Users/xishengchun/.ssh/id_rsa";

    private String passphrase = "139.196.88.8";

    private String username = "ysdsftp";

    private String password = "ysd@123456";

    private String host = "139.196.88.8";

    private int port = 22;

//    @Test
    public void testSftp() {
        JSch jsch = new JSch();
        Channel channel = null;

        try {
            if(StringUtils.isNotBlank(privateKey)) {
                if(StringUtils.isNotBlank(passphrase)) {
                    jsch.addIdentity(privateKey, passphrase);
                } else {
                    jsch.addIdentity(privateKey);
                }
            }

            Session e = jsch.getSession(username, host, port);
            if(e == null) {
                throw new Exception("sftp session is null,please check config");
            }



            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            e.setConfig(sshConfig);
            e.setTimeout(10000);
            e.setServerAliveInterval(92000);
            e.connect(1000000);
            logger.info("创建sftp连接成功");
            channel = e.openChannel("sftp");
            channel.connect();
            ChannelSftp channelSftp = (ChannelSftp)channel;
            String lpwd = channelSftp.lpwd();
            Vector ls = channelSftp.ls("./");
            Object o = ls.get(0);
            logger.info("lpwd:{} ls:{} o:{}", lpwd, ls.size(), o);
        } catch (Exception e) {
            logger.error("", e);
        }
    }


//    @Test
    public void testSftp2() {
        String filePath = "/Users/xishengchun/git/ysd2.0/ysd-task/pom.xml";
        String remoteFilePath = "/home/sftp";
        String fileName = "test.txt";
        SftpUtil instance = SftpUtil.getInstance();
        instance.download(filePath, remoteFilePath, fileName);
        String sftpUsername = TppPropertyUtil.getMessage("sftp_username");
        logger.debug("sftpUsername:{}", sftpUsername);
    }

    */
}
