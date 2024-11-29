package com.ud.demobase.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDAO implements IUserDao{
    private Map<String, String> userPwdMap = new HashMap<>();
    public UserDAO() {
    }

    public String getPasswordByUsername(String username) {
        return userPwdMap.get(username);
    }

    public boolean userExists(String username) {
        return userPwdMap.containsKey(username);
    }

    public void addUser(String username, String password) {
        userPwdMap.put(username, password);
    }
}
