
package com.onlineshop.springbootonlineshop.service;


import com.onlineshop.springbootonlineshop.entity.User;

public interface UserService {
    void save(User user);

    void update(User user);

    User findByUsername(String username);

//    void checkUniqueDuty(User user, String duty);

//    void updateDuty(User currentUser,String duty, boolean status);

    void checkSecurity(String currentUser, String username);
}
