package com.baizhi.maven.service.impl;


import com.baizhi.maven.dao.UserDao;
import com.baizhi.maven.entity.User;
import com.baizhi.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> seletAll() {
        List<User> users = userDao.selectAll();
        return users;
    }

    @Transactional
    public int deleteById(Integer id) {

        int i = userDao.deleteById(4);
        if(id==1){
            throw new RuntimeException("事务要回滚了");
        }
        return i;
    }
}
