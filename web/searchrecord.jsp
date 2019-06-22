

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css" />
<link href="pictures/logo.png" rel="icon" type="image" />
<title>Welcome To AllCare PolyClinic</title>
 <header class="ccheader"> <ul id="hme">
                            <li id="home"><a href="Receptionisthome.jsp"></a></li>
                          </ul>
   
</header>
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

#record{
    background-color: steelblue;
   margin-top: 50px;
    margin-right:650px;
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
    
}

#head2{
    border-bottom: solid black;
}
#home {
    left: 0px;
    width: 50px;
    height:50px;
    background: url('pictures/home1.png') 0 0;
    float:right; 
    margin-right: 20px;
  
}
#hme li, #hme a {
    height: 50px;
    display: block; 
}


</style>
 </head>
    <body>
      
    <div id="head1"><h1>All Care Polyclinic</h1></div>
    <div id="head2"><h3>Medical Dental And  <img src="pictures/logo.png"alt="l1"width="60" height="60"/>rthodontic Center</h3></div>
     
        
        
        <div id="record"><b>Records</b>
        <ul>    
            <li><a href="searchbyrecord.jsp"> <input type="button" value="Search By Record No." /></a></li>
            <li><a href="searchbydid.jsp"> <input type="button" value="Search By Doctor Id" /></a></li>
            <li><a href="searchbypid.jsp"><input type="button" value="Search By Patient Id " /></a></li>
            <li><a href="searchbydisease.jsp"> <input type="button" value="Search By Disease" /></a></li>
            
        </ul>
        </div> 
           
    </body>
</html>
