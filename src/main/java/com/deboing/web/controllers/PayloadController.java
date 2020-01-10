package com.deboing.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayloadController {

    public static final String PAYLOAD_VIEW_NAME = "payload/payload";



    @RequestMapping("/payload")
    public String getPayloadPage(){
        return  PAYLOAD_VIEW_NAME;
    }
}
