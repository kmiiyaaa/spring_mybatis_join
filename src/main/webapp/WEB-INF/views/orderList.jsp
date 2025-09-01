<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 리스트</title>
</head>
<body>
	<h2>주문리스트</h2>
	<hr>
	<b>주문번호 / 주문 품목 / 주문 아이디</b><br>
	
	<c:forEach items="${orderList }" var="order">
		${order.orderid} / ${order.ordername } / ${order.userid } <br>
	
	</c:forEach>

</body>
</html>