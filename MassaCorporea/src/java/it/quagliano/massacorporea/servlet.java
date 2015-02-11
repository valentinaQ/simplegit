/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.quagliano.massacorporea;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quintaia11
 */
public class servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FirstServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FirstServlet at " + request.getContextPath() + "</h1>");           
            
            //String nome = request.getParameter("nome");
            //out.println(nome);
            
            String pes = request.getParameter("peso");
            String alt=request.getParameter("altezza");
            int peso=Integer.parseInt(pes);
            int altezza=Integer.parseInt(alt);
            int IMC=peso/( (altezza/100) * (altezza/100) );
            if (IMC>=40)
            {
                out.println("obeso classe III");
            }
            else if (IMC>35 && IMC<39.99)
            {
                out.println("obeso classe II");
            }
            else if(IMC>30 && IMC<34.99)
            {
                out.println("obeso classe I");
            }
            else if(IMC>25 && IMC<29.99)
            {
                out.println("sovrappeso");
            }
            else if(IMC>18.50 && IMC<24.99)
            {
                out.println("regolare");
            }
            else if (IMC>16 && IMC<18.49)
            {
                out.println("sottopeso");
            }
            else if(IMC<16)
            {
                out.println("grave magrezza");
            }
            
            
            out.println("</body>");
            out.println("</html>");
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
