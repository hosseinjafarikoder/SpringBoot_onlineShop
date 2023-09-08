package com.onlineshop.springbootonlineshop.controller;

import com.onlineshop.springbootonlineshop.entity.User;
import com.onlineshop.springbootonlineshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class SignupController {

    private final UserService userService;

    @GetMapping("/signup")
    public String index() {
        return "signup/index";
    }

    @PostMapping("/signup")
    public String signup(User user, @RequestParam("role") String roleName) {
        userService.register(user, roleName);
        return "redirect:/login";
    }
}
