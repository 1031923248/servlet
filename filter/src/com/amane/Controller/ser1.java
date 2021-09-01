package com.amane.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ser1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("你妈的,安慰什么");
    }
}
