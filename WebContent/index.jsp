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
    <base href="<%=basePath%>">
    
    <title>文件上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

  </head>
  
  <body>
   <center>
  	<h1><font color="blue">请填写必要内容并选择文件</font></h1>
	  <form action="upload.action" method="post" enctype="multipart/form-data" target="_blank">
	  	<table>
	  		<tr>
	  			<td>姓名:</td>
	  			<td><input type="text" name="username" >（必填）</td>
	  		</tr>
	  		<tr>
	  			<td>截止日期:</td>
	  			<td><input type="text" name="enddata">（格式：xxxx-xx-xx，必填）</td>
	  		</tr>
	  		<tr>
	  			<td>上传文件:</td>
	  			<td><input type="file" name="myFile"></td>
	  		</tr>
	  		<tr>
	  			<td><input type="submit" value="上传" ></td>
	  			<td><input type="reset"></td>
	  		</tr>
	  	</table>
	  </form>
	  </br></br></br></br>
	 <h1><font color="blue">请填写姓名与截止日期查询</font></h1>
	  <form action="jumpsele" method="post" target="_blank">
	  	<table>
	  		<tr>
	  			<td>姓名:</td>
	  			<td><input type="text" name="name" >（必填）</td>
	  		</tr>
	  		<tr>
	  			<td>截止日期:</td>
	  			<td><input type="text" name="date">（格式：xxxx-xx-xx，必填）</td>
	  		</tr>
	  		<tr>
	  			<td><input type="submit" value="查询"></td>
	  			<td><input type="reset"></td>
	  		</tr>
	  	</table>
	  </form>
	  </br>
	  </br>
	  </br>
  </center>
  <marquee direction="left" behavior="scroll" scrollamount="6" onmouseover=this.stop() onmouseout=this.start()>
  <h2><font color="blue">如有疑问，请<a style="color: orange;" href="mailto:zhangxingyu@inspur.com?subject=The related issues of the website&body=Hello :">邮件联系</a></font></h2>
  </marquee>
  
  </body>
</html>
