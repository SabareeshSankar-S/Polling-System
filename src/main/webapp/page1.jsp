<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>

<html>
	<head>
		<title>Login Form</title>
	    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/style.css">
	    
	    <style type="text/css">
	    
		    body{
		    margin: 0px; 
		    padding: 0px; 
		    width:100%;
		    height:100%;
		    background-size: 100%; 
		    background-repeat: no-repeat;
		     background-image: url('<%= request.getContextPath() %>/images/istockphoto-blur.jpg');
		    }
	 
	    </style>
	    
	</head>

	<body>
	
		<h1 style="margin-top:0px;padding: 20px 0px 20px 575px;background-color: black;color:white;">Make your yoice heard, Take the Election Survey!!</h1>
		
		<aside class="form_content_pages">
		
			<html:form action="goToPage2">
			
					<h2 >1.Are you a registered voter in India?</h2>
									<html:radio  property="voterCapability" value="yes"/><h3>YES<br>
									<html:radio  property="voterCapability" value="no"/><h3>NO<br>
									
					<h2>2.Are you interested to vote in the upcoming election?</h2>
									<html:radio property="voteInterest" value="yes"/><h3>YES<br>
									<html:radio property="voteInterest" value="no"/><h3>NO<br>
									
					<h2>3.If the election were held today, which political party would you most likely vote for?</h2>
									<html:radio property="choice" value="DMK"/><h3>D.M.K<br>
									<html:radio property="choice" value="ADMK"/><h3>A.D.M.K<br>
									<html:radio property="choice" value="Congress"/><h3>Congress<br>
									<html:radio property="choice" value="BJP"/><h3>B.J.P<br>
									
					<h2>4.How confident are you that the upcoming election will be conducted fairly and without interference?</h2>
									<html:radio property="fairness" value="very confident" /><h3>Very Confident<br>
									<html:radio property="fairness" value="somewhat confident"/><h3>Somewhat Confident<br>
									<html:radio property="fairness" value="not confident"/><h3>Not Confident<br>
									
					<h2>5.On a scale of 1 to 5, how would you rate your knowledge about the political landscape in India?</h2>
									<html:radio property="ratings" value="1"/><h3>1(Poor)
									<html:radio property="ratings" value="2"/><h3>2(Satisfactory)
									<html:radio property="ratings" value="3"/><h3>3(Good)
									<html:radio property="ratings" value="4"/><h3>4(Very Good)
									<html:radio property="ratings" value="5"/><h3>5(Excellent)<br>
		
					<html:submit  styleClass="button" style="margin-top:50px" value="Next"></html:submit>
			
			</html:form>
		
		</aside>
	
	</body>
</html>

