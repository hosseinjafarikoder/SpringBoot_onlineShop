package com.onlineshop.springbootonlineshop.service.impl;


import com.onlineshop.springbootonlineshop.entity.User;
import com.onlineshop.springbootonlineshop.repository.UserRepository2;
import com.onlineshop.springbootonlineshop.service.UserService2;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService2Impl implements UserService2 {

    @Autowired
    private UserRepository2 userRepository;

    @Override
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
