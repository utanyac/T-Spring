package com.cc.tspring.dao;

import com.cc.tspring.entity.TSpring;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TSpringMapper {
    List<TSpring> selectAll();
}
