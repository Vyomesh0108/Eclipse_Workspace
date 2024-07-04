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

ENTER STRING TO REVERSE : <h:inputText value="#{num.str}"></h:inputText>

<h:commandButton value="REVERSE IT" action="#{num.callRev}"></h:commandButton>

</h:form>

</c:view>


</body>
</html>