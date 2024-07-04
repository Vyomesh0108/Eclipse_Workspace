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

<h:form>

ENTER HEIGHT = <h:inputText value="#{tri.height }"></h:inputText> <br>
ENTER BASE = <h:inputText value="#{tri.base }"></h:inputText> <br><br>

<h:commandButton value="FIND AREA" action="#{tri.call }"></h:commandButton>

</h:form>

</c:view>


</body>
</html>