package com.zyh.service.Impl;

import com.zyh.entry.FoodEntry;
import com.zyh.repositiony.JpaRepositiony;
import com.zyh.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;

public class JapServiceImpl implements JpaService {

    @Autowired
    private JpaRepositiony jpaRepositiony;
    @Override
    public FoodEntry jpa(){
        return jpaRepositiony.getReferenceById(1L);
    }
}
