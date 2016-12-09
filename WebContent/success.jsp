<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>统计完成</title>
</head>
<body>
<center>
		<h1>
			<font size="5" color="red" style="font-weight: bolder;">数据统计完成</font>
		</h1>
		<s:form action="jump" method="post">
			<!--<s:property value="jump" />-->
			<s:submit value="查看"></s:submit>
		</s:form>
		<s:form action="index" method="post">
			<s:submit value="返回"></s:submit>
		</s:form>
</center>
</body>
</html>