package com.rd.tpp.util;

import org.apache.logging.log4j.LogManager;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.*;

/**
 * TODO xml 帮助类
 * 
 * @author zza@erongdu.com
 * @version v1.0
 * @since 2017年6月20日 上午10:03:48
 */
public class XmlUtil {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(XmlUtil.class);

    private Element root = null;

	public XmlUtil() {
		super();
	}

	public XmlUtil(Document doc) {
		super();
		root = doc.getRootElement();
	}

	public XmlUtil(String xmlPath) {
		try {
			root = LoadFromFile(xmlPath).getRootElement();
		} catch (Exception e) {
			LOGGER.error("loadXml异常：", e);
		}
	}
	

	static XMLOutputter defOutp = null;
	static {
		defOutp = new XMLOutputter();
		Format format = Format.getRawFormat();
		format.setEncoding("UTF-8");
		defOutp.setFormat(format);
	}

	public Document getDoc() {
		return root.getDocument();
	}

	public String toString() {
		return getXmlStr();
	}

	public String getXmlStr() {
		XMLOutputter outp = defOutp;
		try {
			return outp.outputString(root.getDocument());
		} catch (Exception e) {
			LOGGER.error("xml信息输出异常：", e);
		}
		return "";
	}

	public static String getXmlStr(Element element) {
		XMLOutputter outp = defOutp;
		try {
			return outp.outputString(element);
		} catch (Exception e) {
			LOGGER.error("xml信息输出异常：", e);
		}
		return "";
	}

	public String getXmlStr(String encoding) {
		XMLOutputter outp = new XMLOutputter();
		Format format = Format.getCompactFormat();// .getPrettyFormat();
		format.setEncoding(encoding);
		outp.setFormat(format);
		try {
			return (outp.outputString(root.getDocument()));
		} catch (Exception e) {
			LOGGER.error("xml信息输出异常：", e);
		}
		return "";
	}

	public byte[] getXmlBytes(String encoding) {
		XMLOutputter outp = new XMLOutputter();
		Format format = Format.getCompactFormat();// .getPrettyFormat();
		format.setEncoding(encoding);
		outp.setFormat(format);
		try {
			ByteArrayOutputStream sw = new ByteArrayOutputStream();
			LOGGER.info("["+outp.outputString(root.getDocument())+"]");
			outp.output(root.getDocument(), sw);
			return sw.toByteArray();
		} catch (IOException e) {
			LOGGER.error("xml信息输出异常：", e);
		}
		return null;
	}


	/**
	 * 根据XML 字符�?建立JDom对象
	 * 
	 * @param xmlString
	 *            XML格式的字符串
	 * @return 返回建立的JDom对象，建立不成功返回null �?
	 */
	public static XmlUtil readFrom(String xmlString) {
		try {
			SAXBuilder builder = new SAXBuilder();
			Document anotherDocument = builder
					.build(new StringReader(xmlString));
			return new XmlUtil(anotherDocument);
		} catch (Exception e) {
			LOGGER.error("建立JDom对象异常：", e);
		}
		return null;
	}

	public static Document readFrom(byte[] b) {
		try {
			InputStream ip = new ByteArrayInputStream(b);
			SAXBuilder builder = new SAXBuilder();
			// 解析xml，生成Document
			Document doc = builder.build(ip);
			// 获得根节�?
			return doc;
		} catch (Exception e) {
			LOGGER.error("建立JDom对象异常：", e);
		}
		return null;

	}

	/**
	 * 读取XML文件�?��信息
	 */
	public static Document LoadFromFile(String path) throws Exception {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(path);
			return LoadFromStream(fi);
		} catch (Exception e) {
			LOGGER.error("文件加载错误:", e);
		} finally {
			try {
				fi.close();
			} catch (Exception e) {
				LOGGER.error("输入流关闭异常：", e);
			}
		}
		return null;
	}

	/**
	 * 读取XML文件�?��信息
	 */
	public static Document LoadFromStream(InputStream resourceAsStream)
			throws Exception {
		try {
			SAXBuilder sb = new SAXBuilder();
			Document doc = sb.build(resourceAsStream);
			return doc;
		} catch (Exception e) {
			LOGGER.error("流读取错：", e);
		} finally {
		}
		return null;
	}
	

	public Element getRoot() {
		return root;
	}

	public void setRoot(Element root) {
		this.root = root;
	}
}