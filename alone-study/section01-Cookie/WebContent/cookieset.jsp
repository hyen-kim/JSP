<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		//							�̸� 			��
		Cookie cookie = new Cookie("cookieN", "cookieV");		// ��Ű ��ü ����
		cookie.setMaxAge(60*60);								// ��Ű �Ӽ� ���� : �ѽð� ���� ����
		response.addCookie(cookie);								// ����ϹǷ� response						
	%>
	
	<a href="cookieget.jsp">cookie get</a>

</body>
</html>