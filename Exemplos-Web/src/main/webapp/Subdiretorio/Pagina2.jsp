<%-- 
    Document   : Pagina1
    Created on : 22/10/2020, 21:54:21
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Estilos.css"/>
        <title>JSP Page</title>
    </head>
    <body class="exemplo-link">
           <c:import url="../Cabecalho.jsp"/>
        <h1>Pagina2</h1>
        <a href="../Pagina1.jsp">Acessar Pagina1 </a>
    </body>
</html>
