package com.ud.demobase.controller;

import org.springframework.context.ApplicationEvent;

// 自定义事件类，继承自 ApplicationEvent
public class UserRegisteredEvent extends ApplicationEvent {
    private String email;

    public UserRegisteredEvent(Object source, String email) {
        super(source);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
