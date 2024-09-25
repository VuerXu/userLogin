package com.jj.jj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jj.jj.model.domain.User;
import com.jj.jj.service.UserService;
import com.jj.jj.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author xujiaojiao
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-09-22 19:01:07
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




