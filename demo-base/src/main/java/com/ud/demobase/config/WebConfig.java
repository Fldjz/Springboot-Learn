package com.ud.demobase.config;

import com.ud.demobase.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/*")
                .excludePathPatterns("/test/**","/login","/register","/doLogin","/doRegister")
//                .addPathPatterns("/message","/imageMessage")
                ;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")  // 虚拟路径
                .addResourceLocations("classpath:/static/"); // 实际资源路径
    }
}
