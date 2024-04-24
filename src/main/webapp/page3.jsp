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
		
			<html:form action="displayThankyou">
				<h2>11.How much influence do social media platforms have on your political views and decisions?</h2>
							<html:radio property="socialMediaInfluence" value="significantInfluence"/><h3>Significant Influence<br>
							<html:radio property="socialMediaInfluence" value="minimalInfluence"/><h3>Minimal Influence<br>
							<html:radio property="socialMediaInfluence" value="noInfluence"/><h3>No Influence<br>
									
				<h2>12.Which sources of information do you trust the most when forming opinions about political parties and candidates?</h2>
							<html:checkbox property="source" value="news Channels"/><h3>News Channels<br>
							<html:checkbox property="source" value="social Media"/><h3>Social media<br>
							<html:checkbox property="source" value="friends And Family"/><h3>Friends and Family<br>
							<html:checkbox property="source" value="political Rallies/Events"/><h3>Political Rallies/Events<br>
						
				<h2>13.Have you encountered any misinformation or fake news related to the upcoming election?</h2>
							<html:radio property="fakeNews" value="yes"/><h3>YES<br>
							<html:radio property="fakeNews" value="no"/><h3>NO<br>
								
				<h2>14.Is there anything else you would like to share about your views on the upcoming election?</h2>
							<h3>Kindly share your views:  <html:text property="yourViews"/><br>
							
							
				<h2>15.Would you be interested in participating in future surveys related to politics and governance in India?</h2>
							<html:radio property="futureSurvey" value="yes"/><h3>YES<br>
							<html:radio property="futureSurvey" value="no"/><h3>NO<br>
						
				<html:submit styleClass="button" style="margin-top:20px" value="Submit"></html:submit>
				
			</html:form>
		
		</aside>
	
	</body>

</html>
