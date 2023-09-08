package com.onlineshop.springbootonlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String index() {
        return "login/index";
    }


    @PostMapping("/testt")
    public String testt() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return "redirect:/";
    }

}
