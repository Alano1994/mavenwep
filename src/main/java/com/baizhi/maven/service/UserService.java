package com.baizhi.maven.service;

import com.baizhi.maven.entity.User;

import java.util.List;

public interface UserService {
    List<User> seletAll();
    int deleteById(Integer id);
}
