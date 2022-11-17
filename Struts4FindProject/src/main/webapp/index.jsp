<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h1>Select any one button to view the List</h1>
<form action="myspace/findrestaurants">
<label for="name">List of Restaurants</label><br>

<input type="submit" value="restaurants">
</form>
<br>
<br>
<form action="myspace/findhospitals">
<label for="name">List of Hospitals</label><br>

<input type="submit" value="hospitals">
</form>
<br>
<br>
<form action="myspace/findmovietheaters">
<label for="name">List of Movie Theaters</label><br>

<input type="submit" value="movietheaters">
</form>

</body>
</html>