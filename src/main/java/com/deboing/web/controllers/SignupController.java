package com.deboing.web.controllers;


import com.deboing.backend.persistence.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignupController {


    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public String signup(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "registration/signup";
    }


}
