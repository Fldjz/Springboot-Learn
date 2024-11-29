package com.ud.demobase.bean;

/*
    ImageMessage 类继承自 Message
    增加了 imagePath 属性，用于存储上传图片的路径。
 */
public class ImageMessage extends Message {

    private String imagePath;

    public ImageMessage(String username, String message, long time, String imagePath) {
        super(username, message, time);
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
}

