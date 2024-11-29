package com.ud.demobase.service;

import com.ud.demobase.bean.Message;
import com.ud.demobase.dao.IMessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MessageService implements IMessageService{



    @Autowired
    private IMessageDao messageDao;

    @Override
    public List<Message> listAll() {
        return messageDao.queryAll();
    }

    @Override
    public void sendMessage(String username, String message) {
        Message messageObj = new Message(username,message,System.currentTimeMillis()) ;
        messageDao.add(messageObj);
    }


}
