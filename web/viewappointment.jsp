 

<%@page import="java.sql.*"%>

<%
   

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }


            String driver=application.getInitParameter("driver-name");
            String url=application.getInitParameter("connection-url");
            String cid=application.getInitParameter("userid");
            String cpw=application.getInitParameter("password");
  

            Class.forName(driver);
            Connection con=(Connection)DriverManager.getConnection(url+"?autoReconnect=true&useSSL=false", cid, cpw);
            String qr="select * from appointment";
            PreparedStatement stmt=con.prepareStatement(qr);
            ResultSet rs=stmt.executeQuery();
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Appointment</title>
    </head>
    <body>
        <h1>ALL APPOINTMENT</h1>
        <table border="2">
               
                    <tr>
                      
                        <th>Patient Name</th>
                        <th>Email-ID</th>
                        <th>Mobile No. </th>
                        <th>Problem</th>                       
                        <th>Way To Reach</th>
                    </tr>
                
        <%   
            while(rs.next())
        {
            %>
          
                    <tr>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        
                       
                        
                    </tr>
                
                <%
                    }
                   %>
            </table>
            <a href="Receptionisthome.jsp">HOME</a>
    </body>
</html>
