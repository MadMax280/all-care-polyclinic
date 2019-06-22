/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
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
public class StoreRecord extends HttpServlet {

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
        String a=(String)session.getAttribute("uid");
    if(a==null){
        response.sendRedirect("login.jsp");
    }
    
          PrintWriter out= response.getWriter();
    
        String pid= request.getParameter("pid");
        String did= request.getParameter("did");
        
        String dd=request.getParameter("dd");   
        String mm=request.getParameter("mm");   
        String yy=request.getParameter("yy");  
        
        java.sql.Date nvd=null;
        if(dd!=""||mm!=""||yy!="")
        {
        int d=Integer.parseInt(dd);
        int m=Integer.parseInt(mm);
        int y=Integer.parseInt(yy);
       
        LocalDate nv=LocalDate.of(y, m, d);
         nvd=java.sql.Date.valueOf(nv);
        }
        
        String disease=request.getParameter("disease");
        
        int n=0;
         ServletContext sc=getServletContext();
            String driver=sc.getInitParameter("driver-name");
            String url=sc.getInitParameter("connection-url");
            String cid=sc.getInitParameter("userid");
            String cpw=sc.getInitParameter("password");
        
          //NEXT VISIT DATE
          
        
          //LAST VISIT DATE
           java.util.Date lv=new java.util.Date();
            
            java.sql.Date lvd=new java.sql.Date(lv.getTime());
            
            Class.forName(driver);
            Connection   con=DriverManager.getConnection(url, cid, cpw);
            
            //CHECK IF PID EXIST OR NOT
            
         String q="select * from patient where p_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1, pid);
            ResultSet r=ps.executeQuery();
            if(!r.next())
            {
              out.println("Patient ID '"+pid+"' does not exist");
               RequestDispatcher rd=request.getRequestDispatcher("addrecord.jsp");
            rd.include(request, response); 
         
            }
          else
            {
         //CHECK IF DID EXIST OR NOT   
           String q1="select * from doctor where d_id=?";
            PreparedStatement ps1=con.prepareStatement(q1);
            ps1.setString(1, did);
            ResultSet r1=ps1.executeQuery();
            if(!r1.next())
            {
              out.println("Doctor ID '"+did+"' does not exist");
               RequestDispatcher rd=request.getRequestDispatcher("addrecord.jsp");
            rd.include(request, response);             
            }
            
        //RECORD ENTRY    
            else
            {
     Statement stmt=con.createStatement();
   

     
     ResultSet rs=stmt.executeQuery("select max(r_no) from record");
       
                
         int r_no=0;           
        if(!rs.next())
        {
         r_no=1;
        }
        else
        {
            r_no=rs.getInt(1);
            r_no=r_no + 1;
        }
        
         String qr="insert into record value(?,?,?,?,?,?)";
        PreparedStatement p = con.prepareStatement(qr);
        p.setInt(1,r_no );
        p.setString(2,pid);
        p.setString(3, did);
        p.setString(4, disease);
        p.setDate(5,lvd);
        p.setDate(6,nvd);
        
        p.executeUpdate();
        
        out.println("<h1>The Generated Record No is: '"+r_no+"'</h1>");
        out.println("<h3><a href=addrecord.jsp>Add-More</a></h3>");
        con.close();
            }
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreRecord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StoreRecord.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreRecord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StoreRecord.class.getName()).log(Level.SEVERE, null, ex);
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
