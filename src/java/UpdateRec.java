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
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
public class UpdateRec extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        String s=(String)session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }
       PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            //id=&t1=Name&value=
        String id=request.getParameter("id");
        String field=request.getParameter("t1");
        String value=request.getParameter("value");
        
        int n=0;
        
        
        
        
        ServletContext sc=getServletContext();
            String driver=sc.getInitParameter("driver-name");
            String url=sc.getInitParameter("connection-url");
            String cid=sc.getInitParameter("userid");
            String cpw=sc.getInitParameter("password");
            
            Connection con=(Connection)DriverManager.getConnection(url, cid, cpw);
   String q="Select * from record where r_no=?";
    PreparedStatement ps=con.prepareStatement(q);
    ps.setString(1,id);
    
    ResultSet rs=ps.executeQuery();
        
        boolean b=rs.next();
        if(!b)
        {
        out.println("No Records Found For ID: "+id);
            RequestDispatcher rd=request.getRequestDispatcher("updaterecord.jsp");
            rd.include(request, response);
            
        }
            
        if(field.equalsIgnoreCase("patientid"))
        {
            String q1="select * from patient where p_id=?";
            PreparedStatement p1=con.prepareStatement(q1);
            
            p1.setString(1, value);
            ResultSet r=p1.executeQuery();
            if(!r.next())
            {
              out.println("Patient ID '"+value+"' does not exist");
               RequestDispatcher rd=request.getRequestDispatcher("updaterecord.jsp");
            rd.include(request, response);             
            }
            else
            {
            String qr="update record set p_id=? where r_no=?";
            ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
            n=ps.executeUpdate();
            }   
        }
        else if(field.equalsIgnoreCase("doctorid"))
        {    String q1="select * from doctor where d_id=?";
            PreparedStatement ps1=con.prepareStatement(q1);
            ps1.setString(1, value);
            ResultSet r1=ps1.executeQuery();
            if(!r1.next())
            {
              out.println("Doctor ID '"+value+"' does not exist");
               RequestDispatcher rd=request.getRequestDispatcher("updaterecord.jsp");
            rd.include(request, response);             
            }
            else 
            {
            String qr="update record set d_id=? where r_no=?";
            ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
             n=ps.executeUpdate();
            }
        }
         else 
        {
            String qr="update record set disease=? where r_no=?";
            ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
             n=ps.executeUpdate();
        }
             
        if(n==0)
        {
            out.println("No Record Updates");
            
        }    
        else
        {
            out.println("Record Updated of ID: '"+id+"'<br>");
            out.println("For Field: '"+field+"'<br>");
            out.println("with new Value: '"+value+"'<br>");
            out.println("<a href=Receptionisthome.jsp> HOME </a><br>");
            out.println("<a href=updaterecord.jsp> Update-More-Values </a><br>");
            
        }
        
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
            Logger.getLogger(UpdateRec.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UpdateRec.class.getName()).log(Level.SEVERE, null, ex);
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
