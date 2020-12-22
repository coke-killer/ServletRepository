package org.example.thread;

import javax.servlet.AsyncContext;
import java.io.PrintWriter;
import java.util.Date;

public class DemoThread implements Runnable {
    private AsyncContext ctx = null;

    public DemoThread(AsyncContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run() {
        int sum = 0;
        try {
            // 通过此种方式就能获取到响应流
            PrintWriter out = ctx.getResponse().getWriter();
            out.println("子线程---运行<br>");
            sum = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                sum += i;
                Thread.sleep(1000L);
            }
            out.println("sum = " + sum + "<br>");
            out.println("子线程---结束<br>");
            out.println("业务处理完毕的时间：" + new Date() + "<br>");
            ctx.complete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
