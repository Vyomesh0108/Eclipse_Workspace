<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
     <%@ taglib uri="http://java.sun.com/jsf/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:view>

ID : <h:inputText value="#{ms.id }"></h:inputText> <br>
NAME : <h:inputText value="#{ms.na }"></h:inputText> <br>
TOTAL = <h:inputText value="#{ms.total }"></h:inputText> <br>
PER = <h:inputText value="#{ms.per }"></h:inputText> <br>

</c:view>
</body>
</html>