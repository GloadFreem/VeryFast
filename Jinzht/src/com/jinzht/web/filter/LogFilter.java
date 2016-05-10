package com.jinzht.web.filter;

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
import javax.servlet.http.HttpSession;
@WebFilter(filterName="log",urlPatterns={"*.action"},initParams={@WebInitParam(name="encoding",value="utf-8"),@WebInitParam(name="loginPage",value="/index.jsp"),@WebInitParam(name="proLogin",value="/proLogin.jsp")})
public class LogFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		this.config = null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//获取该Filter的配置参数
		String encoding = this.config.getInitParameter("encoding");
		String logingPage = this.config.getInitParameter("loginPage");
		String proLogin = this.config.getInitParameter("proLogin");
		//设置request编码用的字符集
		request.setCharacterEncoding(encoding);
		
		ServletContext context = this.config.getServletContext();
		long before = System.currentTimeMillis();
		System.out.println("开始过滤...");
		//将请求转换为HttpServletRequester 请求
		HttpServletRequest hrequest = (HttpServletRequest)request;
		//获取session会话
		HttpSession session = hrequest.getSession(true);
		//输出请求信息
		System.out.println("Filter 截获到用户倾听求地址:  " + hrequest.getServletPath());
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		
		System.out.println("过滤结束...");
		System.out.println("请求被定位到:" + hrequest.getRequestURI() + "耗费时间："+(after-before));
		
		//获取客户请求页面路径
		String requestPath = hrequest.getServletPath();
		
		if(session.getAttribute("user")==null || !requestPath.endsWith("loginPage") || !requestPath.endsWith("proLogin")){
			//重定位到登录页面
			request.setAttribute("tip", "您没有登录！");
			request.getRequestDispatcher(logingPage).forward(request, response);
		}else{
			chain.doFilter(request, response);
		}
	}

	//FilterConfig用于可访问Filter配置信息
	private FilterConfig config;
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config = arg0;
	}

}
