<%@page import="javax.naming.*"%>
<%@page import="org.apache.tomcat.dbcp.dbcp2.BasicDataSource"%>
<%@page import="java.sql.*"%>
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
String tip = request.getAttribute("tip").toString();


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
</head>

<body>
	登陆成功！
	<s:if test="#age>10">
  	成年人
  </s:if>
	<s:else>
  	未成年人
  </s:else>
	<div>
		<div>
			<h1>${tip }</h1`>
		</div>
	</div>
	<!-- 迭代器 -->
	<s:generator val="#tip" separator="，">
		<s:iterator status="st">
			<tr <s:if test="#st.odd"> style="background-color:#bbbbbb"</s:if>>
				<td><s:property /></td>
		</s:iterator>
	</s:generator>
</body>
</html>
