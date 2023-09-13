package com.onlineshop.springbootonlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class LoginController {

    @GetMapping("/login")
//    public String index(Model model) {
    public String index() {

//        model.addAttribute("test","isisisi");

//        List<String> myList = Arrays.asList("one","two","three");
//        model.addAttribute("list",myList);
        return "login/th_index";
    }

}
