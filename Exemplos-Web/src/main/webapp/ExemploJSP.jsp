<%-- 
    Document   : ExemploJSP
    Created on : 07/10/2020, 13:09:28
    Author     : Gabriel
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="java.time.LocalDate"%>
<%@page import="br.senac.tads.pi3.exemplosweb.dados"%>
<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=UTF-8">
        <title>Exemplo </title>
    </head>
    <body>
        <%
              String ua = request.getHeader("User-Agent");
              LocalDateTime dataHora = LocalDateTime.now();

               dados dad = new dados();
               dad.setNome("Gabriel Moraes");
               dad.setDataNascimento(LocalDate.of(2000, 02, 27));
               dad.setPeso(new BigDecimal(85.0));
               dad.setAltura(new BigDecimal(1.75));
        %>
        <h1>Exemplo JSP</h1>
        <p>Data de Hora: <%= dataHora%> </p>
        <p>User agent: <%= ua%></p>
        <hr>
        <h2>Nome: <%=dad.getNome()%></h2>
        <h2>Data de nascimento: <%=dad.getDataNascimento()%></h2>
        <h2>Idade: <%=dad.getIdade()%></h2>
        <h2>Peso: <%=dad.getPeso()%></h2>
        <h2>Altura: <%=dad.getAltura()%></h2>
        <h2>IMC <%=dad.getImc()%></h2>
        
        
    </body>
</html>
