/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
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
public class UpdateDoc extends HttpServlet {

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
   String q="Select * from doctor where d_id=?";
    PreparedStatement ps=con.prepareStatement(q);
    ps.setString(1,id);
    
    ResultSet rs=ps.executeQuery();
        
        boolean b=rs.next();
        if(!b)
        {
        out.println("No Records Found For ID: "+id);
            RequestDispatcher rd=request.getRequestDispatcher("updatedoctor.jsp");
            rd.include(request, response);
        }
         String qualification=rs.getString("qualification");
            
        if(field.equalsIgnoreCase("name"))
        {
            String qr="update doctor set d_name=? where d_id=?";
            ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
            n=ps.executeUpdate();
            
            
        }
        else if(field.equalsIgnoreCase("qualification"))
        {
            String qr="update doctor set qualification=? where d_id=?";
            ps=con.prepareStatement(qr);
            value=value +","+ qualification;
            ps.setString(1, value);
            ps.setString(2, id);
             n=ps.executeUpdate();
        }
         else if(field.equalsIgnoreCase("specialization"))
        {
            String qr="update doctor set specialization=? where d_id=?";
            ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
             n=ps.executeUpdate();
        }
        else if(field.equalsIgnoreCase("experience"))
        {
            String qr="update doctor set experience=? where d_id=?";
           ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
           n=ps.executeUpdate();
        }
        else if(field.equalsIgnoreCase("type"))
        {   if(value.equalsIgnoreCase("Permanent")||value.equalsIgnoreCase("Trainee")||value.equalsIgnoreCase("visiting"))
            { String qr="update doctor set d_type=? where d_id=?";
              ps=con.prepareStatement(qr);
            ps.setString(1, value);
            ps.setString(2, id);
             n=ps.executeUpdate();
            }
            else
            {
               out.println("For TYPE field Kindly Enter the VALUE : Permanent or Visiting or Trainee.");
            RequestDispatcher rd=request.getRequestDispatcher("updatedoctor.jsp");
            rd.include(request, response); 
            }
        }
        else if(field.equalsIgnoreCase("password"))
        {
            String qr="update doctor set password=? where d_id=?";
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
            out.println("<a href=updatedoctor.jsp> Update-More-Values </a><br>");
            
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
            Logger.getLogger(UpdateDoc.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UpdateDoc.class.getName()).log(Level.SEVERE, null, ex);
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
