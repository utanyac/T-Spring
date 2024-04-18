package com.cc.tspring.service.impl;

import com.cc.tspring.dao.TSpringMapper;
import com.cc.tspring.entity.TSpring;
import com.cc.tspring.service.TSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSpringServiceImpl implements TSpringService {
    @Autowired
    private TSpringMapper tSpringMapper;

    public List<TSpring> selectAll() {
        return tSpringMapper.selectAll();
    }



}
