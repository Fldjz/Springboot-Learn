package com.ud.demobase.controller;

import com.ud.demobase.bean.Message;
import com.ud.demobase.service.IMessageService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MessageController {

    @Autowired
    private IMessageService messageService;
    /*List<Message> messages = new ArrayList<>();
    {
        messages.add(new Message("zhang3","你好",System.currentTimeMillis()));
        messages.add(new Message("li4","你也好",System.currentTimeMillis()));
        messages.add(new Message("管理员","只留言，不聊天哟",System.currentTimeMillis()));
    }*/
    @RequestMapping("/messages")
    public String list(Model model) {

        List<Message> messages = messageService.listAll();
        model.addAttribute("messages",messages);
        return "message";
    }


    @PostMapping("/sendMessage")
    public String sendMessage(String message, HttpSession session){
        String username = (String) session.getAttribute("username");
        if(username == null){
            username = "未登录用户";
        }
        messageService.sendMessage(username,message);
        return "redirect:/messages";
    }
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msgContent = req.getParameter("message");
        long time = System.currentTimeMillis();
        Object user = req.getSession().getAttribute("username");
        if(user == null){
            user = "未登录用户";
        }
        Message message = new Message(user.toString(),msgContent,time);
        messages.add(message);
        req.setAttribute("messages",messages);
        req.getRequestDispatcher("message.jsp").forward(req,resp);
    }*/
}
