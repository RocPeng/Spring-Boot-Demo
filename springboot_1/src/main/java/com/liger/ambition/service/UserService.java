package com.liger.ambition.service;

import com.liger.ambition.model.User;

/**
 * Created by roc_peng on 2017/8/15.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */

public interface UserService {

    User queryUserById(String id);
    User selectUserById(Integer id);

    boolean insertUser(User user);

}
