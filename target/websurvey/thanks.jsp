<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./styles.css" type="text/css"/>
<title>Thanks For Submitting</title>
</head>
<body>
	<h1>Thanks for joining our users list</h1>

    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Date Of Birth:</label>
    <span>${user.dateBirth}</span><br>
	<label>How did you hear about us?:</label>
	<span>${user.hearAboutUs}</span><br>
	<label>Subscription preference:</label>
	<span>${user.subscription}</span><br>
	<label>Contact method:</label>
	<span>${user.contactMethod}</span><br>

    <p>To enter another user info, click on the Back 
	    button in your browser or the Return button shown 
	    below.</p>
	
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>