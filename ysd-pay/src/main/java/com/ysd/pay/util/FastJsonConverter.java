package com.ysd.pay.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FastJsonConverter extends FastJsonHttpMessageConverter {

	private final static Logger LOGGER = LogManager.getLogger(FastJsonConverter.class);

	@Override
	protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		InputStream in = inputMessage.getBody();

		byte[] buf = new byte[1024];//是否加密  解密
		for (;;) {
			int len = in.read(buf);
			if (len == -1) {
				break;
			}

			if (len > 0) {
				baos.write(buf, 0, len);
			}
		}

		byte[] bytes = baos.toByteArray();
		return JSON.parseObject(bytes, 0, bytes.length, getCharset().newDecoder(), clazz);
	}

	@Override
	protected void writeInternal(final Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
		// QuoteFieldNames———-输出key时是否使用双引号,默认为true
		// WriteMapNullValue——–是否输出值为null的字段,默认为false
		// WriteNullNumberAsZero—-数值字段如果为null,输出为0,而非null
		// WriteNullListAsEmpty—–List字段如果为null,输出为[],而非null
		// WriteNullStringAsEmpty—字符类型字段如果为null,输出为”“,而非null
		// WriteNullBooleanAsFalse–Boolean字段如果为null,输出为false,而非null

		
		String text = JSON.toJSONString(obj,getFeatures());
		//LOGGER.debug("result json:{}",text);
		byte[] bytes = text.getBytes(getCharset());
		outputMessage.getHeaders().setContentLength(bytes.length);
		OutputStream out = outputMessage.getBody();
		out.write(bytes);
	}

}
