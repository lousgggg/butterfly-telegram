package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.domain.User;
import com.luo.wiley.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wiley.luo on 2019/3/8
 */
@RestController
@RequestMapping(value = "user/")
public class UserController {

    @Autowired
     private UserService userService;

    @PostMapping("showName")
    public String showName(@RequestParam("id") String id) {
        User user = userService.get(id);
        return user.getLoginMobile();
      }
}
