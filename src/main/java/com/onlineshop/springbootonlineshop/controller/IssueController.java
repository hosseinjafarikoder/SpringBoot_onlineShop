package com.onlineshop.springbootonlineshop.controller;

import com.onlineshop.springbootonlineshop.entity.Issue;
import com.onlineshop.springbootonlineshop.security.UserPrincipal;
import com.onlineshop.springbootonlineshop.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @GetMapping("/issues/")
    public String list(Model model) {
        List<Issue> issues = issueService.findAll();
        model.addAttribute("issues", issues);
        return "issue/list";
    }

    @GetMapping("/issue/new")
    public String newIssue() {
        return "issue/newIssue";
    }

    @PostMapping("/issues/")
    public String create(Issue issue, @AuthenticationPrincipal UserPrincipal userPrincipal) {
        issueService.register(issue, userPrincipal.getUsername());
        return "redirect:/issues/";
    }
}
