<%@page import="javax.naming.*"%>
<%@page import="org.apache.tomcat.dbcp.dbcp2.BasicDataSource" %>
<%@page import="java.sql.*" %>
<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

//初始化Context,使用InitialContext初始化Context
//Context context = new InitialContext();
//通过JNDI查找数据源 java:com/env/jdbc/descbase
//BasicDataSource ds = (BasicDataSource)context.lookup("java:comp/env/jdbc/descbase");
//获取数据库连接
//Connection conn = ds.getConnection();
//获取Statement
//Statement stmt = conn.createStatement();
//执行查询,返回ResultSet对象
//ResultSet rs = stmt.executeQuery("select * from User");
//while(rs.next()){
//	out.println(rs.getString(2)+"\t"+rs.getString(3)+"<br/>");
//}
//String tip = request.getAttribute("tip").toString();
//out.print(tip);


%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function regist(){
			//获取页面的第一个表单
			alert("进入");
			var actionForm = document.forms[0];
			actionForm.action="registAction!regist"
		}
	</script>
  </head>
  
  <body>
  <s:form action="loginAction.action">
  	<s:textfield name="userName" key="user"></s:textfield>
  	<s:textfield name="passWord" key="pass"></s:textfield>
  	<s:submit key="login" value="login"></s:submit>
  	<s:submit key="regist" value="regist" onclick="regist()"></s:submit>
  </s:form>
  <s:debug></s:debug>
  <s:textfield name="user" label="用户信息"></s:textfield>
  
  <s:form action="uploadPro" enctype="multipart/form-data" method="POST">
  	<s:textfield name="title" label="文件标题"></s:textfield><br/>
  	<s:file name="upload" label="选择文件"  /><br/>
  	<s:submit value="上传"></s:submit>
  </s:form>
  </body>
</html>
