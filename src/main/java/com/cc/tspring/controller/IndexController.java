package com.cc.tspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/tspring")
public class IndexController {

    @RequestMapping("/home")
    public String tspring(Model model) {
        model.addAttribute("title", "utanyac");
        model.addAttribute("content", "学习，学个屁!");
        return "home";
    }

    @RequestMapping("/addUser")
    public String user() {
        return "addUser";
    }

    @RequestMapping("/listUsers")
    public String users(){
        return "listUsers";
    }

}
