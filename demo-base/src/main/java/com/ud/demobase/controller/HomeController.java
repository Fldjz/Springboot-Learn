package com.ud.demobase.controller;


import com.ud.demobase.Listener.OnlineListener;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(HttpSession session, Model model){
        // 从 session 中获取 username
        String username = (String) session.getAttribute("username");

        // 将 username 添加到 Model 中，以便 Thymeleaf 模板可以使用它
        model.addAttribute("username", username);


        model.addAttribute("onlineCount", OnlineListener.getOnlineCount());

        return "home";
    }
}
