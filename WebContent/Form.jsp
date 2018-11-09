<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GPA Calculator</title>
</head>
<body>
	<form action="Calculator">
		Subject Name: <input type="text" name="subName"> <br>


		<table>
		<%
		for(int i = 0; i < 10 ; i++)
		{%>
			<tr>
				<th>Test Name:</th>
				<td><input type="text" name="TestName<%=i%>">
				<td>
				<th>Marks Out Of:</th>
				<td><input type="number" name="MarksOutOf<%=i%>"></td>
				<th>Marks Obtained:</th>
				<td><input type="number" name="MarksObtained<%=i%>"></td>
				<th>Total Percentage:</th>
				<td><input type="number" name="totalPercentage<%=i%>"></td>
			</tr>
		<%}
		
		%>
			
		</table>
		<input type="submit">
	</form>
</body>
</html>

