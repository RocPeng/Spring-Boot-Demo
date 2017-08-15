package com.liger.ambition.service;

import com.liger.ambition.mapper.UserMapper;
import com.liger.ambition.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by roc_peng on 2017/8/15.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUser(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> queryAll(){
        return userMapper.selectAll();
    }
}
