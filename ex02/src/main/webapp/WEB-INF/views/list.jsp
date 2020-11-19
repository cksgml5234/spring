<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>주소목록</title>
	<link rel="stylesheet" href="${path }/resources/css/home.css">
</head>
<body>
	<h1>[주소목록]</h1>
	<div class="container">
	<a data-animation="ripple" href="insert">주소 
	<span style="font-weight: bold;">등록</span></a>
	</div>
	<table border=1 id="tbl">
		<tr class="title">
			<td width=50>No.</td>
			<td width=100>Name</td>
			<td width=200>Phone</td>
			<td width=300>Address</td>
		</tr>
		<c:forEach items="${list }" var="vo">
			<tr class="row">
				<td>${vo.ano }</td>
				<td><a href="read?ano=${vo.ano}">${vo.name }</a></td>
				<td>${vo.tel }</td>
				<td>${vo.addr }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>