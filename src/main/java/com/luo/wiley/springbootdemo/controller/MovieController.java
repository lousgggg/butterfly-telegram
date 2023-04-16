package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.domain.Movie;
import com.luo.wiley.springbootdemo.service.MovieService;
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
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("movies")
    public Page<Movie> index(@RequestParam Integer page, @RequestParam Integer pageNumber) {
//        ExecutorService executorService = Executors.newCachedThreadPool();

        return movieService.findPage(page, pageNumber);
    }
}