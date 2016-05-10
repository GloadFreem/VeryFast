<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.jinzht.tools.Send" %>
<%@page import="com.jinzht.tools.Config" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
            String content = java.net.URLEncoder.encode(" 新接口升级，使用java程序作为后台【金指投投融资】","utf-8");
            String PostData =String.format("sname=%s&spwd=%s&scorpid=&sprdid=%s&sdst=18729342354&smsg=%s", Config.SMS_ACCOUNT,Config.SMS_PASSWORD,Config.SMS_USERID,content);
           //String PostData = "sname=kwsm&spwd=kwsm&scorpid=&sprdid=1012818&sdst=18729342354&smsg="+java.net.URLEncoder.encode(" 新接口升级，使用java程序作为后台【金指投投融资】","utf-8");
            //out.println(PostData);
            String ret = Send.SMS(PostData, "http://cf.51welink.com/submitdata/Service.asmx/g_Submit");
            out.println(ret);
            //请自己反序列化返回的字符串并实现自己的逻辑
        %>

        </h1>
    </body>
</html>
