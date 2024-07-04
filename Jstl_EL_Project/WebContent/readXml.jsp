<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> DATA FROM XML FILE </h1>
<BR>

<c:import url="book.xml" var="myfile"></c:import>

<x:parse doc="${myfile}" var="data"></x:parse>

<x:forEach select="$data/books/book">

<x:out select="name" />
<x:out select="author" />
<x:out select="price" /> <br><br>


</x:forEach>


</body>
</html>