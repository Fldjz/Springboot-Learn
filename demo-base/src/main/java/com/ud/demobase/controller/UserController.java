package com.ud.demobase.controller;


import com.ud.demobase.service.IUserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    // 注入UserService
    @Autowired
    private IUserService userService;

    // 显示注册页面
    @RequestMapping("/register")
    public String toRegister() {
        return "register";
    }

    // 处理注册请求
    @RequestMapping("/doRegister")
    public String register(String username,String password, Model model,String email) {

        try{
            userService.register(username,password,email);
            System.out.println("success");
            return  "redirect:/login";
        }catch (Exception e){
            System.out.println("error");
            model.addAttribute("msg", e.getMessage());
            return "register";
        }
    }



    // 显示登录页面
    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }

    // 处理登录请求
    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpSession session) {
        if(userService.login(username,password)){
            session.setAttribute("username",username);
            System.out.println("success");
            return  "redirect:/home";
        }else{
            System.out.println("error");
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }
}
