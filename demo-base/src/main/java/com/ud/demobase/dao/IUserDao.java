package com.ud.demobase.dao;

public interface IUserDao {

    String getPasswordByUsername(String username);

    boolean userExists(String username);

    void addUser(String username, String password);
}
