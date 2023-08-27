package com.onlineshop.springbootonlineshop.repository;

import com.onlineshop.springbootonlineshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    Boolean existsByUsername(String username);
}
