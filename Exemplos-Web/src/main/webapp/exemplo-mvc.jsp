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
        <link rel="stylesheet" href="Estilos.css">
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
         <p>Condição IMC:
            <c:choose>
                <c:when test="${dadosAttr.getImcResult() == 1}">
                    <span class="magreza">Magreza</span>
                </c:when>
                <c:when test="${dadosAttr.getImcResult() == 2}">
                    <span class="normal">Normal</span>
                </c:when>
                <c:when test="${dadosAttr.getImcResult() == 3}">
                    <span class="sobrepeso">Sobrepeso</span>
                </c:when>
                <c:when test="${dadosAttr.getImcResult() == 4}">
                    <span class="obesidade">Obesidade</span>
                </c:when>
                <c:when test="${dadosAttr.getImcResult() == 5}">
                    <span class="obesidade-grave">Obesidade grave</span>
                </c:when>
                    <c:otherwise>
                        <span>Não determinado</span>
                    </c:otherwise>
                    
            </c:choose>
        
        <p>Interesses</p>
        <c:choose>
            <c:when test="${dadosAttr.getInteresses() != null && dadosAttr.getInteresses().length > 0 }">
                        <ul>
                            <c:forEach var="interesses" items="${dadosAttr.getInteresses()}">
                            <li><c:out value="${interesses}"/> </li>
                            </c:forEach>
                        </ul>
            </c:when>
            <c:otherwise>
                <p>Nenhum interesse informado</p>
            </c:otherwise>
        </c:choose>
       
        
    </body>
</html>
