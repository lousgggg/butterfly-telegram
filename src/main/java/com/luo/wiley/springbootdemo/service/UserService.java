package com.luo.wiley.springbootdemo.service;

import com.luo.wiley.springbootdemo.domain.User;
import com.luo.wiley.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wiley.luo on 2019/3/8
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User get(String id) {
        // reactor demo
//        Flux.just()
       return userMapper.findUserById(id);
    }
}
