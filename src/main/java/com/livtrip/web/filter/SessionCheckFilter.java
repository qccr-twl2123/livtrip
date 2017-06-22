package com.livtrip.web.filter;

import com.google.common.collect.Lists;
import com.livtrip.web.constant.Constant;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by xierongli on 17/6/17.
 */
@Component
@WebFilter(filterName = "sessionCheckFilter", urlPatterns = {"/backend/*","/main.html"}, initParams = {@WebInitParam(name="loginPage",value="login.html"), @WebInitParam(name="loginServlet",value="loginProcess.do") })
public class SessionCheckFilter implements Filter {

    private FilterConfig config;

    private final static List<String> GREEN_CHANNEL = Lists.newArrayList();

    static {
        GREEN_CHANNEL.add("/");
        GREEN_CHANNEL.add("/index.html");
        GREEN_CHANNEL.add("/loginPage.do");
        GREEN_CHANNEL.add("/loginServlet.do");
        GREEN_CHANNEL.add("/login.html");
    }

    public SessionCheckFilter(){}
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //获取初始化数据
        HttpSession session = ((HttpServletRequest)request).getSession();
        HttpServletRequest req = ((HttpServletRequest)request);
        HttpServletResponse res = ((HttpServletResponse)response);
        String requestPath = req.getRequestURI();
       //requestPath = requestPath.substring(requestPath.lastIndexOf("/"), requestPath.length());

        boolean result = requestPath.indexOf("front") > 0;
        System.out.println(requestPath.indexOf("front") > 0);
        if(session.getAttribute(Constant.SESSION_USER_NAME) != null
                || "".equals(requestPath) || GREEN_CHANNEL.contains(requestPath) || requestPath.indexOf("front") > 0){
            chain.doFilter(request, response);
        }else{
            req.setAttribute("tip", "您还未登录,请先登录!");
            //req.getRequestDispatcher("login.html").forward(request,response);
            res.sendRedirect(((HttpServletRequest)request).getContextPath() + "/login.html");
        }
    }

    @Override
    public void destroy() {
        this.config = null;
    }
}
