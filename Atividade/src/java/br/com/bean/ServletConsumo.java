/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.bean;

import br.com.DTO.ConsumoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConsumo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            ConsumoDTO cs = new ConsumoDTO();
            cs.setKmifim(Double.valueOf(request.getParameter("kmf")));
            cs.setKmini(Double.valueOf(request.getParameter("kmi")));
            cs.setLitros(Double.valueOf(request.getParameter("litros")));
           request.setAttribute("TOTAL", cs.consumoMedia());
            RequestDispatcher rd
            = request.getRequestDispatcher("resposta.jsp"); 
           //rd e o objeto que indica a pagina que recebera a resposta
            rd.forward(request, response); 
        }
    }

}
