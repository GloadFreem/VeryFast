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
		//��ȡuri
		 //��ȡrequest
		ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST);
		//��ȡsession
		HttpSession session = request.getSession();
		//��ȡ�����·��
		String path = request.getRequestURI();
		//�ж��Ƿ��¼,�����¼�ж��Ƿ��з��ʵ�Ȩ��
		if(session.getAttribute("user")== null){
			// �ض��򵽵�¼����
			//request.getRequestDispatcher("/login.jsp"); �˷�ʽ������� Action.LOGIN;����
			session.setAttribute("user", "������");
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
