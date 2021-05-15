<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/add" method="post">
   <table style="with: 80%">
    <tr>
     <td>Number 1</td>
     <td><input type="text" name="num1" /></td>
    </tr>
    <tr>
     <td>Number 2</td>
     <td><input type="text" name="num2" /></td>
    </tr>
     </table>
   <input type="submit" value="Add"/>
  </form>
  <br/>
</body>
</html>