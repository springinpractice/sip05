<%@ include file="/WEB-INF/jsp/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html
  xmlns:c="http://java.sun.com/jsp/jstl/core"
  xmlns:jsp="http://java.sun.com/JSP/Page"
  xmlns:spring="http://www.springframework.org/tags"
  xmlns:form="http://www.springframework.org/tags/form">

  <head><title>Inheritance Demo</title></head>

  <body>
    <h2>Inheritance Demo</h2>

    <p>
      Pick an option below:
    </p>

    <a href="${flowExecutionUrl}&_eventId=inheritedViewDemo">
      Transition to a view that is an inherited view.</a><br/>
    <br/>    
    <a href="${flowExecutionUrl}&_eventId=childOfInheritedViewDemo">
      Transition to a view that is a child of an inherited view.</a><br/>
    <br/>        
    <a href="${flowExecutionUrl}&_eventId=throwError">
      Throw Error</a>
    <br/>
          
  </body>
</html>
