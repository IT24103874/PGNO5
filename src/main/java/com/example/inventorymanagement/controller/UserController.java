package com.example.inventorymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {



    @GetMapping("/index.html")
    public String indexShow(){
        return "index"; //returns the index String into that
    }
}