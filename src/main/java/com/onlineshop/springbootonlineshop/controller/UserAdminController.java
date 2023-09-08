package com.onlineshop.springbootonlineshop.controller;

import com.onlineshop.springbootonlineshop.entity.User;
import com.onlineshop.springbootonlineshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class UserAdminController {

    private final UserService userService;

    @GetMapping("/users/")
    public String list(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "userAdmin/list";
    }

}
