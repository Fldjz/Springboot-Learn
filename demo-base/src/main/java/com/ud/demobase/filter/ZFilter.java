package com.ud.demobase.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

import java.io.IOException;

@WebFilter("/x")
@Order(10)
public class ZFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("zzzz");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
