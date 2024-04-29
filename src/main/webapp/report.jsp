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
		    height: 1400px;
		    background-size:cover; 
		    background-repeat: no-repeat;
		     background-image: url('<%= request.getContextPath() %>/images/istockphoto-blur.jpg');
		    }
		    
		    .reportform .percentage-bar {
		    width: 35%;
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
		
				<h1 style="color:black;position: relative;display: inline">Welcome to the Dashboard!</h1>
				
				<span class="count">
				<%List<String> countList=(List<String>)request.getAttribute("countList");%>
						<h5>No. of people taken the survey: <%= countList.size() %></h5>
				
				
				</span>
				
				<span class="gender">
				
							<h5 class="heading">Gender analysis:</h5><br>

							<%Map<String,Double> genderPercentageMap=(Map<String,Double>)request.getAttribute("genderPercentageMap");%>
									<%for (Map.Entry<String, Double> entry : genderPercentageMap.entrySet()) {%>
							   			<br> <%String color = "";
							   			if (entry.getValue() < 25) {
							   			    color = "red";
							   			} else if (entry.getValue() >= 25 && entry.getValue() <= 70) {
							   			    color = "orange";
							   			} else{
							   			    color = "green";}%>
							   	<div class="percentage-bar" style="--percentage: <%= entry.getValue() %>%;--color: <%=color%>"></div>	 
							<% }%><br><br>
				
				</span>
				
				<span class="regVoters">
				
							<%double registeredVotersPercentage =(double)request.getAttribute("registeredVotersPercentage"); 
							String color1 = "";
							if (registeredVotersPercentage < 25) {
							    color1 = "red";
							} else if (registeredVotersPercentage >= 25 && registeredVotersPercentage <= 70) {
							    color1 = "orange";
							} else {
							    color1 = "green";
							}%>
							<h5 class="heading">Registered voters percentage:</h5><br><h6><%= registeredVotersPercentage %> % of <%= countList.size() %> people
								<div class="percentage-bar" style="--percentage: <%= registeredVotersPercentage %>%;--color: <%=color1%>"></div><br><br>
							
				</span>
			
			<span class="interest">
			
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
								<h5 class="heading">People's interest towards voting:</h5><br><h6> <%= voterInterestPercentage %> % of <%= countList.size() %> people
									<div class="percentage-bar" style="--percentage: <%= voterInterestPercentage %>%;--color: <%=color2%>"></div><br><br>
			</span>
					
					
				<span class="choice">
				
								<h5 class="heading"">People's choice:</h5><br>
									<% Map<String, Double> choicePercentageMap = (Map<String, Double>) request.getAttribute("choicePercentageMap"); %>
									<div class="bar-chart">
									  <% for (Map.Entry<String, Double> entry : choicePercentageMap.entrySet()) { %>
									    <div class="bar">
									      <div class="bar-label"><%= entry.getKey() %></div>
									      <div class="bar-inner" style="height: <%= entry.getValue() %>mm;">
									        <span class="percentage"><%= entry.getValue() %>%</span>
									      </div>
									    </div>
									  <% } %>
									</div>
									<br><br>
									
				</span>
					
				<span class="trust">
				
						<h5 class="heading">People's trust in the election process:</h5><br>
						<%Map<String,Double> trustPercentageMap=(Map<String,Double>)request.getAttribute("trustPercentageMap"); %>
							<div class="bar-chart">
								<%for (Map.Entry<String, Double> entry : trustPercentageMap.entrySet()) {%>
							    <div class="bar">
							    <% String originalKey = entry.getKey();
							    String[] parts = originalKey.split(" "); 
							    String rearrangedKey = parts[0] + "<br>" + parts[1];%>
							      <div class="bar-label"><%= rearrangedKey %></div>
							      <div class="bar-inner" style="height: <%= entry.getValue() %>mm;">
							        <span class="percentage"><%= entry.getValue() %>%</span>
							      </div>
							    </div>
							  <% } %>
							</div>
							<br><br>
					
					</span>	
				
				<span class="awareness">
				
						<%double awarenessPercentage =(double)request.getAttribute("awarenessPercentage"); 
						String color3 = "";
						if (awarenessPercentage < 25) {
						    color3 = "red";
						} else if (awarenessPercentage >= 25 && awarenessPercentage <= 70) {
						    color3 = "orange";
						} else {
						    color3 = "green";
						}%>
						<h5 class="heading">People's awareness percentage:</h5><br><h6> <%= awarenessPercentage %> % of <%= countList.size() %> people
							<div class="percentage-bar" style="--percentage: <%= awarenessPercentage %>%;--color: <%=color3%>"></div><br><br>
				
				</span>
				
				<span class="source">
				
							<h5 class="heading">People's source of information about election:</h5><br>
							<%Map<String,Double> sourcePercentageMap=(Map<String,Double>)request.getAttribute("sourcePercentageMap"); %>
								<div class="bar-chart">
									<%for (Map.Entry<String, Double> entry : sourcePercentageMap.entrySet()) {%>
								    <div class="bar">
								    <% String originalKey = entry.getKey();
								    String[] parts = originalKey.split(" "); 
								    String rearrangedKey;
								    if(parts.length <=2){
								     rearrangedKey = parts[0] + "<br>" + parts[1];}
								    else{
								     rearrangedKey = parts[0] + "<br>" + parts[1]+ "<br>" + parts[2];
								    }  %>
								      <div class="bar-label"><%= rearrangedKey %></div>
								      <div class="bar-inner" style="height: <%= entry.getValue() %>mm;">
								        <span class="percentage"><%= entry.getValue() %>%</span>
								      </div>
								    </div>
								  <% } %>
								</div>
								<br><br>
								
					</span>
				
				<html:link style="text-decoration:none;" styleClass="reportButton" href="welcomepage.jsp">RETAKE</html:link>
		
		</html:form>
		
		</aside>
	
	</body>
</html>