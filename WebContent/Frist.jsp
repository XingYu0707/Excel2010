<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--   o:<s:property value="opennum"/>${opennum}
c:<s:property value="closenum"/>${closenum}-->
	<h0> <font size="5" color="blue" style="font-weight: bolder;" align="center">姓名：<s:property value="name" />&nbsp;&nbsp;&nbsp;&nbsp;截止日期：<s:property value="date" /></font></h0>
	<h1>
		<font size="5" color="blue" style="font-weight: bolder;">1、缺陷统计:</font>
	</h1>
	<table border="2" width="50%" align="center">
		<tr>
			<td colspan=8 align="center"><font size="5"
				style="font-weight: bolder;">项目：<s:property value="project" /></font></td>
		</tr>
		<tr>
			<td align="center"></td>
			<td align="center"></td>
			<td align="center">致命</td>
			<td align="center">严重</td>
			<td align="center">一般</td>
			<td align="center">提示</td>
			<td align="center">合计</td>
		</tr>
		<tr>
			<td bordercolor="red" rowspan="2"><font size="4">累计所有问题单</font></td>
			<td bordercolor="red" align="center">个数</td>
			<td bordercolor="red"><s:property value="bug4allnum" /></td>
			<td bordercolor="red"><s:property value="bug3allnum" /></td>
			<td bordercolor="red"><s:property value="bug2allnum" /></td>
			<td bordercolor="red"><s:property value="bug1allnum" /></td>
			<td bordercolor="red"><s:property value="allnum" /></td>
		</tr>
		<tr>
			<td align="center">DI</td>
			<td><s:property value="bug4allnumDI" /></td>
			<td><s:property value="bug3allnumDI" /></td>
			<td><s:property value="bug2allnumDI" /></td>
			<td><s:property value="bug1allnumDI" /></td>
			<td><s:property value="allnumDI" /></td>
		</tr>
		<tr>
			<td bordercolor="red" rowspan="2"><font size="4">累计修改完成</font></td>
			<td bordercolor="red" align="center">个数</td>
			<td bordercolor="red"><s:property value="bug4closenum" /></td>
			<td bordercolor="red"><s:property value="bug3closenum" /></td>
			<td bordercolor="red"><s:property value="bug2closenum" /></td>
			<td bordercolor="red"><s:property value="bug1closenum" /></td>
			<td bordercolor="red"><s:property value="closenum" /></td>
		</tr>
		<tr>
			<td align="center">DI</td>
			<td><s:property value="bug4closenumDI" /></td>
			<td><s:property value="bug3closenumDI" /></td>
			<td><s:property value="bug2closenumDI" /></td>
			<td><s:property value="bug1closenumDI" /></td>
			<td><s:property value="closenumDI" /></td>
		</tr>
		<tr>
			<td bordercolor="red" rowspan="2"><font size="4">本周产生问题单</font></td>
			<td bordercolor="red" align="center">个数</td>
			<td bordercolor="red"><s:property value="bug4weekopennum" /></td>
			<td bordercolor="red"><s:property value="bug3weekopennum" /></td>
			<td bordercolor="red"><s:property value="bug2weekopennum" /></td>
			<td bordercolor="red"><s:property value="bug1weekopennum" /></td>
			<td bordercolor="red"><s:property value="weekopennum" /></td>
		</tr>
		<tr>
			<td align="center">DI</td>
			<td><s:property value="bug4weekopennumDI" /></td>
			<td><s:property value="bug3weekopennumDI" /></td>
			<td><s:property value="bug2weekopennumDI" /></td>
			<td><s:property value="bug1weekopennumDI" /></td>
			<td><s:property value="weekopennumDI" /></td>
		</tr>
		<tr>
			<td bordercolor="red" rowspan="2"><font size="4">本周解决问题单</font></td>
			<td bordercolor="red" align="center">个数</td>
			<td bordercolor="red"><s:property value="bug4weekclosenum" /></td>
			<td bordercolor="red"><s:property value="bug3weekclosenum" /></td>
			<td bordercolor="red"><s:property value="bug2weekclosenum" /></td>
			<td bordercolor="red"><s:property value="bug1weekclosenum" /></td>
			<td bordercolor="red"><s:property value="weekclosenum" /></td>
		</tr>
		<tr>
			<td align="center">DI</td>
			<td><s:property value="bug4weekclosenumDI" /></td>
			<td><s:property value="bug3weekclosenumDI" /></td>
			<td><s:property value="bug2weekclosenumDI" /></td>
			<td><s:property value="bug1weekclosenumDI" /></td>
			<td><s:property value="weekclosenumDI" /></td>
		</tr>
		<tr>
			<td bordercolor="red" rowspan="2"><font size="4">遗留问题</font></td>
			<td bordercolor="red" align="center">个数</td>
			<td bordercolor="red"><s:property value="bug4opennum" /></td>
			<td bordercolor="red"><s:property value="bug3opennum" /></td>
			<td bordercolor="red"><s:property value="bug2opennum" /></td>
			<td bordercolor="red"><s:property value="bug1opennum" /></td>
			<td bordercolor="red"><s:property value="opennum" /></td>
		</tr>
		<tr>
			<td align="center">DI</td>
			<td><s:property value="bug4opennumDI" /></td>
			<td><s:property value="bug3opennumDI" /></td>
			<td><s:property value="bug2opennumDI" /></td>
			<td><s:property value="bug1opennumDI" /></td>
			<td><s:property value="opennumDI" /></td>
		</tr>
	</table>

	<br />
	<br />
	<br />
	<br />
	<br />

	<h1>
		<font size="5" color="blue" style="font-weight: bolder;">2、按生命类型分析:</font>
	</h1>
	<table border="2" width="50%" align="center">
		<tr>
			<td colspan=8 align="center"><font size="5"
				style="font-weight: bolder;">项目：<s:property value="project" /></font></td>
		</tr>
		<tr>
			<td align="center"></td>
			<td align="center">致命</td>
			<td align="center">严重</td>
			<td align="center">一般</td>
			<td align="center">提示</td>
		</tr>
		<tr>
			<td bordercolor="red"><font size="4">NEW</font></td>
			<td bordercolor="red"><s:property value="bugnew4" /></td>
			<td bordercolor="red"><s:property value="bugnew3" /></td>
			<td bordercolor="red"><s:property value="bugnew2" /></td>
			<td bordercolor="red"><s:property value="bugnew1" /></td>
		</tr>
		<tr>
			<td bordercolor="red"><font size="4">BUGFIX</font></td>
			<td bordercolor="red"><s:property value="bugfix4" /></td>
			<td bordercolor="red"><s:property value="bugfix3" /></td>
			<td bordercolor="red"><s:property value="bugfix2" /></td>
			<td bordercolor="red"><s:property value="bugfix1" /></td>
		</tr>
		<tr>
			<td bordercolor="red"><font size="4">OLD</font></td>
			<td bordercolor="red"><s:property value="bugold4" /></td>
			<td bordercolor="red"><s:property value="bugold3" /></td>
			<td bordercolor="red"><s:property value="bugold2" /></td>
			<td bordercolor="red"><s:property value="bugold1" /></td>
		</tr>
		<tr>
			<td bordercolor="red"><font size="4">Other</font></td>
			<td bordercolor="red"><s:property value="bugother4" /></td>
			<td bordercolor="red"><s:property value="bugother3" /></td>
			<td bordercolor="red"><s:property value="bugother2" /></td>
			<td bordercolor="red"><s:property value="bugother1" /></td>
		</tr>

		<tr>
			<td bordercolor="red"><font size="4">合计</font></td>
			<td bordercolor="red"><s:property value="bug4all" /></td>
			<td bordercolor="red"><s:property value="bug3all" /></td>
			<td bordercolor="red"><s:property value="bug2all" /></td>
			<td bordercolor="red"><s:property value="bug1all" /></td>
		</tr>
	</table>

	<br />
	<br />
	<br />
	<br />
	<br />
	<h1>
		<font size="5" color="blue" style="font-weight: bolder;">3、按人员维度分析:</font>
	</h1>
	<table border="2" align="center">
		<style type="text/css">
.x {
	border-top: 0px solid black;
	border-left: 0px solid black;
	border-right: 0px solid black;
	border-bottom: 0px solid black;
}
</style>
		<tr>
			<td colspan=2 align="center" class="x">姓名</td>
			<td align="center" class="x">问题数</td>
		</tr>
		<s:iterator value="list2">
			<tr>
				<td colspan=2 class="x"><s:property value="assign" /><br /></td>
				<td class="x" align="center"><font color="red"><s:property
							value="num" /></font></td>
			</tr>

		</s:iterator>
		</tr>
	</table>
	<s:form action="showmap" method="post">
		<s:submit value="查看图片"></s:submit>
	</s:form>
</body>
</html>