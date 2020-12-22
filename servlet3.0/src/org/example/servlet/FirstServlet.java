package org.example.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/firstServlet")
//urlPattern 数组写法
@WebServlet(urlPatterns = {"/secondServlet", "/thirdServlet"}, name = "secondServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is first  servlet");
        String input = req.getParameter("name");
        System.out.println("name" + input);
        resp.getWriter().write(input);
    }
}
