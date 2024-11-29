package com.ud.demobase.dao;

import com.ud.demobase.bean.ImageMessage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ImageMessageDao implements  IImageMessageDao{

    private List<ImageMessage> messages = new ArrayList<>();
    @Override
    public List<ImageMessage> listAll() {
        return messages;
    }

    @Override
    public void add(ImageMessage messageObj) {
        messages.add(messageObj);
    }
}
