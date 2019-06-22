<%

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }

%>
<html>
    <link href="pictures/logo.png" rel="icon" type="image" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Patient</title>
    </head>
<header class="ccheader"> <ul id="hme">
                            <li id="home"><a href="Receptionisthome.jsp"></a></li>
                          </ul>
   
</header>
     <script type="text/javascript">
     function checkAll()
{
	var a=name();
	var b=address();
	var c=disease();
	var d=mobile();
	var e=date();
	if(a&&b&&d&&e&&c)
	{
		return true;
	}
	else
	{
		return false;
	}
}
function address()
{
var a=document.getElementById('address').value;
var al=/^[0-9a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
	if(!a.match(al))
	{
		alert("Some Symbols are not accepted in Address");
		return false;
	}
	else
	{
		return true;
	}
}
function mobile()
{
var a=document.getElementById('mobile').value;
var al=  /^[0-9]+$/;
	if(!a.match(al))
	{
		alert("enter valid mobile no.");
		return false;
	}
	else if(a.length<10)
	{
		alert(" Mobile No. Should of 10 numbers");
		return false;
	}
	else
	{
		return true;
	}
}
function name()
{
	var al= /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
	var a=document.getElementById('name').value;
	if(!a.match(al))
	{
	alert("Please Enter Correct Name");
	return false;
	}
	else if(a.length<3)
	{
		alert("Minlength of Name is 3 characters.");
		return false;
	}
	else
	{
		return true;
	}
}
function disease()
{
	var al= /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
	var a=document.getElementById('disease').value;
	if(!a.match(al))
	{
	alert("Numbers and Symbols not accepted.");
	return false;
	}
	else
	{
		return true;
	}
}
function date()
{
	var a=document.getElementById('dd').value;
	var b=document.getElementById('mm').value;
	var c=document.getElementById('yy').value;
	 var al=/^[0-9]+$/;
	 if(!a.match(al)|| !b.match(al)|| !c.match(al))
	{
		alert("enter valid date.");
		return false;
	}
	else{ var dd=parseInt(a);
	 var mm=parseInt(b);
     var yy=parseInt(c);

	if (mm < 1 || mm > 12) { // check mm range
  alert("mm must be between 1 and 12");
  return false;
 }
 else if (dd < 1 || dd > 31) {
  alert("Day must be between 1 and 31");
  return false;
 }
 else if ((mm==4 || mm==6 || mm==9 || mm==11) && dd>=31) {
  alert("mm "+mm+" doesn't have 31 days!")
  return false;
 }
else if (mm == 2) { // check for february 29th
  var isleap = (yy % 4 == 0 && (yy % 100 != 0 || yy % 400 == 0));
  if (dd>29 || (dd==29 && !isleap)) {
   alert("February " + yy + " doesn't have " + dd + " days!");
   return false;
    }
 }
 return true;
	}

   // date is valid

}
   
        
        
        
        
    </script>
<style type="text/css">
      body {
  margin: auto;
   background-image:url(pictures/medical.jpg);
        line-height:25px;
          background-repeat: no-repeat;
        background-size: 1550px 1150px; 
  font-family: 'Open Sans', sans-serif;
}
.container
{ 
    border: 1px solid black;
     border-radius: 5px;
  max-width:700px;
  width:100%;
  margin: 5% auto;
  background-color: skyblue;
  overflow: hidden;
}
.add{
    background-color: steelblue;
  color: #FFF;
  text-align: center;
  width: 60%;
  border:0;
  padding: 17px 25px;
  border-radius: 5px 5px 5px 5px;
  cursor: pointer;
  margin-top: 40px;
  font-size: 18px;
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
<div class="container">

    <form  action="StorePatient" method="GET" onsubmit="return checkAll()"  >
<fieldset>
    <h1>Add Patient</h1>

<!-- Form Name -->


<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Patient Name-</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
      <input  name="name" placeholder="Name" class="form-control" id="name" required="required" type="text">
    </div>
  </div>
</div>



<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Mobile No.-</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
       
  <input name="mobile" value="" id="mobile" required="required" maxlength="10" placeholder="Mobile Number" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Text input-->
      
<div class="form-group">
  <label class="col-md-4 control-label">Address-</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="address" id="address" required="required" placeholder="Address" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Select Basic -->
   
<div class="form-group">
  <label class="col-md-4 control-label">Date Of Birth-</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <input name="dd" placeholder="dd" class="form-control" id="dd" type="text" required="required" size="01" maxlength="2"/> <input name="mm" required="required" placeholder="mm" id="mm" class="form-control" type="text" size="01" maxlength="2"/> <input name="yy" required="required" placeholder="yyyy" id="yy"class="form-control" type="text" size="02" maxlength="4"minlength="4"/>
    </div>
  </div>
</div>




<!-- radio checks -->
 <div class="form-group">
                        <label class="col-md-4 control-label">Gender-</label>
                        <div class="col-md-4">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="gender" value="Male" checked="checked" /> Male
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="gender" value="Female" /> Female
                                </label>
                            </div>
                             <div class="radio">
                                <label>
                                    <input type="radio" name="gender" value="Other" /> Other
                                </label>
                            </div>
                        </div>
                    </div>

<!-- Text area -->
  
<div class="form-group">
  <label class="col-md-4 control-label">Disease-</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <textarea class="form-control" name="disease" id="disease" placeholder="Disease" required="required"></textarea>
  </div>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="add">
    <button type="submit" class="btn btn-warning" >Add <span class="glyphicon glyphicon-send"></span></button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div></html>