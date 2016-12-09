<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1><font size="5" color="blue" style="font-weight: bolder;">1、<s:property value="imagename"/></br>缺陷等级饼状图</font></h1>
<table width="50%" align="center">
<tr><img align="center" width="500"  src="${image }" /></tr>
</table>
<br/>
<br/>
<br/>
<br/>
<br/>
<h1><font size="5" color="blue" style="font-weight: bolder;">2、<s:property value="imagename"/></br>问题剩余年龄饼状图</font></h1>
<br/>
<table width="50%" align="center">
<tr><img align="center" width="500"  src="${imageage }" /></tr>
</table>
</body>
</html>