<%-- Source project: sip05, branch: 03 (Maven Project) --%>
<%@ include file="/WEB-INF/jsp/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html
  xmlns:c="http://java.sun.com/jsp/jstl/core"
  xmlns:jsp="http://java.sun.com/JSP/Page"
  xmlns:spring="http://www.springframework.org/tags"
  xmlns:form="http://www.springframework.org/tags/form">
  
  <c:set var="foundPlayer" 
    scope="request" value="${!empty player}"/>
  
  <head><title>Search Results</title></head>

  <body>
    <h2>Search Results</h2>
    
    <c:choose>
      <c:when test="${foundPlayer}">
	      <table border="1">
	        <tr>
	          <th>Player</th>
	          <th>Location</th>
	          <th>Phone</th>
	          <th>Notes</th>
	          <th>Click Link To Continue</th>
	        </tr>
	        <tr>
	          <td>${player.firstName}&nbsp;${player.lastName}</td>
	          <td>${player.guardian.address1}</td>
	          <td>${player.guardian.homePhone}</td>
	          <td>
	            Login Already Exists<br/>
	            Username=${player.guardian.username}
	          </td>
	          <td>
	            <a href="${flowExecutionUrl}&_eventId=existingAccountFound">
	              Login With This Account</a>
	          </td>
	        </tr>
	      </table>
      </c:when>
      <c:otherwise>
        No Player Found<br/>
      </c:otherwise>
    </c:choose>

    </br>
    <a href="${flowExecutionUrl}&_eventId=back">Back</a>
      &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${flowExecutionUrl}&_eventId=newSearch">New Search</a>
      &nbsp;&nbsp;&nbsp;&nbsp;
            
    <a href="${flowExecutionUrl}&_eventId=noneMatch">
    <c:choose>
      <c:when test="${foundPlayer}">
    	  None of these Apply - Continue Creating New Account
    	</c:when>
      <c:otherwise>
        Skip - Continue Creating New Account
      </c:otherwise>
    </c:choose>
    </a>
  </body>
</html>
