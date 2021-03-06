<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>글쓰기</title>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<link rel="stylesheet" href="${path }/resources/css/home.css">
</head>
<body>
	<h1>[글쓰기]</h1>
	<form action="insert" method="post" name="frm">
		<table border=1>
			<tr>
				<td width=100>Title</td>
				<td width=500><input type="text" name="title"></td>
			</tr>
			<tr>
				<td width=100>Writer</td>
				<td width=500><input type="text" name="writer" value="guest"></td>
			</tr>
			<tr>
				<td width=100>Content</td>
				<td width=500>
					<textarea rows="10" cols="50" name="content"></textarea>
				</td>
			</tr>
		</table>
		<div id="buttonType">
			<input type="submit" value="저장" class="button">
			<input type="reset" value="취소" class="button">
			<input type="button" value="목록" class="button" onClick="location.href='list'">
		</div>
	
	<jsp:include page="../ajaxUpload.jsp"></jsp:include>
	</form>
</body>
<script>
	$(frm).submit(function(e){
		e.preventDefault();
		if($(frm.title).val()==""){
			alert("제목을 입력하세요");
			$(frm.title).focus();
		}else if($(frm.content).val()==""){
			alert("내용을 입력하세요");
			$(frm.content).focus();
		}else{
			if(!confirm("글을 등록하실래요?")) return;
			frm.submit();
		}
	});
</script>
</html>