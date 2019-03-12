package com.luo.wiley.springbootdemo.mapper;

import com.luo.wiley.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wiley.luo on 2019/3/8
 */

@Mapper
public interface UserMapper {

    User findUserById(String id);
}
