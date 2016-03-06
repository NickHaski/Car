<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
	<h1>This is new shop: ${shop.shopName}</h1>
	
	<c:forEach  var="car" items="${cars}">
	   <c:out value="${car}"/>
	</c:forEach>
	
</body>
</html>