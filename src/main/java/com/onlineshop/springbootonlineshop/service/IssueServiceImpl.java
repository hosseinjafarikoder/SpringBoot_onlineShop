package com.onlineshop.springbootonlineshop.service;


import com.onlineshop.springbootonlineshop.entity.Issue;
import com.onlineshop.springbootonlineshop.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;

    @PreAuthorize("hasAuthority('readIssue')")
    @Transactional(readOnly = true)
    public List<Issue> findAll() {
        return issueRepository.findAll();
    }

    @PreAuthorize("hasAuthority('writeIssue')")
    @Transactional
    public void register(Issue issue, String account) {
        issueRepository.register(issue, account);
    }
}
