package com.jj.jj.service;

import com.jj.jj.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/*
用户服务测试
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;
    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("dogJj");
        user.setUserAccount("123account");
        user.setAvatarUrl("https://pic.code-nav.cn/user_avatar/18105964774995…ff66ba32f875a94479bc1b.jpg@1280w_1l_2o_100sh.webp");
        user.setGender(0);
        user.setUserPassword("123mm");
        user.setPhone("123tel");
        user.setEmail("@123");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }
}