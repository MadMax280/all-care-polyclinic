/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

/**
 *
 * 
 */
public class StoreDoctor extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, FileUploadException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession();
        String a=(String)session.getAttribute("uid");
    if(a==null){
        response.sendRedirect("login.jsp");
    }
        
        
        PrintWriter out = response.getWriter();
        
        Connection con;
            
        String name="";
        String qualification="";
        String specialization="";
        String experience="";
        String type="";
        String password="";
        
        String d_id;
        
         byte b[]=null;
        
        int n=0;
         ServletContext sc=getServletContext();
            String driver=sc.getInitParameter("driver-name");
            String url=sc.getInitParameter("connection-url");
            String cid=sc.getInitParameter("userid");
            String cpw=sc.getInitParameter("password");
            
           
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
       
        List<FileItem> items=upload.parseRequest(new ServletRequestContext(request));
        
        for(FileItem it:items){
            String s=it.getFieldName();
          if(s.equals("name")){
               name=it.getString();
            }
          else if(s.equals("qualification")){
                qualification=it.getString();
            }
          else if(s.equals("specialization")){
                specialization=it.getString();
            }
          else if(s.equals("experience")){
                experience=it.getString();
            }
          else if(s.equals("type")){
                type=it.getString();
            }
          else if(s.equals("password")){
                password=it.getString();
            }
          else if(s.equals("image")){
               b=it.get();
            }
        }    
            
            
        Class.forName(driver);
   con=(Connection)DriverManager.getConnection(url, cid, cpw);
     Statement stmt=con.createStatement();
   
     //storebean m se id increment ka code
     
     ResultSet rs=stmt.executeQuery("select d_id from doctor");
        rs.afterLast();
        
                    
        if(!rs.previous())
        {
            d_id="D01";
        }
        else
        {            
            d_id=rs.getString(1);
            String s[]=  d_id.split("(?<=\\D)(?=\\d)");
             d_id=s[0];
            int i=Integer.parseInt(s[1])+1;
            d_id= d_id+(i < 10 ? "0" : "")+i;
        }
        
        
        String qr="insert into doctor value(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(qr);
        ps.setString(1,d_id);
        ps.setString(2,name);
        ps.setString(3,qualification);
        ps.setString(4,specialization);
        ps.setString(5,experience);
        ps.setString(6,type);
        ps.setString(7,password);
        ps.setBytes(8,b);
        n=ps.executeUpdate();
        out.println("<h2>Doctor Successfully Added.</h2>");
        out.println("<h1>The Generated ID for Doctor " +name+ " is: " +d_id+ "</h1>");
      
        out.println("<h3><a href=adddoctor.jsp>Add-More</a></h3><br>");
        out.println("<a href=Receptionisthome.jsp>HOME</a>");
        con.close();
        
        
        
        
        
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
        } catch (ClassNotFoundException | SQLException | FileUploadException ex) {
            Logger.getLogger(StoreDoctor.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException | SQLException | FileUploadException ex) {
            Logger.getLogger(StoreDoctor.class.getName()).log(Level.SEVERE, null, ex);
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
