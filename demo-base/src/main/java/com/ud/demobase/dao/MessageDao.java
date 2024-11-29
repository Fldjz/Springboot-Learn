package com.ud.demobase.dao;

import com.ud.demobase.bean.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageDao implements IMessageDao {

    List<Message> messages = new ArrayList<>();
    {
        messages.add(new Message("zhang3","你好",System.currentTimeMillis()));
        messages.add(new Message("li4","你也好",System.currentTimeMillis()));
        messages.add(new Message("管理员","只留言，不聊天哟",System.currentTimeMillis()));
    }

    @Override
    public List<Message> queryAll() {
        return messages;
    }

    @Override
    public void add(Message messageObj) {
        messages.add(messageObj);
    }
}
