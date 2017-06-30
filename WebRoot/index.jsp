<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<meta charset="utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body> 
    	
    	<form action="${pageContext.request.contextPath}/PushUserDefined.action" method="post">
        <label>推送的别名</label>
        <input name="usernameAsalias"/><br />
        <span>请输入自定义消息</span><br />
        <textarea type="text" name="UserDefinedMessage" style="width:260px;height:150px;"></textarea><br />
       	<input name="button" type="submit" value="推送自定义消息"/>
        </form>
         <span>请输入推送内容</span><br />
        <form action="${pageContext.request.contextPath}/push.action" method="post">
        <textarea type="text" name="message" style="width:260px;height:150px;"></textarea><br />
        <input name="button" type="submit" value="推送通知"/>
        </form> 
  </body>
</html>
