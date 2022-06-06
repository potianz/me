package com.zyh.controller;

import com.zyh.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {

    @Autowired
    private JpaService service;

    @GetMapping("/jpa")
    private String Jap(){
        return service.jpa().toString();
    }
}
