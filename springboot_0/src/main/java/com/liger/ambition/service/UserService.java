package com.liger.ambition.service;

import com.liger.ambition.dao.UserRepositoty;
import com.liger.ambition.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by roc_peng on 2017/8/14.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }

}
