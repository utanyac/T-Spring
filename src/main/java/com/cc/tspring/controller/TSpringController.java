package com.cc.tspring.controller;

import com.cc.tspring.entity.TSpring;
import com.cc.tspring.service.impl.TSpringServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TSpringController {

    @Autowired
    private TSpringServiceImpl tSpringService;

    @GetMapping("/tspring/listAll")
    public List<TSpring> listAll() {
        return tSpringService.selectAll();
    }

}
