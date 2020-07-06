package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.domain.User;
import org.springframework.ui.ModelMap;
import com.luo.wiley.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wiley.luo on 2019/3/8
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("index")
    public String index(ModelMap map) {
        User user = userService.get("38387aeeb2fe11e7bbedecf4bbc53460");

        return user.getLoginName();
      }
}
