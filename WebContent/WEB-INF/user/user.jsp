<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/ecp/resources/js/jquery-1.11.3.js"></script>
<title>ECP系统</title>
<script>
	function check()
	{
		$.ajax({
			url: 'user/check',
			method: 'post',
			success:function(res)
			{
				console.info(res);
			}
		});	
	}
</script>
</head>
<body>
	this is user page. 
	<input type="button" onclick="check()">点击
</body>
</html>