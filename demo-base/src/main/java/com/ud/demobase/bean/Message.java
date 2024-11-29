package com.ud.demobase.bean;

import java.text.SimpleDateFormat;

public class Message {


    String username="zhang3";
    long time;
    String message;

    public Message(String username, String message,long time) {
        this.username = username;
        this.time = time;
        this.message = message;
    }

    public String getTimeStr(){
        SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");

        return f.format(time);
    }

    public String getUsername() {
        return username;
    }

    public long getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }


}
