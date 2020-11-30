<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
<script type="text/javascript" src="jquery-2.1.0.min.js"></script>
<script type="text/javascript">
	function getJson() {
		$
				.ajax({
					url : "jsonapp1",
					method : "get",
					data : {
						"page" : 1,
						"limit" : 10
					},
					contentType : "application/json",
					success : function(arr) {
						var s = "";
						$("#sl1").html("");
						for (var i = 0; i < arr.length; i++) {
							s += "<li>学号：" + arr[i].no + ",姓名：" + arr[i].name
									+ "</li>";
						}
						$("#sl1").append(s);
					}
				});
	}
</script>
</head>
<body>
	<h1>
		<input type="button" value="请求" onclick="getJson()">
	</h1>
	<ol id="sl1"></ol>
</body>
</html>
