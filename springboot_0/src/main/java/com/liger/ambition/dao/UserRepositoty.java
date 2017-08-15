package com.liger.ambition.dao;

import com.liger.ambition.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by roc_peng on 2017/8/14.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * User表操作接口
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Integer> {

    @Query("select t from User t where t.username = :username")
    User findByUserName(@Param("username") String username);
}
