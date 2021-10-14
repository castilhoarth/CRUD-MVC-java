<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@
	page import = "java.util.List, br.com.alura.gerenciador.modelo.Empresa"
 %> 
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard TagLib</title>
</head>
<body>

	Lista de empresas
	<hr>
	<ul>
		<c:forEach items="${lista}" var="empresa">
		
			<li> ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/></li> 
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">edita</a>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">remove</a>
		</c:forEach>
	</ul>

	
</body>
</html>