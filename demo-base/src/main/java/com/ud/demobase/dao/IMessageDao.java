package com.ud.demobase.dao;

import com.ud.demobase.bean.Message;

import java.util.List;

public interface IMessageDao {
    List<Message> queryAll();

    void add(Message messageObj);
}
