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
		
			<html:form action="goToPage3">
				
					<h2>6.Which of the following issues is most important to you in this election?</h2>
								<html:checkbox property="issue" value="economy"/><h3>Economy<br>
								<html:checkbox property="issue" value="healthcare"/><h3>Healthcare<br>
								<html:checkbox property="issue" value="education"/><h3>Education<br>
								<html:checkbox property="issue" value="corruption"/><h3>Corruption<br>
										
					<h2>7.How satisfied are you with the government's performance in addressing the key issues?</h2>
								<html:radio property="govtPerformance" value="very confident" /><h3>Very Confident<br>
								<html:radio property="govtPerformance" value="somewhat confident"/><h3>Somewhat Confident<br>
								<html:radio property="govtPerformance" value="not confident"/><h3>Not Confident<br>
										
					<h2>8.Do you believe that the opposition parties offer viable alternatives to the current government?</h2>
								<html:radio property="opinionAboutOppParty" value="yes"/><h3>YES<br>
								<html:radio property="opinionAboutOppParty" value="no"/><h3>NO<br>
										
					<h2>9.Have you attended any political rallies or events related to the upcoming election?</h2>
								<html:radio property="eventsAttended" value="yes"/><h3>YES<br>
								<html:radio property="eventsAttended" value="no"/><h3>NO<br>
										
					<h2>10.Are you aware of the measures taken by the Election Commission to ensure free and fair elections?</h2>
								<html:radio property="measures" value="yes"/><h3>YES<br>
								<html:radio property="measures" value="no"/><h3>NO<br>
						
						
					<html:submit styleClass="button" style="margin-top:20px" value="Next"></html:submit>
				
			</html:form>
		
		</aside>
	
	</body>

</html>