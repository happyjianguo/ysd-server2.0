package com.ysd.pay.service.impl;


import com.ysd.account.criteria.AccountBankCriteria;
import com.ysd.account.dao.AccountBankMapper;
import com.ysd.account.entity.AccountBank;
import com.ysd.base.exception.YsdException;
import com.ysd.pay.service.BindingService;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yujian on 2017/9/11.
 */
@Service("bindingService")
public class BindingServiceImpl implements BindingService {

    private static Logger LOG = LogManager.getLogger("paylogger");
    private static Logger log = LogManager.getLogger(BindingServiceImpl.class);

    @Autowired
    private AccountBankMapper accountBankMapper;
    @Autowired
    private UserMapper userMapper;





    /**
     * 注册绑卡回调
     * @param user
     * @param accountBank
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int bindCardNotify(User user, AccountBank accountBank) {
        AccountBankCriteria accountBankCriteria = new AccountBankCriteria();
        accountBankCriteria.or()
                .andUserIdEqualTo(user.getId());
        List<AccountBank> accountBankList = accountBankMapper.selectByCriteria(accountBankCriteria);
//        List<AccountBank> accountBankList = accountBankMapper.queryByUserId(user.getId());
        if (accountBankList.size() > 0) {
            if (accountBankList.size() == 1) {
                accountBank.setId(accountBankList.get(0).getId());
                accountBank.setModifyDate(new Date());
                this.accountBankMapper.updateById(accountBank);
            }else{
                return 1;
            }
        }else{
            this.accountBankMapper.insert(accountBank);
        }

        user.setModifyDate(new Date());
        userMapper.updateById(user);
        return 0;
    }


    /**
     * 注册绑卡回调
     * @param id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int bindUpdateRealStatus(Integer id ) {


        Map<String,Object> map= new HashMap<>();
        map.put("id",id);
        map.put("realStatus","1");
        map.put("oriRealStatus","2");
        int num= userMapper.updateByPhoneCode(map);
        if(num!=1){
            throw new YsdException("更新实名认证状态失败");
        }

        map= new HashMap<>();
        map.put("userId",id);
        map.put("status","1");
        map.put("oriStatus","2");
        num = accountBankMapper.updateByPhoneCode(map);
        if(num!=1){
            throw new YsdException("更新实名认证状态失败");
        }
        return num;
    }

    @Override
    @Transactional
    public int bindUpdateRealStatus(Integer userId, String mtpSignNum) {
        User user = new User();
        user.setId(userId);
        user.setMtpSignNum(mtpSignNum);
        userMapper.updateById(user);
        int i = this.bindUpdateRealStatus(userId);
        return i;
    }
}
