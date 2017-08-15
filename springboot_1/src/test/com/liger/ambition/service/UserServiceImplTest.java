package com.liger.ambition.service;

import com.liger.ambition.Springboot1Application;
import com.liger.ambition.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>八月 15, 2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Springboot1Application.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: queryUserById(String id)
     */
    @Test
    public void testQueryUserById() throws Exception {
        User user = userService.queryUserById("1");
        System.out.println(user);
    }

    /**
     * Method: insertUser(User user)
     */
    @Test
    public void testInsertUser() throws Exception {
    }

    @Test
    public void testSelectUserById() {
        User user = userService.selectUserById(1);
        System.out.println(user);
    }


} 
