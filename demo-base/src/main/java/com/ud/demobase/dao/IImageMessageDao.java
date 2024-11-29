package com.ud.demobase.dao;

import com.ud.demobase.bean.ImageMessage;

import java.util.List;

public interface IImageMessageDao {
    List<ImageMessage> listAll();

    void add(ImageMessage messageObj);
}
