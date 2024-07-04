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
 
 ID : <h:inputText value="#{std.sid}"></h:inputText> <br>
 NAME : <h:inputText value="#{std.sna}"></h:inputText> <br>
 AGE : <h:inputText value="#{std.sag}"></h:inputText>
 
 <h:commandButton value="SHOW DATA" action="#{std.callNext}"></h:commandButton>

 </h:form>
 
 </c:view>


</body>
</html>