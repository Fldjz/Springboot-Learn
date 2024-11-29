package com.ud.demobase.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("in LoginInterceptor...");
        HttpSession session = request.getSession(false);
        if(session == null || session.getAttribute("username") == null){
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }
}
