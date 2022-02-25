package com.luo.wiley.springbootdemo.service;

import com.luo.wiley.springbootdemo.domain.Movie;
import com.luo.wiley.springbootdemo.mapper.MovieMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service("movieService")
public class MovieService {

    @Resource
    private MovieMapper movieMapper;

    public Page<Movie> findPage(Integer pageIndex, Integer pageNumber) {
        List<Movie> movies = movieMapper.findAll();
        List<Movie> movieList = movies.stream().skip((long) pageIndex * pageNumber).limit(20).collect(Collectors.toList());
        Page<Movie> page = new PageImpl<>(movieList, new PageRequest(pageIndex, pageNumber), movies.size());
        return page;
    }
}
