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

ID : <h:inputText value="#{ms.id }"></h:inputText>
NAME : <h:inputText value="#{ms.na }">
         <c:validateLength maximum="12" minimum="3"></c:validateLength>
    </h:inputText> <br>
 
MARKS1 : <h:inputText value="#{ms.m1 }">
    <c:validateRegex pattern="^[0-9]{1,3}$"></c:validateRegex>
  </h:inputText> <br>
  
MARKS2 : <h:inputText value="#{ms.m2 }">
      <c:validateRegex pattern="^[0-9]{1,3}$"></c:validateRegex>
    </h:inputText>
MARKS3 : <h:inputText value="#{ms.m3 }">
    <c:validateRegex pattern="^[0-9]{1,3}$"></c:validateRegex>
  </h:inputText>

<h:commandButton value="RESULT" action= "#{ms.next}"></h:commandButton>



</h:form>

</c:view>

</body>
</html>