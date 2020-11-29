package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //防止post    乱码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
//        String inputName = new String(name.getBytes("ISO8859-1"), "utf-8");
        System.out.println(name);
//        System.out.println(inputName);
        resp.getWriter().write(name);
//        resp.getWriter().write(inputName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        System.out.println("this is post");
        String name = req.getParameter("name");
        System.out.println(name);
        resp.getWriter().write(name);
    }
}
