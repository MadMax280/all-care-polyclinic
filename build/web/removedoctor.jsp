<%

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }

%>
<html><link href="pictures/logo.png" rel="icon" type="image" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Doctor</title>
    </head>
   <header class="ccheader"> <ul id="hme">
                            <li id="home"><a href="Receptionisthome.jsp"></a></li>
                          </ul>
   
</header>
    <style type="text/css">
        body {
  margin: auto;
   background-image:url(pictures/medical.jpg);
        line-height:25px;
          background-repeat: no-repeat;
        background-size: 1550px 1150px; 
  font-family: 'Open Sans', sans-serif;
}
.info p {
  text-align:center;
  color: black;
  text-transform:none;
  font-weight:600;
  font-size:30px;
  margin-top:2px
}

.info i {
  color:black;
}
form h1 {
  font-size: 18px;
  background: steelblue none repeat scroll 0% 0%;
  color: rgb(255, 255, 255);
  padding: 22px 25px;
  border-radius: 5px 5px 0px 0px;
  margin: auto;
  text-shadow: none; 
  text-align:left
}

form {
  border-radius: 5px;
  max-width:700px;
  width:100%;
  margin: 5% auto;
  background-color: skyblue;
  overflow: hidden;
}

p span {
  color: black;
}

p {
  margin: 0px;
  font-weight: 500;
  line-height: 2;
  color:#333;
}

h1 {
  text-align:center; 
  color: black;
  font-size: 40px;
  text-shadow: 1px 1px 0px #FFF;
  margin:50px 0px 0px 0px
}

input {
    
  border-radius: 0px 5px 5px 0px;
  border: 1px solid black;
  margin-bottom: 15px;
  width: 75%;
  height: 40px;
  float: left;
  padding: 0px 15px;
}

a {
  text-decoration:inherit
}

textarea {
  border-radius: 0px 5px 5px 0px;
  border: 1px solid black;
  margin: 0;
  width: 75%;
  height: 130px; 
  float: left;
  padding: 0px 15px;
}

.form-group {
  overflow: hidden;
  clear: both;
}
.icon-case {
  width: 35px;
  float: left;
  border:1px solid black;
  border-radius: 5px 0px 0px 5px;
  background:steelblue;
  height:38px;
  position: relative;
  text-align: center;
  line-height:40px;
}


i {
  color:#555;
}

.contentform {
  padding: 40px 30px;
}

.bouton-contact{
  background-color: steelblue;
  color: #FFF;
  text-align: center;
  width: 100%;
  border:0;
  padding: 17px 25px;
  border-radius: 0px 0px 5px 5px;
  cursor: pointer;
  margin-top: 40px;
  font-size: 18px;
}




.validation {
  display:none;
  margin: 0 0 10px;
  font-weight:400;
  font-size:13px;
  color: #DE5959;
}

#sendmessage {
  border:1px solid #fff;
  display:none;
  text-align:center;
  margin:10px 0;
  font-weight:600;
  margin-bottom:30px;
  background-color: #EBF6E0;
  color: #5F9025;
  border: 1px solid #B3DC82;
  padding: 13px 40px 13px 18px;
  border-radius: 3px;
  box-shadow: 0px 1px 1px 0px rgba(0, 0, 0, 0.03);
}

#sendmessage.show,.show  {
  display:block;
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
<body>
	  <h1>All Care Polyclinic</h1>
   <div class="info"><p> Medical Dental & Orthodontic Centre </p></div>
  
  <form action="RemoveDoc" method="POST">
	    <h1>Remove Doctor</h1>
             <div class="contentform">
    	<div id="sendmessage"> Doctor Added Successfully </div>


    	
			      <div class="form-group">
			        <p>Enter the ID of Doctor below whom you wish to Remove.<span>*</span></p>
			        <span class="icon-case"><i class="fa fa-male"></i></span>
				        <input type="text" name="id" id="id" data-rule="required"/>
                <div class="validation"></div>
       </div> 
        
	</div>
<button type="submit" class="bouton-contact">Remove</button>
	
</form>	

  
</body>
</html>