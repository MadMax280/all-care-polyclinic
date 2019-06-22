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
            String qr="select * from patient";
            PreparedStatement stmt=con.prepareStatement(qr);
            ResultSet rs=stmt.executeQuery();
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List OF Patient</title>
    </head>
    <body>
        <h1>List Of Patients</h1>
        <table border="2">
                
                    <tr>
                        <th>Patient ID</th>
                        <th>Patient Name</th>
                        <th>Address</th>
                        <th>Mobile No. </th>
                        <th>Gender</th>
                        <th>Date of Birth</th>
                        <th>Age</th>
                        <th>Date of Registration</th>
                        <th>Disease</th>
                    </tr>
                
        <%   
            while(rs.next())
        {
            %>
          
                    <tr>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(9)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td><%=rs.getString(6)%></td>
                        <td><%=rs.getString(7)%></td>
                        <td><%=rs.getString(8)%></td>
                        
                    </tr>
                
                <%
                    }
                   %>
            </table>
            <a href="Receptionisthome.jsp">HOME</a>
    </body>
</html>
