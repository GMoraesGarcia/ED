<%-- 
    Document   : exemplo-mvc
    Created on : 13/10/2020, 10:34:58
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=UTF-8">
        <title>Exemplo servlet+JSP (MVC)</title>
    </head>
    <body>
      
        <h1>Exemplo servlet+JSP (MVC)</h1>
        <p>Data de Hora: <c:out value ="${dataHoraAttr}"/> </p>
        <p>User agent: <c:out value ="${uaAttr}"/></p>
        <hr>
        <h2>Nome: <c:out value ="${dadosAttr.getNome()}"/></h2>
        <h2>Data de nascimento: <c:out value ="${dadosAttr.getDataNascimento()}"/></h2>
        <h2>Idade: <c:out value ="${dadosAttr.getIdade()}"/></h2>
        <h2>Peso: <c:out value ="${dadosAttr.getPeso()}"/></h2>
        <h2>Altura: <c:out value ="${dadosAttr.getAltura()}"/></h2>
        <h2>IMC <c:out value ="${dadosAttr.getImc()}"/></h2>
        
        
    </body>
</html>
