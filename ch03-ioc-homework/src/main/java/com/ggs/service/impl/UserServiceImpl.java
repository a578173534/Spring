package com.ggs.service.impl;

import com.ggs.dao.UserDao;
import com.ggs.domain.SysUser;
import com.ggs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    //引用类型， 在xml文件给属性赋值， 要求属性需要有set方法
    //byType
    //@Autowired
    //@Qualifier("mysqlDao")
    @Resource(name = "oracleDao")
    private UserDao dao = null;

    //可以不需要
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {
        // 调用dao方法
        dao.insertUser(user);
    }
}
