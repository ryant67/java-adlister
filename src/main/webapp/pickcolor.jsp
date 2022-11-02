<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Pick your Favorite Color!</h1>
<form method="POST" action="/pickcolor">
  <label for="color">Favorite Color: </label>
  <input type="text" name="color" id="color">
  <button type="submit">Submit</button>
</form>
</body>
</html>
