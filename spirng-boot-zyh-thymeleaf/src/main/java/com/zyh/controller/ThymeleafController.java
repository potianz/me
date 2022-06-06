package com.zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ThymeleafController {

    @RequestMapping("/ftl")
    public String thymeleaf(Model model){
        model.addAttribute("now",new Date().toString());
        return "index";
    }
}
