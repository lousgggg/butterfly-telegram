package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.val;
import org.springframework.ui.ModelMap;
import com.luo.wiley.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wiley.luo on 2019/3/8
 */
@RestController
@RequestMapping(value = "user")
@Api(value = "User管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("index")
    @ApiOperation(value = "获取用户", notes = "接口描述，例如：只能输入‘罗帅哥’")
    @ApiImplicitParam(paramType = "query", name = "name", value = "姓名", required = true, dataType = "String", defaultValue = "罗帅哥")
    public String index(@RequestParam String name) {
        String id = "38387aeeb2fe11e7bbedecf4bbc53460";
        User user = userService.get(id);
        ExecutorService executorService = Executors.newCachedThreadPool();
        return user.getLoginMobile();
//        return null;
    }
}