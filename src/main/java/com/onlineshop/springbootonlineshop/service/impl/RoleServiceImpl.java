package com.onlineshop.springbootonlineshop.service.impl;

import com.onlineshop.springbootonlineshop.entity.Role;
import com.onlineshop.springbootonlineshop.repository.RoleRepository;
import com.onlineshop.springbootonlineshop.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public Role saveOrUpdate(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
