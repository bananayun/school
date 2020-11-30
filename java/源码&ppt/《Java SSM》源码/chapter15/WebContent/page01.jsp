<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增学校</title>
</head>
<body>
<div>
<label style="color: red;">${msg}</label>
<form action="schooladd" method="post">
	<label>校名：</label><input name="name"><br/>
	<label>人数：</label><input name="persons"><br/>
	<input type="submit" value="新增学校">
</form>
</div>
</body>
</html>