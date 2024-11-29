package com.ud.demobase.service;

import com.ud.demobase.bean.ImageMessage;
import com.ud.demobase.bean.Message;
import com.ud.demobase.dao.IImageMessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageMessageService implements IImageMessageService{

    @Autowired
    private IImageMessageDao iImageMessageDao;

    @Override
    public List<ImageMessage> listAll() {
        return iImageMessageDao.listAll();
    }

    @Override
    public void sendMessage(String username, String message, String imagePath) {
        ImageMessage messageObj = new ImageMessage(username,message,System.currentTimeMillis(),imagePath) ;
        iImageMessageDao.add(messageObj);
    }
}
