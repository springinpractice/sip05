<%@ include file="/WEB-INF/jsp/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html 
	xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:spring="http://www.springframework.org/tags"
	xmlns:form="http://www.springframework.org/tags/form">

	<head><title>Find Existing Player(s)</title></head>
	
	<body>
		
		<h2>New Account Creation</h2>	
		
		<p>
		  Please complete the following form to create your new account.
		</p>
    <%@ include file="/WEB-INF/jsp/errors.jspf" %>
		
		<form:form commandName="accountForm" action="${flowExecutionUrl}">	
			<fieldset>
			 <legend>Primary Guardian</legend>
			
				 <label for="guardian.firstName">
				   Guardian First Name</label>
	       <form:input path="guardian.firstName" />
	       <form:errors path="guardian.firstName" 
	         cssClass="error-message"/> 
	       <br/>
	       
	       <label for="guardian.lastName">
	         Guardian Last Name</label>
         <form:input path="guardian.lastName" />
         <form:errors path="guardian.lastName" 
           cssClass="error-message"/>
         <br/>
         
         <label for="guardian.address1">Address 1</label>
         <form:input path="guardian.address1" />
         <form:errors path="guardian.address1" 
           cssClass="error-message"/>
         <br/>
         
         <label for="guardian.address2">Address 2</label>
         <form:input path="guardian.address2" />
         <form:errors path="guardian.address2" 
           cssClass="error-message"/>
         <br/>
         
         <label for="guardian.city">City</label>
         <form:input path="guardian.city" />
         <form:errors path="guardian.city" 
           cssClass="error-message"/>
         <br/>
         
         <label for="guardian.state">State</label>
         <form:input path="guardian.state" />
         <form:errors path="guardian.state" 
           cssClass="error-message"/>
         <br/>
         
         <label for="guardian.zip">Zip Code</label>
         <form:input path="guardian.zip" />
         <form:errors path="guardian.zip" 
           cssClass="error-message"/>
         <br/>
         
         <label for="guardian.homePhone">
           Home Phone</label>
         <form:input path="guardian.homePhone" />
         <form:errors path="guardian.homePhone" 
           cssClass="error-message"/>
         <br/>
         
         <fieldset>
            <legend>Account Access</legend>
          
            <label for="guardian.email">
              E-mail</label>
            <form:input path="guardian.email" />
            <form:errors path="guardian.email" 
              cssClass="error-message"/>
            <br/>
         
            <label for="confirmEmail">
              Confirm E-mail</label>
            <form:input path="confirmEmail" />
            <form:errors path="confirmEmail" 
              cssClass="error-message"/>
            <br/>
         
            <label for="guardian.password">
              Password</label>
            <form:input path="guardian.password" 
              type="password"/>
            <form:errors path="guardian.password" 
              cssClass="error-message"/>
            <br/>
         
            <label for="confirmPassword">
              Confirm Password</label>
            <form:input path="confirmPassword" 
              type="password"/>              
            <form:errors path="confirmPassword" 
              cssClass="error-message"/>
            <br/>
         </fieldset>
			</fieldset>
			
			<br/>
			
			<fieldset>
			 <legend>Child</legend>
			 
				 <label for="child.firstName">
				   Child First Name</label>
	       <form:input path="child.firstName" />
         <form:errors path="child.firstName" 
           cssClass="error-message"/>
         <br/>
	       
	       
	       <label for="child.lastName">
	         Child Last Name</label>
	       <form:input path="child.lastName" />
         <form:errors path="child.lastName" 
           cssClass="error-message"/>
         <br/>
	       
	       <label for="child.birthDate">Birthday</label>
	       <form:input path="child.birthDate" />
			   <form:errors path="child.birthDate" 
			     cssClass="error-message"/>
			</fieldset>

      
      <input type="submit" name="_eventId_next"
        value="Next"/>
		</form:form>
			
  </body>
</html>
