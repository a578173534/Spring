package com.ggs.dao.impl;

import com.ggs.dao.UserDao;
import com.ggs.domain.SysUser;

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("user插入到mysql数据库");
    }
}
