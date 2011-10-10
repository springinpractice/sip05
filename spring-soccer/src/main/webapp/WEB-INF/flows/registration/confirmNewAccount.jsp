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
      Please verify the following data is correct.  Press
      the "Back" button to make any necessary changes.
    </p>


    <table cellspacing="5">
      <tr>
        <td colspan="2"><h3>Guardian</h3></td>
      </tr>
      <tr>
        <td class="label">Username</td>
        <td class="value">${accountForm.guardian.username}</td>
      </tr>
      <tr>
        <td class="label">Name</td>
        <td class="value">
          ${accountForm.guardian.firstName}&nbsp;
          ${accountForm.guardian.lastName}
        </td>
      </tr>
      <tr>
        <td class="label">Address 1</td>
        <td class="value">${accountForm.guardian.address1}</td>
      </tr>
      <tr>
        <td class="label">Address 2</td>
        <td class="value">${accountForm.guardian.address2}</td>
      </tr>
      <tr>
        <td class="label">City</td>
        <td class="value">${accountForm.guardian.city}</td>
      </tr>
      <tr>
        <td class="label">State</td>
        <td class="value">${accountForm.guardian.state}</td>
      </tr>
      <tr>
        <td class="label">Zip Code</td>
        <td class="value">${accountForm.guardian.zip}</td>
      </tr>
      <tr>
        <td class="label">Home Phone</td>
        <td class="value">${accountForm.guardian.homePhone}</td>
      </tr>
      <tr>
        <td colspan="2"><br/><br/><h3>Child</h3></td>
      </tr>
      <tr>
        <td class="label">Name</td>
        <td class="value">
          ${accountForm.child.firstName}&nbsp;
          ${accountForm.child.lastName}
        </td>
      </tr>
      <tr>
        <td class="label">Birthdate</td>
        <td class="value">${accountForm.child.birthDate}</td>
      </tr>
    </table>

    <form>
      <input type="button" value="Back" 
        onClick="window.location.href='${flowExecutionUrl}&_eventId=back';"/>
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Next" 
        onClick="window.location.href='${flowExecutionUrl}&_eventId=next';"/>
    </form>

  </body>
</html>
