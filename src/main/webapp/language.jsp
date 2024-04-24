<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>

<html>
	<head>
		<title>Login Form</title>
	    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/style.css">  
	   
	    <style type="text/css">
	    
			    body{
			    margin: 0; 
			    padding: 0; 
			      width:100%;
		   		 height:100%;
			    background-size: cover; 
			    background-repeat: no-repeat;
			     background-image: url('<%= request.getContextPath() %>/images/istockphoto-blur.jpg');
			    }
	 
	    </style>
	    
	</head>

	<body>
	
		<h1 style="margin-top:0px;padding: 20px 0px 20px 575px;background-color: black;color:white;">Make your yoice heard, Take the Election Survey!!</h1>
	
		<aside class="languageform">
	
			<html:html>
			
			<img style="width:200px;height: 200px;padding-left: 150px;margin-bottom: 40px" src="<%= request.getContextPath() %>/images/smiley.png">
			<h1 class="register" style="padding-left:20px">Choose your preferred language:</h1>
			<a href="./changeLanguage.do?language=ta" class="buttons" style="text-decoration: none">Tamil</a><br><br>
			<a href="./changeLanguage.do?language=hi" class="buttons" style="text-decoration: none">Hindi</a><br><br>
			<a href="./changeLanguage.do?language=ma" class="buttons" style="text-decoration: none">Malayalam</a><br><br>
			<a href="./changeLanguage.do?language=en" class="buttons" style="text-decoration: none">English</a><br><br>
			
			</html:html>
		
		</aside>
	
	</body>
</html>