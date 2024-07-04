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

ID = <h:outputText value="#{std.sid}"></h:outputText> <br>
NAME = <h:outputText value="#{std.sna}"></h:outputText> <br>
AGE = <h:outputText value="#{std.sag}"></h:outputText> 

</c:view>


</body>
</html>