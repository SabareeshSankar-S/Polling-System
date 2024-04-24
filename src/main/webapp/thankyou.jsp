<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
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
	
	<aside class="form_content_pages">
	
		<html:form action="generateReports">
		
			<img style="width:200px;height: 200px;padding-left: 150px;margin-bottom: 40px" src="<%= request.getContextPath() %>/images/smiley.png">
			<h1 style="font-size: xx-large;padding-left: 160px">THANK YOU !!</h1>
			<h2 style="color: #a4a4a4;padding-left: 120px">Your responses has been recorded.</h2>
			<html:submit styleClass="button" style="margin-top:20px;margin-left:180px" value="VIEW REPORTS"></html:submit>
		
		</html:form>
	
	</aside>

</body>

</html>
