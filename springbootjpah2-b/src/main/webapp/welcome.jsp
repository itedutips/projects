<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome.. Enter id , name and hobby GET request sample! <br/>
${messageget}
<form action=addGet method=GET>
    <input type="text" name="id"/><br>
	<input type="text" name="name"/><br>
	<input type="text" name="hobby"/><br>
	<input type="submit"/>
</form>
<br/>
Welcome.. Enter  id , name and hobby POST request sample! <br/>
${messagepost}
<form action=addPost method=POST>
    <input type="text" name="id"/><br>
	<input type="text" name="name"/><br>
	<input type="text" name="hobby"/><br>
	<input name="form" type="submit" value="AddUsingPost"/>
</form>
<br/>
<form action=delete method=GET>
    <input type="text" name="id"/><br>
	<input name="form" type="submit" value="Delete"/>
</form>
<br/>
${messagedelete}
<br/>
<form action=getrow method=GET>
    <input type="text" name="id"/><br>
	<input name="form" type="submit" value="GetRow"/>
</form>
<br/>
${messagegetrow}
</form>
<br/>
 Enter details to update!
<form action=update method=POST>
    <input type="text" name="id"/><br>
	<input type="text" name="name"/><br>
	<input type="text" name="hobby"/><br>
	<input name="form" type="submit" value="Update"/>
</form>
<br/>
${messageupdate}
</body>
</html>