package com.liger.ambition.controller;

import com.liger.ambition.model.User;
import com.liger.ambition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by roc_peng on 2017/8/15.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String home(){
        return "index";
    }

    @RequestMapping("/query/{id}")
    @ResponseBody
    public User queryUser(@PathVariable("id") String id,@RequestParam(value = "address",required = false)String address){
        System.out.println(address);
        User user = userService.queryUserById(id);
        return user;
    }

    @RequestMapping("/select/{id}")
    @ResponseBody
    public User selectUser(@PathVariable("id") Integer id){
        User user = userService.selectUserById(id);
        return user;
    }

}
