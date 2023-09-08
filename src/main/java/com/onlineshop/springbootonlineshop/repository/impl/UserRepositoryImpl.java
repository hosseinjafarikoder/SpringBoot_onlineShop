package com.onlineshop.springbootonlineshop.repository.impl;


import com.onlineshop.springbootonlineshop.entity.Role;
import com.onlineshop.springbootonlineshop.entity.User;
import com.onlineshop.springbootonlineshop.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


@Repository
public class UserRepositoryImpl implements UserRepository {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void register(User user, String roleName) {
        Role role = entityManager.createQuery("SELECT r FROM Role r WHERE r.name = :name", Role.class)
                .setParameter("name", roleName)
                .getSingleResult();
        //todo i change this piece of code cause of java 17
        user.setRoles(Collections.singleton(role));
/*        user.setRoles(new HashSet<>() {{
            add(role);
        }});
 */
        entityManager.merge(user);
    }

    public List<User> findAll() {
        List<User> users = entityManager
                .createQuery("SELECT u FROM User u LEFT JOIN FETCH u.roles r", User.class)
                .getResultList();
        return users;
    }

}
