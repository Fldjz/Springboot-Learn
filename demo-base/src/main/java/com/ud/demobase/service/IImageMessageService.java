package com.ud.demobase.service;

import com.ud.demobase.bean.ImageMessage;

import java.util.List;

public interface IImageMessageService {

    List<ImageMessage> listAll();

    void sendMessage(String username, String message,String imagePath);

}
