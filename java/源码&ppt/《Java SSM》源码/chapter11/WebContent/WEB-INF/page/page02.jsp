<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page02</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/welcome" method="post">
		<input type="submit" value="POST方式访问欢迎页面">
	</form>
	<hr>
	<a href="${pageContext.request.contextPath}/welcome">GET方式访问欢迎页面</a>
</body>
</html>
