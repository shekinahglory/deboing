package com.deboing.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrontroler {



    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
