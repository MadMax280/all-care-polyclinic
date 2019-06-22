
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }
  
String driver=application.getInitParameter("driver-name");
            String url=application.getInitParameter("connection-url");
            String cid=application.getInitParameter("userid");
            String cpw=application.getInitParameter("password");
  
            java.util.Date lv=new java.util.Date();
            
            java.sql.Date lvd=new java.sql.Date(lv.getTime());

            Class.forName(driver);
            Connection con=(Connection)DriverManager.getConnection(url+"?autoReconnect=true&useSSL=false", cid, cpw);
            String qr="select d_name from doctor where d_id=?";
            PreparedStatement stmt=con.prepareStatement(qr);
            stmt.setString(1,s);
           
            ResultSet r=stmt.executeQuery();
            r.next();
            
            String q="select * from record where d_id=? AND next=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,s);
            ps.setDate(2, lvd);
            ResultSet rs=ps.executeQuery();
            
String pname="";
           
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor Home</title>
    </head>
    <body>
        <h1>Welcome Doctor <%=r.getString(1).toUpperCase()%> </h1> <h5 align="right"><a href="Logout">LOGOUT</a></h5>
        
        <h1>Your Today's Appointments are:</h1>   
        <table align="center" border="0" cellpadding="10" cellspacing>
            <tr>
                <th>PATIENT ID</th>
                 <th>PATIENT NAME</th>
                  <th>DISEASE</th>
                  <th> DATE </th>
            </tr>
        <% while(rs.next())
        {  
            String q1="select p_name from patient where p_id=?";
            PreparedStatement ps1=con.prepareStatement(q1);
            ps1.setString(1,rs.getString(2));
            ResultSet rs1=ps1.executeQuery();
            if(rs1.next())
            {
           pname=rs1.getString(1);
            }
           
        %>
        <tr>
            <td><%=rs.getString(2).toUpperCase()%></td>
            <td><%=pname.toUpperCase()%></td>
            <td><%=rs.getString("disease").toUpperCase()%></td>
            <td><%=rs.getDate("next")%></td>
        </tr>
        
        <% } %>
    </body>
</html>
