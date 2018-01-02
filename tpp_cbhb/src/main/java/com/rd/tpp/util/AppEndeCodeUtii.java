package com.rd.tpp.util;

import org.apache.commons.net.util.Base64;
import org.apache.logging.log4j.LogManager;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.Key;

/**
 * APP加解密工具类
 * 
 * @author wyw
 * 
 */
public class AppEndeCodeUtii {

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(AppEndeCodeUtii.class);


    String plainText;// 拼接的json字符串
	/*
	 * String encText = AES_Encrypt(keyStr , plainText); encText =
	 * URLEncoder.encode(encText,"utf-8");
	 */

	private final static String keyStr ="cbhb&virtu%@)000";
	private final static String AESTYPE = "AES/ECB/PKCS5Padding";

	private static Key generateKey(String key) throws Exception {
		try {
			SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
			return keySpec;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// 加密
	public static String AES_Encrypt(String plainText) {

		byte[] encrypt = null;

		try {

			Key key = generateKey(keyStr);

			Cipher cipher = Cipher.getInstance(AESTYPE);

			cipher.init(Cipher.ENCRYPT_MODE, key);

			encrypt = cipher.doFinal(plainText.getBytes());

		} catch (Exception e) {

			e.printStackTrace();

		}
		String ret =new String(Base64.encodeBase64(encrypt));
		try {
			ret=URLEncoder.encode(ret,"utf-8");
		} catch (UnsupportedEncodingException e) {
			LOGGER.info("渤海APP请求参数加密失败");
		}
		return ret;
	}

	/**
	 * 解密操作
	 * 
	 * @param encryptData
	 * @param encryptData
	 * @return
	 */
	public static String AES_Decrypt(String encryptData) {
		byte[] decrypt = null;
		try {
			Key key = generateKey(keyStr);
			Cipher cipher = Cipher.getInstance(AESTYPE);
			cipher.init(Cipher.DECRYPT_MODE, key);
			decrypt = cipher
					.doFinal(Base64.decodeBase64(encryptData.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String(decrypt).trim();
	}

	public static void main(String[] args) {
		/*String encText = AES_Encrypt(keyStr , plainText);
		encText = URLEncoder.encode(encText,"utf-8");
*/
		

	}

}
