package com.gupaoedu;

import com.gupaoedu.mapper.RoleMapper;
import com.gupaoedu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootOauthApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Test
    void findUserTest() {
        System.out.println(userMapper.findByUsername("admin"));
    }
    @Test
    void findRoleTest() {
        System.out.println(roleMapper.findByUid(1));
    }
}
