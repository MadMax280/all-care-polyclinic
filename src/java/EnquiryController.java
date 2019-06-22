/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 *
 */
public class EnquiryController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession();
        String s=(String)session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }
        
        
       PrintWriter out = response.getWriter();
        
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        String emailid=request.getParameter("emailid");
        String mobile=request.getParameter("mobile");
        String problem=request.getParameter("problem");
        
        
        
         ServletContext sc=getServletContext();
            String driver=sc.getInitParameter("driver-name");
            String url=sc.getInitParameter("connection-url");
            String cid=sc.getInitParameter("userid");
            String cpw=sc.getInitParameter("password");
            
            mypkg.EnquiryStore bean=new mypkg.EnquiryStore();
               
              bean.setDriver(driver);
              bean.setUrl(url);
              bean.setCid(cid);
              bean.setCpw(cpw);
              
              bean.setName(name);
              bean.setAddress(address);
              bean.setEmailid(emailid);
              bean.setMobile(mobile);
              bean.setProblem(problem);
             
               
              int n=bean.store();
              
              String view="";
              
              if(n!=0)
              {
                  view="enquiryadded.jsp";
              }  
              else
              {
                  view="error.jsp";
              }
              
              response.sendRedirect(view);
              
              
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EnquiryController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EnquiryController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
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
