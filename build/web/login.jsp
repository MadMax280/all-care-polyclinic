

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style1.css">
        <link rel="stylesheet" href="css/styles.css">
        <link href="css/style1.css" rel="stylesheet" type="text/css" />
         <link href="css/styles.css" rel="stylesheet" type="text/css" />
         <link href="pictures/logo.png" rel="icon" type="image" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
       
            
<style type="text/css">
body,td,th {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 20px;
       
}
#navbar {
	width: 1000px;

}
#navbar {
	width: 800px;
	margin-right: auto;
	margin-left: auto;
        padding-right:100px;
        text-align: center;
	font-family: Tahoma, Geneva, sans-serif;
        
}
a:link {
	color: steelblue;
	text-decoration: none;
}
a:hover {
	color: skyblue;
	text-decoration: none;
}
a:visited {
        color:steelblue;
	text-decoration:none;
}
a:active {
	text-decoration: none;
	
}
#ap{
    color: steelblue;
    padding-top: 20px;
    padding-left: 1000px;
    display: block;
    font-family:  Georgia, "Times New Roman", Times, serif;
    font-size: 30px;
}
#ap a:hover{
    background-color: skyblue;
    color:steelblue;
}

#contact{
    width: 545px;
    height: 280px;
    box-sizing: border-box;
    float: top;
    border: solid lightgrey;
    border-bottom-color: darkgray;
    font-family: Georgia, "Times New Roman", Times, serif;
    background-color: lightgrey;
}
body {
	
        background-image:url(pictures/medical.jpg);
        line-height:25px;
        background-size: 1550px 900px; 
        background-repeat: no-repeat;
        margin:0;
	padding:0;

}

a:link {
	color: green;
	text-decoration: none;
}
a:hover {
	color: #09F;
	text-decoration: none;
}
a:visited {
        color:#b5cd60;;
	text-decoration:none;
}
a:active {
	text-decoration: none;
	
}
#hd{
    
    font-family: Georgia, "Times New Roman", Times, serif;
     border:solid black;
     text-align: center;
     color:steelblue;
}
        </style>
    </head>
    <body>
      

      <div id="hd"><h1>Please Login</h1></div>
 <div id="navbar">
 
<nav>
<ul>
    
    
<li><a href="index.jsp"> Home</a></li>

<li><a href="services.jsp">Services</a>
    
<ul>
<li><a href="services.jsp">Dental</a>
 <ul>
   <li><a href="services.jsp"> Orthodontist </a></li>
   <li><a href="services.jsp"> General Dentistry </a></li>
   <li><a href="services.jsp"> Prosthodontist </a></li>
   <li><a href="services.jsp"> Oral and Maxillofacial  </a></li>
   <li><a href="services.jsp"> Periodontist </a></li>
   <li><a href="services.jsp"> Pedodontist </a></li>
   <li><a href="services.jsp"> Endodontist </a></li>
 </ul>
</li>
<li><a href="services.jsp">Medical</a>
 <ul>
   <li><a href="services.jsp"> Physician </a></li>
   <li><a href="services.jsp"> Cardiologist </a></li>
   <li><a href="services.jsp"> Diabetologist </a></li>
   <li><a href="services.jsp"> Obstetrician </a></li>
   <li><a href="services.jsp"> Gynaecologist </a></li>
   <li><a href="services.jsp"> Infertility Specialist </a></li>
   <li><a href="services.jsp"> Pediatrician </a></li>
   <li><a href="services.jsp"> General Surgeon </a></li>
   <li><a href="services.jsp"> Opthalmologist </a></li>
   <li><a href="services.jsp"> Colorectal Surgeon </a></li>
   <li><a href="services.jsp"> Hemato-oncologist </a></li>
   <li><a href="services.jsp"> Physiotherepist </a></li>
   <li><a href="services.jsp">Homoeopath </a></li>
   <li><a href="services.jsp">Ayurveda</a></li>
   <li><a href="services.jsp">Nutritionist </a></li>
   <li><a href="services.jsp">Dietician </a></li>

  </ul>
</li>


</ul>
</li>
<li><a href="ourteam.jsp"> OurTeam </a></li>
<li><a href="gallery.jsp">Gallery</a></li>
<li><a href="services.jsp"> Sterlization</a></li>
<li><a href="aboutus.jsp">About Us</a></li>
<li><a href="enquiry.jsp"> Enquiry </a></li>
<li><a href="contact.jsp"> Contact Us</a></li>

    
</ul>
</nav>
</div>
      <br>
      <br>
      <br>
      <div id="login">
      <form name='form-login' action="VerifyController">
        <span class="fontawesome-user"></span>
          <input type="text" id="user" placeholder="Username" name="userid">
       
        <span class="fontawesome-lock"></span>
        <input type="password" id="pass" placeholder="Password" name="password">   
      <span font-size="20px">TYPE</span> <select name="type" id="type" >
              <option>Receptionist</option>
              <option>Doctor</option>
          </select>
		
        <input type="submit" value="Login">
</form>
  
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
