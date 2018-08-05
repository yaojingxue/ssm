package com.study.service;

import com.study.mapper.UserMapper;
import com.study.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by acer on 2018/8/5.
 */
@Named
@Transactional
public class UserService {
    @Inject
    private UserMapper userMapper;
    public void save(User user){
        userMapper.save(user);
    }

}
