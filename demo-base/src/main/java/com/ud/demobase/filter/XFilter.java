package com.ud.demobase.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

import java.io.IOException;

@WebFilter("/x")
@Order(20)
public class XFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("xxxx");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
