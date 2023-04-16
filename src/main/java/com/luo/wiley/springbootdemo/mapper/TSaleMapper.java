package com.luo.wiley.springbootdemo.mapper;

import com.luo.wiley.springbootdemo.domain.TSale;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TSaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSale record);

    int insertSelective(TSale record);

    TSale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSale record);

    int updateByPrimaryKey(TSale record);
}