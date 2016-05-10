package com.jinzht.mobile.action;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.jinzht.tools.Config;
import com.jinzht.tools.MessageType;
import com.jinzht.tools.MsgUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

public class SendSMSCodeAction extends ActionSupport implements  RequestAware ,SessionAware {
	private int status = 401;
	private String telePhone="";
	private String msg = Config.STRING_LOGING_TIP;
	private int platform;
	private Map request;
	private Map session;
	private Map data = new HashMap();

	public String sendVerifyCode() {
		if(this.telePhone == null || this.telePhone.equals("")){
			this.status = 400;
			this.msg = Config.STRING_LOGING_TEL_NOT_NULL;
			return ERROR;
		}
		
		
		if(this.session.get("code")!=null){
			System.out.println("发送的验证码为:"+this.session.get("code"));
		}
		
		String content = Config.STRING_SMS_REGISTE;
		MsgUtil SMS = new MsgUtil(this.telePhone, content,
				MessageType.VerifyCode);
		if (MsgUtil.send(this.session)) {
			this.setStatus(200);
			this.msg = Config.SMS_HAVE_SEND_STRING;
			return SUCCESS;
		}
		return ERROR;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getPlatform() {
		return platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public Map getData() {
		data.put("telePhone", this.telePhone);
		data.put("platform", this.platform);
		return data;
	}

	public void setData(Map data) {
		this.data = data;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
		System.out.println();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

}
