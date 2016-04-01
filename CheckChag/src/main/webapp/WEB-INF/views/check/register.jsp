<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- register get방식으로 접근하면 데이터를 입력할 수 있는 화면이 나오고 버튼을 누르면 register Post로 간다. -->
<form method="post">
	<div><input type="text" name="userid" placeholder="ID"></div>
	<div><input type="text" name="userpwd" placeholder="password"></div>
	<div><input type="number" min="1" max="100" name="age" placeholder="age"></div>
	<div><input type="text" name="email" placeholder="Email"></div>
	<div><button>join</button></div>
</form>
</body>
</html>

