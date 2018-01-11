package com.java.b2cdemo;

import encryption.DataGramB2cUtil;

public class SignDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			
		//待签名的数据	
		String plain = "3336|20131015|1030|156|0|0|0|0|0|20131015|20131015183714098|3336|20131015|1030|156|0|0|0|0|0|20131015|20131015183714098|3336|20131015|1030|156|0|0|0|0|0|20131015|20131015183714098|"; 
		//签名后的信息
		String signed = DataGramB2cUtil.signature(plain);
		
		System.out.println(signed);
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
