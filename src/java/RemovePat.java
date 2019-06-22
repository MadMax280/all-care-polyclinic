/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 */
public class RemovePat extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
           String id=request.getParameter("id");
           
           ServletContext sc=getServletContext();
            String driver=sc.getInitParameter("driver-name");
            String url=sc.getInitParameter("connection-url");
            String cid=sc.getInitParameter("userid");
            String cpw=sc.getInitParameter("password");
            
            
            Class.forName(driver);
   Connection con=(Connection)DriverManager.getConnection(url, cid, cpw);
   String qr="Select p_name from patient where p_id=?";
    PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,id);
    
    ResultSet rs=ps.executeQuery();
        
        boolean b=rs.next();
        if(!b)
        {
            out.println("No Records Found For ID: "+id);
            RequestDispatcher rd=request.getRequestDispatcher("removepatient.jsp");
            rd.include(request, response);
            
        }
       String s=rs.getString(1);
       
       String qr1="delete from patient where p_id=?";
         PreparedStatement ps1=con.prepareStatement(qr1);
        ps1.setString(1, id);
        
        ps1.executeUpdate();
        out.println("<h1>Patient " +s+ " has been Removed.</h1>");
        
        
        out.println("<a href='removepatient.jsp'>Remove-More</a><br>");
        
       out.println("<a href=Receptionisthome.jsp>HOME</a>");
    

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
        } catch (SQLException ex) {
            Logger.getLogger(RemovePat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemovePat.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(RemovePat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemovePat.class.getName()).log(Level.SEVERE, null, ex);
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
