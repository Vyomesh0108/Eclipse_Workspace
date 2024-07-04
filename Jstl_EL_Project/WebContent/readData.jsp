<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> DATA FROM DATABASE USINH JSTL</h1>
<BR>

<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/stddb" user="root" password="" var="con" />

<sql:query dataSource="${con }" var="result"> select * from mytab </sql:query>
<c:forEach var="row" items="${result.rows }">

<c:out value="${row.sid }"></c:out> 
<c:out value="${row.sna }"></c:out> 
<c:out value="${row.sag }"></c:out> <br><br>

</c:forEach>

</body>
</html>