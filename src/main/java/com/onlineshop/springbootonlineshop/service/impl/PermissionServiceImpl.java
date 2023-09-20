package com.onlineshop.springbootonlineshop.service.impl;

import com.onlineshop.springbootonlineshop.entity.Permission;
import com.onlineshop.springbootonlineshop.repository.PermissionRepository;
import com.onlineshop.springbootonlineshop.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Permission saveOrUpdate(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public void deleteById(Long id) {
        permissionRepository.deleteById(id);
    }

    @Override
    public Permission findById(Long id) {
        return permissionRepository.findById(id).get();
    }

    @Override
    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }
}
