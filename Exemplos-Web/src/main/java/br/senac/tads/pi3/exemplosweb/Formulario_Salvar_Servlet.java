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
@WebServlet(name = "Formulario_Salvar_Servlet", urlPatterns = {"/formulario-salvar"})
public class Formulario_Salvar_Servlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
         
        String nomeStr = request.getParameter("nome");
        String dtNascimentoStr = request.getParameter("dataNascimento");
        String alturaStr = request.getParameter("altura");
        String pesoStr = request.getParameter("peso");
        String emailStr = request.getParameter("email");
        String senhaStr = request.getParameter("senha");
        String generoStr = request.getParameter("genero");
        
        String interesses [] = request.getParameterValues("interesses");
        
        Dados_Plus dados = new Dados_Plus();
        dados.setNome(nomeStr);
        dados.setDataNascimento(LocalDate.parse(dtNascimentoStr));
        dados.setAltura(new BigDecimal(alturaStr));
        dados.setPeso(new BigDecimal(pesoStr));
        dados.setInteresses(interesses);
        dados.setEmail(emailStr);
        dados.setSenha(senhaStr);
        if("1".equals(generoStr))
            dados.setGenero(1);
        else
            dados.setGenero(0);
        
        
        request.setAttribute("dados", dados);
        
       RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/resultado.jsp");
       dispatcher.forward(request, response);
    }

   

}
