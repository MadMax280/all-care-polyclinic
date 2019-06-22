<%

String s=(String) session.getAttribute("uid");
    if(s==null){
        response.sendRedirect("login.jsp");
    }

%>
<html><link href="pictures/logo.png" rel="icon" type="image" />
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Record Entry Form</title>
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

    <form  action="StoreRecord" method="POST"  >
<fieldset>

<!-- Form Name -->
<legend>Add Record!</legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Patient Id-</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <input  name="pid" placeholder="Patient Id" class="form-control" required="required" type="text"/>
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Doctor Id-</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <input  name="did" placeholder="Doctor Id" class="form-control"  type="text" required="required"/>
    </div>
  </div>
</div>



<!-- Select Basic -->
   
<div class="form-group">
  <label class="col-md-4 control-label">Next Date of visit-</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <input name="dd" placeholder="dd" class="form-control" id="dd" type="text" size="01" maxlength="2" required="required"/> <input name="mm" placeholder="mm" required="required" id="mm" class="form-control" type="text" size="01" maxlength="2"/> <input name="yy" required="required" placeholder="yyyy" id="yy"class="form-control" type="text" size="02" maxlength="4"minlength="4"/>
    </div>
  </div>
</div>





<!-- Text area -->
  
<div class="form-group">
  <label class="col-md-4 control-label">Disease-</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        	<textarea class="form-control" name="disease" placeholder="Disease" required="required"></textarea>
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