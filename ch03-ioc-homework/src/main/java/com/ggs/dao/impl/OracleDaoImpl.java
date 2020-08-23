package com.ggs.dao.impl;

import com.ggs.dao.UserDao;
import com.ggs.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("oracle的insertUser");
    }
}
