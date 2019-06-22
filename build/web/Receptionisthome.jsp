<%-- 
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css" />
<link href="pictures/logo.png" rel="icon" type="image" />
<title>Welcome To AllCare PolyClinic</title>
<style type="text/css">
body,td,th {
	
	font-size: 20px;
}
body {
        background-image:url(pictures/medical.jpg);
        line-height:25px;
        background-size: 1550px 800px;
        background-color: lightgrey;
        background-repeat: no-repeat;
        margin:0;
	padding:0;

}
#doc{
    background-color: steelblue;
    margin-left: 130px;
    margin-top: 50px;
    border-radius: 5px;
    padding: 20px;
    font-size: 105%;
    float:left;
    width: 260px;
    font-family:  Georgia, "Times New Roman", Times, serif;
   
    
}
#pat{
    background-color: steelblue;
    margin-right: 630px;
     margin-top: 50px;
    border-radius: 5px;
    padding: 20px;
    font-size: 105%;
    float:right;
    width: 260px;
    font-family:  Georgia, "Times New Roman", Times, serif;
   
    
}
#doc ul li{
        
	text-align: left;
	
	list-style-type: none;
        padding-left:0px;      
}
#enquiry ul li{
        
	text-align: left;
	
	list-style-type: none;
        padding-left:0px;      
        
}
#appointment ul li{
        
	text-align: left;
	
	list-style-type: none;
        padding-left:0px;      
        
}
#doc ul li a{
      
	color: steelblue;
        font-family: "MS Serif", "New York", serif;
        font-size: large;
	text-decoration: none;
}
#doc ul li a:hover{
    background-color: lightskyblue;
}
#doc{
    font-family: "MS Serif", "New York", serif;
    text-align: left;
    padding-left: 50px;
}
#pat ul li{
	text-align: left;

	list-style-type: none;
        padding-left:0px;      
        
}
#pat ul li a{
      
	color: steelblue;
        font-family: "MS Serif", "New York", serif;
        font-size: large;
	text-decoration: none;
}
#pat ul li a:hover{
    background-color: lightskyblue;
}
#pat{
    font-family: "MS Serif", "New York", serif;
    text-align: left;
    padding-left: 50px;

}
#record{
    background-color: steelblue;
    margin-top: -215px;
    margin-right: 170px;
    border-radius: 5px;
    padding: 20px;
    font-size: 105%;
    float:right;
    width: 260px;
    font-family:  Georgia, "Times New Roman", Times, serif;
   
    
}
#record ul li{
	text-align: left;

	list-style-type: none;
        padding-left:0px;      
        
}
#record ul li a{
      
	color: steelblue;
        font-family: "MS Serif", "New York", serif;
        font-size: large;
	text-decoration: none;
}
#record ul li a:hover{
    background-color: lightskyblue;
}
#record{
    font-family: "MS Serif", "New York", serif;
    text-align: left;
    padding-left: 50px;
}
#enquiry a{
        color: steelblue;
        font-family: "MS Serif", "New York", serif;
        font-size: large;
	text-decoration: none;       
} 
#appointment a{
        color: steelblue;
        font-family: "MS Serif", "New York", serif;
        font-size: large;
	text-decoration: none;       
} 
#enquiry{
   text-align: left;
     background-color: steelblue;
     margin-top: 25px;
    margin-left: 130px;
    border-radius: 5px;
    padding: 20px;
    font-size: 105%;
    float:left;
    width: 260px;
    font-family:  Georgia, "Times New Roman", Times, serif;
   
}
#enquiry a:hover{
    color:lightskyblue;
}
#appointment{
   text-align: left;
     background-color: steelblue;
    margin-right: 650px;
    margin-top: 0px;
    border-radius: 5px;
    padding: 20px;
    font-size: 105%;
    float:right;
    width: 260px;
    font-family:  Georgia, "Times New Roman", Times, serif;
   
}
#appointment a:hover{
    color:lightskyblue;
}
#head2{
    border-bottom: solid black;
}  


</style>
 </head>
    <body>
         <div id="top"><a href="Logout">Logout</a></div>
    <div id="head1"><h1>All Care Polyclinic</h1></div>
    <div id="head2"><h3>Medical Dental And  <img src="pictures/logo.png"alt="l1"width="60" height="60"/>rthodontic Center</h3></div>
     
        
        <span> <div id="doc"> <b>Doctor</b></span>
        <ul>
            <li><a href="showdoctor.jsp"><input type="button" value="Doctor List" /> </a></li>
            <li><a href="adddoctor.jsp"><input type="button" value="Add Doctor" /></a></li>
            <li><a href="removedoctor.jsp"><input type="button" value="Remove Doctor" /></a></li>
            <li><a href="updatedoctor.jsp"><input type="button" value="Update Doctor" /></a></li>
        </ul>  
        </div>
        <div id="pat"><b>Patient</b>
        <ul>    
            <li><a href="showpatient.jsp"><input type="button" value="Patient List" /></a></li>
            <li><a href="addpatient.jsp"><input type="button" value="Add Patient" /></a></li>
            <li><a href="removepatient.jsp"> <input type="button" value="Remove Patient" /></a></li>
            <li><a href="updatepatient.jsp"> <input type="button" value="Update Patient" /></a></li>
        </ul>
        </div>
        <div id="record"><b>Records</b>
        <ul>    
            <li><a href="showrecord.jsp"> <input type="button" value="View Records" /></a></li>
            <li><a href="updaterecord.jsp"> <input type="button" value="Update Records" /></a></li>
            <li><a href="addrecord.jsp"><input type="button" value="Add Records " /></a></li>
            <li><a href="deleterecord.jsp"> <input type="button" value="Delete Records" /></a></li>
            <li><a href="searchrecord.jsp"> <input type="button" value="Search Records" /></a></li>
        </ul>
        </div> 
            <div id="enquiry"><b>Enquiry</b>
               <ul> <li><a href="viewenquiry.jsp"><input type="button" value="View Enquiries" /></a></li> </ul>
            </div>
            <div id="appointment"><b>Appointment</b>
               <ul> <li><a href="viewappointment"><input type="button" value="View appointments" /></a></li> </ul>
            </div>
            
           
    </body>
    <script type="text/javascript">
        function preventback()
        {
            window.history.forward();
        }
        setTimeout("preventback()",0);
        window.onunload=function (){null};
        </script>
</html>
