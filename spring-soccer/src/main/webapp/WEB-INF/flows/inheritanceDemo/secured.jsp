<%@ include file="/WEB-INF/jsp/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html
  xmlns:c="http://java.sun.com/jsp/jstl/core"
  xmlns:jsp="http://java.sun.com/JSP/Page"
  xmlns:spring="http://www.springframework.org/tags"
  xmlns:form="http://www.springframework.org/tags/form">

  <head><title>Secured Page</title></head>

  <body>
    <h2>Secured</h2>

    <p>
      This page is Secured.  Please click the button below 
      to end the flow.
    </p>


      <input type="button" value="End" 
        onClick="window.location.href='${flowExecutionUrl}&_eventId=next';"/>
  </body>
</html>
