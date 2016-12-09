<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传成功</title>
</head>
<body>
<center>
		<h1>
			<p id="demo"><font size="5" color="blue" style="font-weight: bolder;">上传成功</font></p>
		</h1>
		<s:form action="read" method="post">
			<!--<s:property value="jump" />-->
			<s:submit value="读取"  id="btn"></s:submit>
		</s:form>
		<!--<s:form action="index" method="post">
			<s:submit value="返回"></s:submit>
		</s:form>-->
</center>
</body>
</html>

<script type="text/javascript">
window.onload = function() {
    document.getElementById("btn").onclick = function() {
    	alert('已接收读取指令，请点击确认后等待！');
    	this.style.display='none';
    	document.getElementById("demo").innerHTML="正在读取，请稍后......";
        if(document.body.style.cursor === "wait")
            // 箭头 (默认)
            document.body.style.cursor = "default";
        else
            // 沙漏 (等待)
            document.body.style.cursor = "wait";
    };
};
</script>