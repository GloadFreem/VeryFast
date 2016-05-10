package com.jinzht.web.filter;

import java.io.Serializable;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.CallbackException;
import org.hibernate.EntityMode;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	private String name;
	private String msg="hello";
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		//获取uri
		 //获取request
		ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST);
		//获取session
		HttpSession session = request.getSession();
		//获取请求的路径
		String path = request.getRequestURI();
		//判断是否登录,如果登录判断是否有访问的权限
		if(session.getAttribute("user")== null){
			// 重定向到登录界面
			//request.getRequestDispatcher("/login.jsp"); 此方式用下面的 Action.LOGIN;代替
			session.setAttribute("user", "陈生珠");
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

}
