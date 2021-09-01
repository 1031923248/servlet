package com.amane.Controller;

import com.amane.Dao.FruitDao;
import com.amane.Fruit.Fruit;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class fruit01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String json = "{}";
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        String id =req.getParameter("id");
        Fruit fruit = FruitDao.getFruit(Integer.valueOf(id));
        ObjectMapper om = new ObjectMapper();
        json = om.writeValueAsString(fruit);
        pw.println(json);
        pw.flush();
        pw.close();
    }
}
