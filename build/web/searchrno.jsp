<%@page import="java.sql.*"%>

<%
   

        String id=request.getParameter("id");
            String driver=application.getInitParameter("driver-name");
            String url=application.getInitParameter("connection-url");
            String cid=application.getInitParameter("userid");
            String cpw=application.getInitParameter("password");
  

            Class.forName(driver);
            Connection con=(Connection)DriverManager.getConnection(url+"?autoReconnect=true&useSSL=false", cid, cpw);
            String qr="select * from record where r_no=?";
            PreparedStatement stmt=con.prepareStatement(qr);
            stmt.setInt(1,Integer.parseInt(id));
            ResultSet rs=stmt.executeQuery();
            boolean b=rs.next();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Records</title>
    </head>
    <body>
        <%   
            if(b)
        {
            %>
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
                
        
          
                    <tr>
                        <td><%=rs.getInt("r_no")%></td>
                        <td><%=rs.getString("p_id")%></td>
                        <td><%=rs.getString("d_id")%></td>
                        <td><%=rs.getString("disease")%></td>
                        <td><%=rs.getDate("last")%></td>
                        <td><%=rs.getDate("next")%></td>
                        
                    </tr>
                
                
            </table>
                        <%
                    }
                   %>
                   <% if(!b) { %>
                          
                   <h1>No Record Found.</h1>
                   <%@include file="searchbyrecord.jsp" %>
                           <%}%>
                           
                           <a href="Receptionisthome.jsp">HOME</a></br>
            <a href="searchrecord.jsp">Search-More</a>
    </body>
</html>
