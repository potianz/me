package com.zyh.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class JasyptController {

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private  String password;
    @GetMapping("/jasypt")
    public String jasypt(){
        return username+"\t"+password;
    }
}
