package com.ud.demobase.service;

import com.ud.demobase.controller.UserRegisteredEvent;
import com.ud.demobase.dao.IUserDao;
import com.ud.demobase.email.RegEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService, ApplicationEventPublisherAware {

    private IUserDao userDao;
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    public UserService(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public boolean login(String username, String password) {
        String pwd = userDao.getPasswordByUsername(username);
        return pwd != null && pwd.equals(password);
    }

    public void register(String username, String password,String email) {
        if (userDao.userExists(username)) {
            throw new RuntimeException("用户名已存在");
        } else {
            userDao.addUser(username, password);
            // 发布事件
            eventPublisher.publishEvent(new RegEvent(this, email));
        }
    }
}