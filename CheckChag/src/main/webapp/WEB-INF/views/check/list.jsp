<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script>
var result='${msg}';

if(result){
	alert(result);
}

$.get( "http://192.168.0.15:8083/forJsonE2/json", function( r ) {
    console.log(r);
});
</script>

<ul>
<c:forEach items="${list }" var="member">
	<li>${member }</li>
</c:forEach>
</ul>
</body>
</html>