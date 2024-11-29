package com.ud.demobase.Listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class OnlineListener implements HttpSessionListener {
     private static int onlineCount = 0;
     public static synchronized int getOnlineCount() {return onlineCount;}
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
            onlineCount--;
        System.out.println("onlineCount: " + onlineCount);
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
      onlineCount++;
      System.out.println("onlineCount: " + onlineCount);
    }

}
