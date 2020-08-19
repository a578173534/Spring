package com.ggs.service.impl;

import com.ggs.dao.UserDao;
import com.ggs.domain.SysUser;
import com.ggs.service.UserService;

public class UserServiceImpl implements UserService {

    //引用类型， 在xml文件给属性赋值， 要求属性需要有set方法
    private UserDao dao = null;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {
        // 调用dao方法
        dao.insertUser(user);
    }
}
