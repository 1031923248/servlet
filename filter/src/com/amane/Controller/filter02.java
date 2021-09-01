package com.amane.Controller;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class filter02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletResponse.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(servletRequest,httpServletResponse);
    }

    @Override
    public void destroy() {

    }
}
