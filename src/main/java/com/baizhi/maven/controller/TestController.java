package com.baizhi.maven.controller;

import com.baizhi.maven.entity.User;
import com.baizhi.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("test")
    public String test(HttpServletRequest request){
        List<User> users = userService.seletAll();
        request.setAttribute("users",users);
        return "index";
    }

    @RequestMapping("test2")
    @ResponseBody
    public List<User> test2(){
        List<User> users = userService.seletAll();
        return users;
    }
}
