/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.exemplosweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
@WebServlet (name = "ExemploServlet", urlPatterns =  "/exemplo-servlet")
public class ExemploServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException,ServletException{
        request.setCharacterEncoding("UTF-8");
       String ua = request.getHeader("User-Agent");
       LocalDateTime dataHora = LocalDateTime.now();
       
       dados dad = new dados();
       dad.setNome("Gabriel");
       dad.setDataNascimento(LocalDate.of(2000, 02, 27));
       dad.setPeso(new BigDecimal(85.0));
       dad.setAltura(new BigDecimal(1.75));
       
        try(PrintWriter out = response.getWriter()){
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Exemplo servlet</title>");
            out.print("<meta charset =/UTF-8>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Exemplo Servlet</h1>");
            out.print("<p>Data e Hora " + dataHora + "</p>");
            out.print("<p> User agent " + ua+"</p>");
            out.print("<hr>");
            out.print("<h2>" + dad.getNome() + "</h2>");
            out.print("<h2> Data de nascimento: " + dad.getDataNascimento() + "</h2>");
            out.print("<h2> Idade: " + dad.getIdade()+ "</h2>");
            out.print("<h2> Altura: " + dad.getAltura()+ "</h2>");
            out.print("<h2> Peso: " + dad.getPeso()+ "</h2>");
            out.print("<h2> IMC: " + dad.getImc()+ "</h2>");
            
            out.print("</body>");
            out.print("</html>");
            
            
        }
    }
    
}
