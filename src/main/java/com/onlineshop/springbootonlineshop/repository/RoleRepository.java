package com.onlineshop.springbootonlineshop.repository;



import com.onlineshop.springbootonlineshop.entity.ERole;
import com.onlineshop.springbootonlineshop.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
