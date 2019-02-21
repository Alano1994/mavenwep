package com.baizhi.maven.dao;

import com.baizhi.maven.entity.User ;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
    int deleteById(Integer id);
}
