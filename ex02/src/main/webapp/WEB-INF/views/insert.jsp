<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>주소등록</title>
	<link rel="stylesheet" href="${path }/resources/css/home.css">
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	
</head>
<body>
	<h1>[주소등록]</h1>
	<form action="insert" method="post" name="frm">
		<table border=1>
			<tr>
				<td width=100>이름:</td>
				<td width=500><input type="text" name="name"></td>
			</tr>
			<tr>
				<td width=100>전화번호:</td>
				<td width=500><input type="text" name="tel"></td>
			</tr>
			<tr>
				<td width=100>주소:</td>
				<td width=500><input type="text" name="addr"></td>
			</tr>
		</table>
		<div id="buttonType">
		<input type="submit" value="저장" class="button">
		<input type="reset" value="취소" class="button">
		<input type="button" value="목록" class="button" onClick="location.href='list'">
		</div>
	</form>
</body>
<script src="../resources/home.js"></script>
</html>