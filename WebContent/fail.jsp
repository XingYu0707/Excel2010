<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传失败</title>
</head>
<body>
<center>
		<h1>
			<font size="5" color="blue" style="font-weight: bolder;">上传失败</font>
		</h1>
<s:form action="index" method="post">
<font size="10" color="red" style="font-weight: bolder;"><s:property value="jump"/></font>
<br/><br/>
<s:submit value="返回"></s:submit>
</s:form>
<!--<script language="javascript">
          alert("上传成功，点击确认后等待");
          //top.location='xx.jsp';
</script>-->
</center>
</body>
</html>