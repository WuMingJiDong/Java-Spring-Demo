package cn.edu.hbsi.controller;

import cn.edu.hbsi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("UserController")
public class UserController
{
//    @Resource(name = "UserService")
    @Autowired
    private UserService userService;

    public UserController(){
        System.out.println("UserController无参构造");
    }

    public void save(){
        System.out.println("UserController---save()");
        userService.save();
    }
}