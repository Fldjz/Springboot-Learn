package com.ud.demobase.service;

import com.ud.demobase.bean.Message;

import java.util.List;

public interface IMessageService {
    List<Message> listAll();

    void sendMessage(String username, String message);
}
