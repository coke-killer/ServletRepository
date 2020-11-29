package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeServlet extends HttpServlet {
    //servlet  生命周期，，一次init,服务器停止一次destroy
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is service");
    }

    @Override
    public void destroy() {
        System.out.println("this is destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("this is init");
    }
}
