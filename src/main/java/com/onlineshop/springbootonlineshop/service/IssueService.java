package com.onlineshop.springbootonlineshop.service;


import com.onlineshop.springbootonlineshop.entity.Issue;

import java.util.List;


public interface IssueService {

    public List<Issue> findAll();

    public void register(Issue issue, String account);

}
