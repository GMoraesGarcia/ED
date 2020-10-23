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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "ExemploMvcPlus", urlPatterns = {"/exemplo-mvc-plus"})
public class ExemploMvcPlus extends HttpServlet {

   
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Recuperar dados por QuerryString
         request.setCharacterEncoding("UTF-8");
         
       
       
        String nomeSr  = request.getParameter("nome");
        String dataNascimentoSr = request.getParameter("nascimento");
        String AlturaSr = request.getParameter("altura");
        String PesoSr = request.getParameter("peso");
        
        String ua = request.getHeader("User-Agent");
       LocalDateTime dataHora = LocalDateTime.now();
         
       dados dad = new dados();
       dad.setNome(nomeSr);
       dad.setDataNascimento(LocalDate.parse(dataNascimentoSr));
       dad.setPeso(new BigDecimal(PesoSr));
       dad.setAltura(new BigDecimal(AlturaSr));
       
        request.setAttribute("uaAttr", ua);
       request.setAttribute("dataHoraAttr", dataHora);
       request.setAttribute("dadosAttr", dad);
       
       RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/exemplo-mvc-plus.jsp");
       dispacher.forward(request, response);
               
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }



}
