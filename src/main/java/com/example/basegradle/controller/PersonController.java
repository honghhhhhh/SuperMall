package com.example.basegradle.controller;

import com.example.basegradle.entity.Person;
import com.example.basegradle.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("/getPerson/{id}")
    public Person getPerson(@PathVariable("id") Integer id){
        return personMapper.getPerson(id);
    }

}
