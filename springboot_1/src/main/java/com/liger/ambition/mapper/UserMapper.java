package com.liger.ambition.mapper;

import com.liger.ambition.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by roc_peng on 2017/8/15.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 分别采用注解和配置文件的
 */
@Repository
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findUserById(@Param("id") String id);

    @Insert("insert into user (username,birthday,sex,address) values " +
            "(#{user.username},#{user.birthday},#{user.sex},#{user.address})")
    boolean insertUser(User user);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
