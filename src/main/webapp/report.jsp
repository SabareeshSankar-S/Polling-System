<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>

<html>
	<head>
		<title>Login Form</title>
	    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/style.css">
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
	    <style type="text/css">
	    
		    body{
		    margin: 0; 
		    padding: 0; 
		      width:100%;
		    height: 1580px;
		    background-size:cover; 
		    background-repeat: repeat;
		     background-image: url('<%= request.getContextPath() %>/images/istockphoto-blur.jpg');
		    }
		    
		    .reportform .percentage-bar {
		    width: 95%;
		    height: 20px; 
		    background-color: lightgray; 
		    position: relative;
		}
		
			.reportform .percentage-bar::after {
		    content: "";
		    position: absolute;
		    top: 0;
		    left: 0;
		    height: 100%;
		    width: var(--percentage); 
		    background-color: var(--color); 
		}
	    
	    </style>
	    
	</head>
	
	<body>
	
		<h2 style="margin-top:0px;padding: 20px 0px 20px 575px;background-color: black;color:white;font-weight: bold;">Make your yoice heard, Take the Election Survey!!</h2>
		
		<aside class="reportform">
		
			<html:form>
		
				<h1 style="color:black;">Report :</h1>
				
				<h5 style="color: black;padding-top: 10px">Gender analysis:</h5>
				<%Map<String,Double> genderPercentageMap=(Map<String,Double>)request.getAttribute("genderPercentageMap");%>
						<%for (Map.Entry<String, Double> entry : genderPercentageMap.entrySet()) {%>
				   			<h6> <%= entry.getKey() %>: <%= entry.getValue() %> %
				   			<br> <%String color = "";
				   			if (entry.getValue() < 25) {
				   			    color = "red";
				   			} else if (entry.getValue() >= 25 && entry.getValue() <= 70) {
				   			    color = "orange";
				   			} else{
				   			    color = "green";}%>
				   	<div class="percentage-bar" style="--percentage: <%= entry.getValue() %>%;--color: <%=color%>"></div>	 
				<% }%><br><br>
				
				
				<%double registeredVotersPercentage =(double)request.getAttribute("registeredVotersPercentage"); 
				String color1 = "";
				if (registeredVotersPercentage < 25) {
				    color1 = "red";
				} else if (registeredVotersPercentage >= 25 && registeredVotersPercentage <= 70) {
				    color1 = "orange";
				} else {
				    color1 = "green";
				}%>
				<h5 style="color: black;">Registered voters percentage:</h5><h6><%= registeredVotersPercentage %> %
					<div class="percentage-bar" style="--percentage: <%= registeredVotersPercentage %>%;--color: <%=color1%>"></div><br><br>
				
			
				<%double voterInterestPercentage =(double)request.getAttribute("voterInterestPercentage");
				String color2 = "";
				if (voterInterestPercentage < 25) {
				    color2 = "red";
				} else if (voterInterestPercentage >= 25 && voterInterestPercentage <= 70) {
				    color2 = "orange";
				} else {
				    color2 = "green";
				}
				%>
				<h5 style="color: black;">People's interest towards voting:</h5><h6> <%= voterInterestPercentage %> %
					<div class="percentage-bar" style="--percentage: <%= voterInterestPercentage %>%;--color: <%=color2%>"></div><br><br>
					
					
				<h5 style="color: black;">People's choice:</h5>
				<%Map<String,Double> choicePercentageMap=(Map<String,Double>)request.getAttribute("choicePercentageMap"); %>
						<%for (Map.Entry<String, Double> entry : choicePercentageMap.entrySet()) {%>
				   			<h6> <%= entry.getKey() %>: <%= entry.getValue() %> %
				   			 <br> <%String color5 = "";
				   			if (entry.getValue() < 25) {
				   			    color5 = "red";
				   			} else if (entry.getValue() >= 25 && entry.getValue() <= 70) {
				   			    color5 = "orange";
				   			} else{
				   			    color5 = "green";}%>
				   	<div class="percentage-bar" style="--percentage: <%= entry.getValue() %>%;--color: <%=color5%>"></div>
				<% }%><br><br>
						
						
				<h5 style="color: black;">People's trust in the election process:</h5>			
				<%Map<String,Double> trustPercentageMap=(Map<String,Double>)request.getAttribute("trustPercentageMap"); %>
						<%for (Map.Entry<String, Double> entry : trustPercentageMap.entrySet()) {%>
				   			<h6> <%= entry.getKey() %>: <%= entry.getValue() %> %
				   			 <br> <%String color = "";
				   			if (entry.getValue() < 25) {
				   			    color = "red";
				   			} else if (entry.getValue() >= 25 && entry.getValue() <= 70) {
				   			    color = "orange";
				   			} else{
				   			    color = "green";}%>
				   	<div class="percentage-bar" style="--percentage: <%= entry.getValue() %>%;--color: <%=color%>"></div>
				<% }%><br> <br>
				
				
				<%double awarenessPercentage =(double)request.getAttribute("awarenessPercentage"); 
				String color3 = "";
				if (awarenessPercentage < 25) {
				    color3 = "red";
				} else if (awarenessPercentage >= 25 && awarenessPercentage <= 70) {
				    color3 = "orange";
				} else {
				    color3 = "green";
				}%>
				<h5 style="color: black;">People's awareness percentage:</h5><h6> <%= awarenessPercentage %> %
					<div class="percentage-bar" style="--percentage: <%= awarenessPercentage %>%;--color: <%=color3%>"></div><br><br>
				
				
				<h5 style="color: black;">People's source of information about election:</h5>
				<%Map<String,Double> sourcePercentageMap=(Map<String,Double>)request.getAttribute("sourcePercentageMap"); %>
						<%for (Map.Entry<String, Double> entry : sourcePercentageMap.entrySet()) {%>
				   			<h6> <%= entry.getKey() %>: <%= entry.getValue() %> %
				 <br> <%String color5 = "";
				   			if (entry.getValue() < 25) {
				   			    color5 = "red";
				   			} else if (entry.getValue() >= 25 && entry.getValue() <= 70) {
				   			    color5 = "orange";
				   			} else{
				   			    color5 = "green";}%>
				   	<div class="percentage-bar" style="--percentage: <%= entry.getValue() %>%;--color: <%=color5%>"></div>	 
				<% }%><br><br>
				
				
				<html:link style="text-decoration:none;" styleClass="button" href="welcomepage.jsp">FINISH</html:link>
		
		</html:form>
		
		</aside>
	
	</body>
</html>