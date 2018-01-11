package com.rd.tpp.service;

import java.util.Map;

/**
 * 渤海app接口
 * @author wyw
 *
 */
public interface TppAppInterfaceService {
	/**
	 * 开户
	 * @param params
	 * @return
	 */
	Object tppAppRegister(Map<String, Object> params);
	/**
	 * 渤海银行 -- 修改银行卡
	 * @param params
	 * @return
	 */
	Object tppAppUpdateBankCard(Map<String, Object> params);
	/**
	 * 取现
	 * @param params
	 * @return
	 */
	 Object tppAppCash(Map<String, Object> params);
	/**
	 * 充值
	 * @param params
	 * @return
	 */
	Object tppAppRecharge(Map<String, Object> params);
}
