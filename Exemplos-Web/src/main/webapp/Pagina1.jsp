<%-- 
    Document   : Pagina1
    Created on : 22/10/2020, 21:55:46
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos.css">
        <title>JSP Page</title>
    </head>
    <body class="exemplo-link">
        <c:import url="Cabecalho.jsp"/>
      
        <h1>Pagina1!</h1>
        <a href="./Subdiretorio/Pagina2.jsp">Acessar Pagina 2</a>
    </body>
</html>
