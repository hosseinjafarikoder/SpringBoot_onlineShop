package com.onlineshop.springbootonlineshop.service;


import com.onlineshop.springbootonlineshop.entity.User;

import java.util.List;


public interface UserService {

    public void register(User user, String roleName);

    public List<User> findAll();

}
