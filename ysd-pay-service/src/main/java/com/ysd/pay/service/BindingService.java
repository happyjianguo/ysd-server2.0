package com.ysd.pay.service;

import com.ysd.account.entity.AccountBank;
import com.ysd.user.entity.User;

/**
 * 存管绑定
 * Created by yujian on 2017/9/11.
 */
public interface BindingService {



    int bindCardNotify(User user, AccountBank accountBank);



    int bindUpdateRealStatus(Integer id);

    int bindUpdateRealStatus(Integer userId, String mtpSignNum);
}
