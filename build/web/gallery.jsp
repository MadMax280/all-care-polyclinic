 <html>
<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="CSS3 Lightbox - A CSS-only lightbox" />
        <meta name="keywords" content="css3, lightbox, overlay, effect, images, thumbnails, navigate" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style4.css" />
        <link href="pictures/logo.png" rel="icon" type="image" />
<style>
 
body {
	  background-image:url(pictures/medical.jpg);
        line-height:25px;
        background-size: 1550px 750px;
        line-height:25px;
        background-color: lightblue;
        background-repeat: no-repeat;
        margin:0;
	padding:0;

}
#home {
    left: 0px;
    width: 50px;
    height:50px;
    background: url('pictures/home1.png') 0 0;
    float: right;
    margin-right: 20px;
}
#hme li, #hme a {
    height: 50px;
    display: block;
}
#head{
    font-family: Tahoma, Geneva, sans-serif;
    font-size: 20px;
    text-align: center;
}

</style>
</head>
  <body id="page">
        <div class="container">
            <ul id="hme">
                             <li id="home"><a href="index.jsp"></a></li>
                           </ul>
			<div id="head"><h1>GALLERY</h1></div>
                          
			<section>
				<ul class="lb-album">
					<li>
						<a href="#image-1">
                                                    <img src="pictures/IMG_8071.JPG" height= "150" width="150" alt="image01"/>
						</a>
						<div class="lb-overlay" id="image-1">
                                                    <img src="pictures/IMG_8071.JPG" height= "1000" width="1500" alt="image01"/>
							<div>
								<a href="#image-8" class="lb-prev">Aalu</a>
								<a href="#image-2" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-2">
                                                    <img src="pictures/IMG_8073.JPG"height= "150" width="150" alt="image02"/>
							</a>
						<div class="lb-overlay" id="image-2">
							<img src="pictures/IMG_8073.JPG" height= "500" width="350"alt="image02" />
							<div>
								<a href="#image-1" class="lb-prev">Prev</a>
								<a href="#image-3" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-3">
                                                    <img src="pictures/IMG_8074a.jpg" height="150"width="150"alt="image03"/>
					
						</a>
						<div class="lb-overlay" id="image-3">
                                                    <img src="pictures/IMG_8074a.jpg" height="500"width="350"alt="image03" />
							<div>							
								
								<a href="#image-2" class="lb-prev">Prev</a>
								<a href="#image-4" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-4">
                                                    <img src="pictures/IMG_8075a.jpg" height= "150" width="150"alt="image04"/>
							
						</a>
						<div class="lb-overlay" id="image-4">
                                                    <img src="pictures/IMG_8075a.jpg" height= "500" width="350"alt="image04"/>
							<div>							
								
								<a href="#image-3" class="lb-prev">Prev</a>
								<a href="#image-5" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-5">
                                                    <img src="pictures/IMG_8077.JPG" height= "150" width="150"alt="image05"/>
						</a>
						<div class="lb-overlay" id="image-5">
                                                    <img src="pictures/IMG_8077.JPG" height= "500" width="350"alt="image05"/>
							<div>							
								
								<a href="#image-4" class="lb-prev">Prev</a>
								<a href="#image-6" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-6">
                                                    <img src="pictures/IMG_8078.JPG" height= "150" width="150"alt="image06"/>
							
						</a>
						<div class="lb-overlay" id="image-6">
                                                    <img src="pictures/IMG_8078.JPG" height= "500" width="350"alt="image06"/>
							<div>							
                                                            
								<a href="#image-5" class="lb-prev">Prev</a>
								<a href="#image-7" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-7">
                                                    <img src="pictures/IMG_8079a.jpg" height= "150" width="150"alt="image07"/>
							
						</a>
						<div class="lb-overlay" id="image-7">
                                                    <img src="pictures/IMG_8079a.jpg" height= "500" width="350"alt="image07"/>
							<div>							
								
								<a href="#image-6" class="lb-prev">Prev</a>
								<a href="#image-8" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-8">
                                                    <img src="pictures/IMG_8080a.jpg" height= "150" width="150"alt="image08"/>
							
						</a>
						<div class="lb-overlay" id="image-8">
                                                    <img src="pictures/IMG_8080a.jpg" height= "500" width="350"alt="image08"/>
							<div>							
								
								<a href="#image-7" class="lb-prev">Prev</a>
								<a href="#image-8" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-9">
                                                        <img src="pictures/Dental_Chair.jpg" height= "150" width="150" alt="image09"/>
							<span>Arabesque</span>
						</a>
						<div class="lb-overlay" id="image-9">
							<img src="pictures/Dental_Chair.jpg" height= "500" width="350" alt="image09"/>
							<div>							
								<h3>ar·a·besque <span>/?ar??besk/</h3>
								<p>Position of the body supported on one leg, with the other leg extended behind the body with the knee straight</p>
								<a href="#image-8" class="lb-prev">Prev</a>
								<a href="#image-10" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-10">
							<img src="pictures/opd.jpg" height= "150" width="150"alt="image10">
							<span>Ballerina</span>
						</a>
						<div class="lb-overlay" id="image-10">
                                                    <img src="pictures/opd.jpg" height= "500" width="350"alt="image10"/>
							
							<div>							
								<h3>bal·le·ri·na <span>/?bal??r?n?/</h3>
								<p>A female ballet dancer</p>
								<a href="#image-9" class="lb-prev">Prev</a>
								<a href="#image-1" class="lb-next">Next</a>
							</div>
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
				</ul>
			</section>
        </div>
</body>
</html> 