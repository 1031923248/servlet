package com.amane.Controller;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class fillter01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        HttpServlet servlet = (HttpServlet) servletRequest;
    }

    @Override
    public void destroy() {

    }
}
