package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.domain.Movie;
import com.luo.wiley.springbootdemo.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wiley.luo on 2019/3/8
 */
@RestController
@RequestMapping(value = "movie")
@Api(value = "Movie管理")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("movies")
    @ApiOperation(value = "获取用户", notes = "接口描述，例如：只能输入‘罗帅哥’")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "页数", required = true, dataType = "Integer", defaultValue = "0"),
            @ApiImplicitParam(paramType = "query", name = "pageNumber", value = "每页数量", required = true, dataType = "Integer", defaultValue = "20")
    })
    public Page<Movie> index(@RequestParam Integer page, @RequestParam Integer pageNumber) {
//        ExecutorService executorService = Executors.newCachedThreadPool();

        return movieService.findPage(page, pageNumber);
    }
}