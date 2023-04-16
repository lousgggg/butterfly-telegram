package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.domain.User;
import com.luo.wiley.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wiley.luo on 2019/3/8
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("index")
    public String index(@RequestParam String name) {
        String id = "38387aeeb2fe11e7bbedecf4bbc53460";
        User user = userService.get(id);
        ExecutorService executorService = Executors.newCachedThreadPool();
        return user.getLoginMobile();
//        return null;
    }
}