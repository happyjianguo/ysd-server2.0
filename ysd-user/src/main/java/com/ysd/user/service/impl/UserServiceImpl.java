package com.ysd.user.service.impl;

import com.ysd.user.criteria.UserCriteria;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import com.ysd.user.exception.UserException;
import com.ysd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author xishengchun on 2017-09-10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(String mobile, String password) {
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.or()
                .andPhoneEqualTo(mobile)
                .andPasswordEqualTo(password)
        ;
        List<User> users = userMapper.selectByCriteria(userCriteria);
        boolean empty = CollectionUtils.isEmpty(users);

        if (empty) {
            throw new UserException("用户或者密码错误")
                    .set("mobile", mobile)
                    .set("password", password)
                    ;
        }
        if (users.size() > 1) {
            throw new UserException("存在多个用户")
                    .set("mobile", mobile)
                    .set("password", password)
                    ;
        }

        return users.get(0);
    }

    public User queryByPhone(String phone,int typeId){

        UserCriteria userCriteria = new UserCriteria();
        userCriteria.or()
                .andPhoneEqualTo(phone)
                .andTypeIdEqualTo(typeId)
        ;
        List<User> users = userMapper.selectByCriteria(userCriteria);
        if(users==null || users.size()==0){
            return null;
        }
        return users.get(0);
    }

    public User queryById(Integer userId){
        return userMapper.selectById(userId);
    }
}
