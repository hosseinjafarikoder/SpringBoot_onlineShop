package com.onlineshop.springbootonlineshop.service;


import com.onlineshop.springbootonlineshop.entity.Role;
import com.onlineshop.springbootonlineshop.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RoleService {
    Role saveOrUpdate(Role role) ;

    void deleteById(Long id);

    Role findById(Long id);

    List<Role> findAll();
}
