package com.onlineshop.springbootonlineshop.security.servivce;


public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);

}
