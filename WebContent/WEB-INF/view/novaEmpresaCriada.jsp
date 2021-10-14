 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
	<body>
	
		<c:if test="${not empty empresa}">
			Empresa ${empresa} cadastrada com sucesso! <!-- Expression language -->
		</c:if>
		
		<c:if test="${empty empresa}">
			Empresa ${empresa} Nenhuma cadastrada com sucesso! <!-- Expression language -->
		</c:if>
		
	</body>
</html>