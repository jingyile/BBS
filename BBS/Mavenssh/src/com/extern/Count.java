package com.extern;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;


/**
 * Servlet������ʵ����CountFilter��ͨ��ע��ķ�ʽ���ù�����
 */
@WebFilter(
        urlPatterns = { "/login.jsp" },
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

