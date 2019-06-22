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
            String qr="select * from enquiry order by date";
            PreparedStatement stmt=con.prepareStatement(qr);
            ResultSet rs=stmt.executeQuery();
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Enquiries</title>
    </head>
    <body>
        <h1>ALL ENQUIRIES</h1>
        <table border="2">
               
                    <tr>
                        <th>Date</th>
                        <th>Patient Name</th>
                        <th>Address</th>
                        <th>Mobile No. </th>
                        <th>Email-ID</th>                       
                        <th>Disease</th>
                    </tr>
                
        <%   
            while(rs.next())
        {
            %>
          
                    <tr>
                        <td><%=rs.getString(6)%></td>
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
