package com.extern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        response.setContentType("text/plain;charset=utf-8");
        //����������Ҫ��ǰ����仰֮����ӣ���Ȼ���������
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        if("admin".equals(name)||"jingyile".equals((name))||"jinglele".equals((name))||"jiangyutao".equals((name))){
            out.println("�û����ѱ�ռ��");
        }else{
            out.println("�û�������");
        }
        out.flush();
        out.close();
    }
}
