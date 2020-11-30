<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学校列表</title>
</head>
<body>
<div>
<h2>学校列表</h2>
<h6><a href="schoolall">刷新</a></h6>
<table border="1">
<tr>
	<th>序号</th>
	<th>校名</th>
	<th>人数</th>
</tr>
<c:forEach items="${schools }" var="s">
	<tr>
		<td align="center">${s.id }</td>
		<td align="center">${s.name }</td>
		<td align="center">${s.persons }</td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>