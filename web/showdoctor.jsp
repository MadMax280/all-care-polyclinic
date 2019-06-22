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
            String qr="select d_id,d_name,qualification,specialization,experience,d_type,password from doctor";
            PreparedStatement stmt=con.prepareStatement(qr);
            ResultSet rs=stmt.executeQuery();
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List OF Doctors</title>
    </head>
    <body>
        <h1>List Of Doctors</h1>
        <table border="2">
                
                    <tr>
                        <th>Doctor ID</th>
                        <th>Doctor Name</th>
                        <th>Qualification</th>
                        <th>Specialization</th>
                        <th>Experience</th>
                        <th>Type</th>
                        <th>Password</th>
                        <th>Image</th>
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
                        <td><%=rs.getString(6)%></td>
                        <td><%=rs.getString(7)%></td>
                        <td><img src="<%="ImageLoader?id="+rs.getString(1)%>" width="100" height="100"/></td>
                    </tr>
                
                <%
                    }
                   %>
            </table>
            <a href="Receptionisthome.jsp">HOME</a>
    </body>
</html>
