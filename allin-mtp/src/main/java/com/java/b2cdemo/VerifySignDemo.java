package com.java.b2cdemo;

import encryption.DataGramB2cUtil;

public class VerifySignDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		//待验签名的数据
		String plain = "3336|20131015|1030|156|0|0|0|0|0|20131015|20131015183714098|3336|20131015|1030|156|0|0|0|0|0|20131015|20131015183714098|3336|20131015|1030|156|0|0|0|0|0|20131015|20131015183714098|"; 
		//签名信息
		String signed = "aHzbdHFG6tAVnhFc5fRDXpApGyVejKtVSxtfUzINzuAxCkEL11A0d3L41AX6+CTV6fhvHgF4Xs+IA8HOay6nEHok5RPkV6OtibtIza75QwXOBfV4NYO5UnNufG2egjeLNfxUW9A2qttqNhm0T46Nb4LP81uCEzmIttA6XuyC9is=";
		//验签结果
		boolean flag = DataGramB2cUtil.verifySign(plain, signed);
		
		System.out.println(flag);
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
