/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.exemplosweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "Form_Validacao_Salvar_Serv", urlPatterns = {"/form-salvar-validacao"})
public class Form_Validacao_Salvar_Serv extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao =  request.getSession();
        Dados_Plus dados = (Dados_Plus)sessao.getAttribute("dados");
        sessao.removeAttribute("dados");
        
        request.setAttribute("dados", dados);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/resultado.jsp");
        dispatcher.forward(request, response);
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
        
        BigDecimal altura  = null;
        if(alturaStr != null && alturaStr.trim().length()>0){
            altura = new BigDecimal(alturaStr);
        }
        BigDecimal peso  = null;
        if(pesoStr != null && pesoStr.trim().length()>0){
            peso = new BigDecimal(pesoStr);
        }
        LocalDate dataNascimento = null;
        if(dtNascimentoStr != null && dtNascimentoStr.trim().length() >0){
            dataNascimento = LocalDate.parse(dtNascimentoStr);
        }
        
        //validação nome
        boolean nomeValido = nomeStr != null && nomeStr.trim().length() >0;
         
        //Validação do e-mail
      
        boolean emailValido = (emailStr != null && emailStr.trim().length() >0 );
        if(emailValido){
        /*    Pattern emailPattern = Pattern.compile("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i");
            Matcher emailMatcher = emailPattern.matcher(emailStr);
            emailValido = emailValido && emailMatcher.matches();*/
        }
        
        
        //Validação altura
        boolean alturaValidacao = (altura != null && altura.compareTo(new BigDecimal("4.00")) < 0);
        
        //Validação de Peso
        boolean pesoValidacao = (peso != null && peso.compareTo(new BigDecimal("400.00"))< 0);
        
        //Validação da data de nascimento
        boolean dataNascimentoValida = (dataNascimento != null && dataNascimento.isBefore(LocalDate.now()));
        
        boolean camposValidosGlobal = nomeValido && emailValido && alturaValidacao && pesoValidacao && dataNascimentoValida;
        if(!camposValidosGlobal){
            //Representa form com mensagens de erro
            if(!nomeValido){
                request.setAttribute("nomeErro", "Nome deve ser preenchido");
            }
            if(!emailValido){
                request.setAttribute("emailErro", "E-mail deve ser preenchido");
            }
            if(!alturaValidacao){
                request.setAttribute("AlturaErro", "Altura invalida");
            }
            if(!pesoValidacao){
                request.setAttribute("PesoErro", "Peso Invalido");
            }
            if(!dataNascimentoValida){
                request.setAttribute("DataDeNascimentoErro","Data de Nascimento invalida");
            }
            request.setAttribute("nome", nomeStr);
            request.setAttribute("dataNascimento", dataNascimento);
            request.setAttribute("altura", alturaStr);
            request.setAttribute("email", emailStr);
            request.setAttribute("peso", pesoStr);
            request.setAttribute("genero", generoStr);
            List<String> interessesList = Arrays.asList(interesses);
            request.setAttribute("interesses", interessesList);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Form_Validacao.jsp");
            dispatcher.forward(request, response);
            return;
        }
       
        
        Dados_Plus dados = new Dados_Plus();
        dados.setNome(nomeStr);
        dados.setDataNascimento(dataNascimento);
        dados.setAltura(altura);
        dados.setPeso(peso);
        dados.setInteresses(interesses);
        dados.setEmail(emailStr);
        dados.setSenha(senhaStr);
        if("1".equals(generoStr))
            dados.setGenero(1);
        else
            dados.setGenero(0);
        
        
     //  request.setAttribute("dados", dados);
     /*  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/resultado.jsp");
       dispatcher.forward(request, response);*/
      
     HttpSession sessao = request.getSession();
     sessao.setAttribute("dados", dados);
     
      response.sendRedirect("form-salvar-validacao");
    }

  
}
