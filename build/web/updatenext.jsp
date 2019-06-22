<%-- 
    Document   : updatenext
    Created on : 19 Jun, 2017, 1:33:25 PM
    Author     : Kunal Awasthi
--%>
<%

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="pictures/logo.png" rel="icon" type="image" />
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Record</title>
  
    <header class="ccheader"> <ul id="hme">
                            <li id="home"><a href="Receptionisthome.jsp"></a></li>
                          </ul>
   
</header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Next Visti Date</title>
    </head>
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
  background-color: grey;
  overflow: hidden;
}
.add{
    background-color: black;
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
    <body>
        <div class="container">

    <form  action="UpdateNxt" method="POST"  >
<fieldset>
    <h1>Update Next Visit Date</h1>
            
              <div class="form-group">
  <label class="col-md-4 control-label">Enter Record No.-</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
      <input  name="id" placeholder="Record No." class="form-control" id="name" required="required" type="text">
    </div>
  </div>
</div>


<!-- Select Basic -->
   
<div class="form-group">
  <label class="col-md-4 control-label">Enter Next Visit Date-</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <input name="dd" placeholder="dd" class="form-control" id="dd" type="text" required="required" size="01" maxlength="2"/> <input name="mm" required="required" placeholder="mm" id="mm" class="form-control" type="text" size="01" maxlength="2"/> <input name="yy" required="required" placeholder="yyyy" id="yy"class="form-control" type="text" size="02" maxlength="4"minlength="4"/>
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
    </div>
    </body>
</html>
