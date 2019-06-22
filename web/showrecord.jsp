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
            String qr="select * from record";
            PreparedStatement stmt=con.prepareStatement(qr);
            ResultSet rs=stmt.executeQuery();
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Records</title>
    </head>
    <body>
        <h1>List Of Records</h1>
        <table border="2">
                
                    <tr>
                        <th>Record No.</th>
                        <th>Patient ID</th>
                        <th>Doctor ID</th>
                        <th>Disease </th>
                        <th>Last Visit Date</th>
                        <th>Next Visit Date</th>
                    </tr>
                
        <%   
            while(rs.next())
        {
            %>
          
                    <tr>
                        <td><%=rs.getInt("r_no")%></td>
                        <td><%=rs.getString("p_id")%></td>
                        <td><%=rs.getString("d_id")%></td>
                        <td><%=rs.getString("disease")%></td>
                        <td><%=rs.getDate("last")%></td>
                        <td><%=rs.getDate("next")%></td>
                        
                    </tr>
                
                <%
                    }
                   %>
            </table>
            <a href="Receptionisthome.jsp">HOME</a>
    </body>
</html>
