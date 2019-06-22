<%-- 
    Document   : addapp
    Created on : 19 Jun, 2017, 4:16:32 PM
    Author     : zulfiqar-%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String mobile=request.getParameter("phone");
    String problem=request.getParameter("problem");
    String way=request.getParameter("t1");
    
    
            String driver=application.getInitParameter("driver-name");
            String url=application.getInitParameter("connection-url");
            String cid=application.getInitParameter("userid");
            String cpw=application.getInitParameter("password");
  

            Class.forName(driver);
            Connection con=(Connection)DriverManager.getConnection(url+"?autoReconnect=true&useSSL=false", cid, cpw);
            String qr="insert into appointment value(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(qr);
            ps.setString(1, name);
            ps.setString(2,email);
            ps.setString(3,mobile);
            ps.setString(4,problem);
            ps.setString(5,way);
            
            int n=0;
            String show="";
            n=ps.executeUpdate();
            if(n==0)
            {
                show="No Record Add.";
            }
            else
            {
                show= "Your Appointment Request has been submitted. We will contact you in sometime.";
            }
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointment</title>
    </head>
    <body>
        <h1><%=show%></h1>
        <h3>!THANK YOU!</h3>
        <h1><a href="index.jsp">HOME</a></h1>
    </body>
</html>
