package com.cc.tspring.dao;

import com.cc.tspring.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void addOneUser(User user);

    List<User> selectAll();


}
