package com.luo.wiley.springbootdemo.mapper;

import com.luo.wiley.springbootdemo.domain.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {

    List<Movie> findAll();
}
