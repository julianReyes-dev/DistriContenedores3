package com.example.distribuidos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hola")
public class PersonController {

    @GetMapping()    
    public String hola() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In justo mauris, condimentum eget risus nec, mattis tristique mauris. Ut risus massa, aliquet et consectetur eget, gravida sit amet sapien";
    }
    
}
