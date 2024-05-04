package com.cc.tspring.dao;

import com.cc.tspring.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void addOneUser(User user);


}
