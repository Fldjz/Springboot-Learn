package com.ud.demobase.email;


import org.springframework.context.ApplicationEvent;

public class RegEvent extends ApplicationEvent {
    private final String email;

    public RegEvent(Object source,String email) {
        super(source);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
