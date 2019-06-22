/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
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
public class StorePatient extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession();
        String a=(String)session.getAttribute("uid");
    if(a==null){
        response.sendRedirect("login.jsp");
    }
        
        
       //name=&address=&mobile=&Date+of+Birth=&disease=
       PrintWriter out= response.getWriter();
        String name= request.getParameter("name");
        String address=request.getParameter("address");
        String mobile=request.getParameter("mobile");
        //String dob=request.getParameter("dob");
        String dd=request.getParameter("dd");   int d=Integer.parseInt(dd);
        String mm=request.getParameter("mm");   int m=Integer.parseInt(mm);
        String yy=request.getParameter("yy");   int y=Integer.parseInt(yy);
        String disease=request.getParameter("disease");
        String gender=request.getParameter("gender");
        
       // String dob=dd+"-"+mm+"-"+yy;
        int n=0;
         ServletContext sc=getServletContext();
            String driver=sc.getInitParameter("driver-name");
            String url=sc.getInitParameter("connection-url");
            String cid=sc.getInitParameter("userid");
            String cpw=sc.getInitParameter("password");
            
        
        
        //age cal    
         LocalDate cd=LocalDate.now();
          LocalDate bd=LocalDate.of(y, m, d);
          
          java.sql.Date dob=java.sql.Date.valueOf(bd);
             
           int age=Period.between(bd,cd).getYears();
           
        //registration date
        java.util.Date date=new java.util.Date();
            
            java.sql.Date dor=new java.sql.Date(date.getTime());
           
            Class.forName(driver);
Connection   con=(Connection)DriverManager.getConnection(url, cid, cpw);
     Statement stmt=con.createStatement();
   

     
     ResultSet rs=stmt.executeQuery("select p_id from patient");
        rs.afterLast();
        
          String p_id;          
        if(!rs.previous())
        {
            p_id="P01";
        }
        else
        {            
            p_id=rs.getString(1);
            String s[]=  p_id.split("(?<=\\D)(?=\\d)");
            p_id=s[0];
            int i=Integer.parseInt(s[1])+1;
            p_id= p_id+(i < 10 ? "0" : "")+i;
        }
        
         String qr="insert into patient value(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(qr);
        ps.setString(1, p_id);
        ps.setString(2,name);
        ps.setString(3, address);
        ps.setString(4, gender);
        ps.setDate(5,dob);
        ps.setInt(6,age);
        ps.setDate(7, dor);
        ps.setString(8,disease);
        ps.setString(9, mobile);
        
        n=ps.executeUpdate();
        
        out.println("<h1>The Generated ID for Patient " +name+ " is: " +p_id+ "</h1>");
        out.println("<h3><a href=addpatient.jsp>Add-More</a></h3>");
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
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(StorePatient.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(StorePatient.class.getName()).log(Level.SEVERE, null, ex);
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
