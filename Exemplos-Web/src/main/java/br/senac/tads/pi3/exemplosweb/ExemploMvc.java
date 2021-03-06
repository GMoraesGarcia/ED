
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
@WebServlet(name = "ExemploMvc", urlPatterns = {"/exemplo-mvc"})
public class ExemploMvc extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       request.setCharacterEncoding("UTF-8");
       String ua = request.getHeader("User-Agent");
       LocalDateTime dataHora = LocalDateTime.now();
       
       //String [] interesses = new String[] {"Esportes", "Comida", "Balada"};
       
       dados dad = new dados();
       dad.setNome("loco");
       dad.setDataNascimento(LocalDate.of(2000, 03, 20));
       dad.setPeso(new BigDecimal(90.3));
       dad.setAltura(new BigDecimal(1.80));
      // dad.setInteresses(interesses);
       
       request.setAttribute("uaAttr", ua);
       request.setAttribute("dataHoraAttr", dataHora);
       request.setAttribute("dadosAttr", dad);
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("exemplo-mvc.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  

}
