<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询失败</title>
</head>
<body>
<center>
		<h1>
			<font size="5" color="blue" style="font-weight: bolder;">您输入的姓名或截止日期有误，请查证后重新输入！</font>
		</h1>
<s:form action="index" method="post">
<s:submit value="返回"></s:submit>
</s:form>
</center>
</body>
</html>