package com.liger.ambition.controller;

import com.liger.ambition.model.User;
import com.liger.ambition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by roc_peng on 2017/8/14.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description /user/index 返回页面，/user/show返回数据
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
//    @ResponseBody
    public String root(){
//        return "Hello World!";
        return "welcome";
    }

    @RequestMapping("/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping("/show")
    @ResponseBody
    public User show(@RequestParam(name = "username") String username){
        User user = userService.findUserByName(username);
        return user;
    }

}
