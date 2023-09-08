package com.onlineshop.springbootonlineshop.repository;


import com.onlineshop.springbootonlineshop.entity.Issue;

import java.util.List;


public interface IssueRepository {

    public List<Issue> findAll();

    public void register(Issue issue, String account);
}
