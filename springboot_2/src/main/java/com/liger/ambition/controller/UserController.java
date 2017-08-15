package com.liger.ambition.controller;

import com.github.pagehelper.PageHelper;
import com.liger.ambition.model.User;
import com.liger.ambition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by roc_peng on 2017/8/15.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> getAll(User user){
        if (user.getPage() != null && user.getRows() != null) {
            PageHelper.startPage(user.getPage(), user.getRows());
        }
        return userService.queryAll();
    }

    @RequestMapping("/query/{id}")
    @ResponseBody
    public User queryUser(@PathVariable("id") Integer id){
        return userService.queryUser(id);
    }

}
