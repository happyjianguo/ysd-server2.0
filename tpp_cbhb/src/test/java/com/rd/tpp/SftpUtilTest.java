package com.rd.tpp;

import com.rd.tpp.util.SftpUtil;
import org.junit.Test;

/**
 * @author xishengchun on 2017-09-16.
 */
public class SftpUtilTest {

    @Test
    public void testDownload() {
        SftpUtil instance = SftpUtil.getInstance();
        String filePath = "/Users/xishengchun/git/ysd2.0/ysd-task/logs";
        String remoteFilePath = "/20170916";
        String fileName = "test";

        instance.download(filePath, remoteFilePath, fileName);
    }

}
