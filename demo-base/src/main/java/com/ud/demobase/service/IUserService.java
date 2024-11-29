package com.ud.demobase.service;

public interface IUserService {
    public boolean login(String username, String password);

    public void register(String username, String password, String email);

}
