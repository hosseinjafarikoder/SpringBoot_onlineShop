package com.onlineshop.springbootonlineshop.service.impl;

import com.onlineshop.springbootonlineshop.entity.User;
import com.onlineshop.springbootonlineshop.repository.UserRepository;
import com.onlineshop.springbootonlineshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void register(User user, String roleName) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.register(user, roleName);
    }

    @PreAuthorize("hasAuthority('manageUser')")
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
