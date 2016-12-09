<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎</title>
</head>
<body>
<table align="center" height="200" width="200">
<tr align="center" ><font size="500" color="red">您好！<br>欢迎使用</font></tr>
<tr><td align="center">
<s:form action="jump" method="post">
<s:submit value="跳转" method="jump"/>
</s:form>
</td>
</table>
</body>
</html>