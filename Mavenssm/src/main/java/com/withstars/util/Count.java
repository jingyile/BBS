package com.withstars.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/**
 * Servlet������ʵ����CountFilter��ͨ��ע��ķ�ʽ���ù�����
 */
@WebFilter(
        urlPatterns = { "/signin" },
        initParams = {
                @WebInitParam(name = "count", value = "5000")
        }
)
public class Count implements Filter {
    private int count; // ��������


    /**
     * Ĭ�Ϲ��췽��
     */
    public  Count() { }


    /**
     * ���ٷ���
     */
    public void destroy() { }


    /**
     * ���˴�����
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count ++; // ������������
// ��ServletRequestת����HttpServletRequest
        HttpServletRequest req = (HttpServletRequest) request;
// ��ȡServletContext
        //ServletContext context = req.getServletContext();
      ServletContext context = req.getSession().getServletContext();
        context.setAttribute("count", count); // ����������ֵ���뵽ServletContext��
        chain.doFilter(request, response); // ���´��ݹ�����
    }


    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        String param = fConfig.getInitParameter("count"); // ��ȡ��ʼ������
        count = Integer.valueOf(param); // ���ַ���ת��Ϊint
    }
}

