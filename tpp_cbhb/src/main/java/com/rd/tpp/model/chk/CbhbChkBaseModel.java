/**
* 互联网金融交易系统ifaes (Internet Finance  Assets  Exchange  System)
 * Copyright (c) 2016 杭州融都科技股份有限公司 版权所有
 */
package com.rd.tpp.model.chk;

import java.io.Serializable;
import java.util.Date;

import com.rd.tpp.util.DateUtils;

/**
 * 对账类的基类
 * @version 3.0
 * @author QianPengZhan
 * @date 2017年3月15日
 */
@SuppressWarnings("serial")
public class CbhbChkBaseModel implements Serializable{
	
	/**
	 * 本地存放绝对路径
	 */
	public String getReSultFilePath(Date time){
		return "/data/files/chk/" + DateUtils.formatDate(time, DateUtils.DATEFORMAT_STR_yyyyMMdd) + "/";
	}
	
	/**
	 * 本地存放绝对路径
	 */
	public String getReSultFilePath(Date time, String fileName){
		return "/data/files/chk/" + DateUtils.formatDate(time, DateUtils.DATEFORMAT_STR_yyyyMMdd) + "/" + fileName;
	}
	
	/**
	 * FTP远程下载的文件夹路径
	 */
	public String getRemotePath(Date time){
//		return File.separator + "CHK" + File.separator
//				+ DateUtils.formatDate(time, DateUtils.DATEFORMAT_STR_yyyyMMdd) + File.separator;
		return "CHK/" + DateUtils.formatDate(time, DateUtils.DATEFORMAT_STR_yyyyMMdd) + "/";
	}
}
