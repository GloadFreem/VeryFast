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
		//��ȡ��Filter�����ò���
		String encoding = this.config.getInitParameter("encoding");
		String logingPage = this.config.getInitParameter("loginPage");
		String proLogin = this.config.getInitParameter("proLogin");
		//����request�����õ��ַ���
		request.setCharacterEncoding(encoding);
		
		ServletContext context = this.config.getServletContext();
		long before = System.currentTimeMillis();
		System.out.println("��ʼ����...");
		//������ת��ΪHttpServletRequester ����
		HttpServletRequest hrequest = (HttpServletRequest)request;
		//��ȡsession�Ự
		HttpSession session = hrequest.getSession(true);
		//���������Ϣ
		System.out.println("Filter �ػ��û��������ַ:  " + hrequest.getServletPath());
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		
		System.out.println("���˽���...");
		System.out.println("���󱻶�λ��:" + hrequest.getRequestURI() + "�ķ�ʱ�䣺"+(after-before));
		
		//��ȡ�ͻ�����ҳ��·��
		String requestPath = hrequest.getServletPath();
		
		if(session.getAttribute("user")==null || !requestPath.endsWith("loginPage") || !requestPath.endsWith("proLogin")){
			//�ض�λ����¼ҳ��
			request.setAttribute("tip", "��û�е�¼��");
			request.getRequestDispatcher(logingPage).forward(request, response);
		}else{
			chain.doFilter(request, response);
		}
	}

	//FilterConfig���ڿɷ���Filter������Ϣ
	private FilterConfig config;
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config = arg0;
	}

}
