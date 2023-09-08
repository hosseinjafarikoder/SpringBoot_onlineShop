package com.onlineshop.springbootonlineshop.repository;


import com.onlineshop.springbootonlineshop.entity.User;

import java.util.List;


public interface UserRepository {

    public void register(User user, String roleName);

    public List<User> findAll();

}
