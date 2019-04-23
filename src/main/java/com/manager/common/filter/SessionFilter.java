package com.manager.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 项目名称：store-renee
 * 类名称：SessionFilter
 * 类描述：
 * 创建人：zhangwanxin
 * 创建时间： 2018年9月10日 下午3:11:44
 */
public class SessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}   	
    @Override
    public void doFilter(ServletRequest sRequest, ServletResponse sResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) sRequest;
        HttpServletResponse response = (HttpServletResponse) sResponse;
        /*String servletPath = request.getServletPath(); 
        if(servletPath.endsWith(".js")||servletPath.endsWith(".css")) {
        	chain.doFilter(request, response);
        }
        System.out.println("doFilter------->校验session");
        System.out.println("当前url:"+servletPath);
        List<String> urls = Arrays.asList(uncheckedUrls.split(","));
        if(urls.contains(servletPath)) {
        	System.out.println("无需检验url:"+servletPath);
        	chain.doFilter(request, response);
        }
        HttpSession session = request.getSession();
        System.out.println("session:"+session.getAttribute("userInfo"));*/
        chain.doFilter(request, response);
    }
 
    @Override
    public void destroy() {}
}
