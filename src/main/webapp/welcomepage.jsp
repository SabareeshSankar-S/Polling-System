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
	
	<aside class="form_content">
	
		<h1 class="register"><bean:message key="title"/> </h1>
	
		<html:form action="login" >
		
			<h2> <bean:message key="name"/>           <html:text  property="name"></html:text><html:errors property="nameError"/><br>
			<h2> <bean:message key="email"/>          <html:text  property="email"></html:text><html:errors property="emailError"/><br>
			<h2> <bean:message key="age"/>            <html:text  property="age" value=""></html:text><html:errors property="ageError"/><br>
			<h2> <bean:message key="gender"/>         <html:text  property="gender"></html:text><html:errors property="genderError"/><br>
			<h2> <bean:message key="qualification"/>  <html:text  property="qualification"></html:text><html:errors property="qualificationError"/><br>
			<h2> <bean:message key="occupation"/>     <html:text  property="occupation"></html:text><html:errors property="occupationError"/><br>
			<h2> <bean:message key="state"/>          <html:text  property="state"></html:text><html:errors property="stateError"/></h2><br>
			
			<html:submit styleClass="button" ><bean:message key="submit"/></html:submit>
		
		</html:form>
	
	</aside>

</body>

</html>