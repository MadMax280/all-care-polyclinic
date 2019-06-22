<head>
<link href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<link href="pictures/logo.png" rel="icon" type="image" />
<header class="ccheader"> <ul id="hme">
                            <li id="home"><a href="index.jsp"></a></li>
                          </ul>
    <title>Enquiry Form</title>
   
</header>
</head>
<style type="text/css">
body,td,th {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 20px;
}
h1{
    color:black;
}
body {
	
        background-image:url(pictures/medical.jpg);
        line-height:25px;
        background-size: 1550px 1200px;
        
        background-repeat: no-repeat;
        margin:0;
	padding:0;

}
a:link {
	color: white;
	text-decoration: none;
}
a:hover {
	color: skyblue;
	text-decoration: none;
}
a:visited {
        color:#b5cd60;;
	text-decoration:none;
}
a:active {
	text-decoration: none;
	
}
#home {
    left: 0px;
    width: 50px;
    height:50px;
    background: url('pictures/home1.png') 0 0;
    float:right;  
  
}
#hme li, #hme a {
    height: 50px;
    display: block; 
}


</style>
<header class="ccheader">
    <h1>Enquiry Form</h1>	
</header>
<div class="wrapper">
    <form method="get" action="EnquiryController" class="ccform">
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-user fa-2x"></i></span>
        <input class="ccformfield" type="text" name="name" placeholder="Full Name" required>
    </div>
        <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-home fa-2x"></i></span>
        <input class="ccformfield" type="text" name="address"placeholder="Your Address" required>
        </div>
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-envelope fa-2x"></i></span>
        <input class="ccformfield" type="text" name="emailid"placeholder="Email" required>
    </div>
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-mobile-phone fa-2x"></i></span>
        <input class="ccformfield" type="text" name="mobile" placeholder="Phone" required="required">
    </div>
    
    <div class="ccfield-prepend">
        <span class="ccform-addon"><i class="fa fa-comment fa-2x"></i></span>
        <textarea class="ccformfield" rows="8" name="problem" placeholder="Describe your problem" required></textarea>
    </div>
    <div class="ccfield-prepend">
        <input class="ccbtn" type="submit" value="Submit">
    </div>
    </form>
</div>
<div class="credit">
<p>&nbsp;</p>

</div>
 