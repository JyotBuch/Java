<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Student Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Roll No</td>
     <td><input type="text" name="rollno" /></td>
    </tr>
    <tr>
     <td>E-mail</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>Maths Marks</td>
     <td><input type="text" name="maths" /></td>
    </tr>
    <tr>
     <td>Physics Marks</td>
     <td><input type="text" name="physics" /></td>
    </tr>
    <tr>
     <td>Chemistry Marks</td>
     <td><input type="text" name="chemistry" /></td>
    </tr>
    <tr>
     <td>Biology Marks</td>
     <td><input type="text" name="biology" /></td>
    </tr>
    <tr>
     <td>Computers Marks</td>
     <td><input type="text" name="computers" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
  <form action="FetchData" method="post">
	<input type="submit" value="Show Records">
  </form>
 </div>
</body>
</html>