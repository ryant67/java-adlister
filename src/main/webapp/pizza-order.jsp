
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

<form method="POST" action="/pizza-order.jsp">

  <div id="deliveryAddress">
    <label for="street">Street: </label>
    <input type="text" name="street" id="street" placeholder="Street">
    <label for="city">City: </label>
    <input type="text" name="city" id="city" placeholder="City">
    <label for="state">State: </label>
    <input type="text" name="state" id="state" placeholder="State">
    <label for="zip">Zip Code: </label>
    <input type="text" name="zip" id="zip" placeholder="Zip Code">
  </div>

  <div id="pizzaSize">
    <label for="size">Size: </label>
    <select name="size" id="size">
      <option value="small">Small</option>
      <option value="medium">Medium</option>
      <option value="large">Large</option>
      <option value="x-large">X-Large</option>
    </select>
  </div>

  <div id="pizzaCrust">
    <label for="crust">Crust: </label>
    <select name="crust" id="crust">
      <option value="thin">Thin</option>
      <option value="stuffed">Stuffed</option>
      <option value="regular">Regular</option>
    </select>
  </div>

  <div id="pizzaSauce">
    <label for="sauce">Sauce: </label>
    <select name="sauce" id="sauce">
      <option value="light">Light</option>
      <option value="regular">Regular</option>
      <option value="extra">Extra</option>
    </select>
  </div>
  
  <div id="pizzaToppings">
    <label for="pepperoni">Pepperoni: </label>
    <input type="checkbox" name="pepperoni" id="pepperoni" value="pepperoni">
    <label for="bacon">Bacon: </label>
    <input type="checkbox" name="bacon" id="bacon" value="bacon">
    <label for="tomatoes">Tomatoes: </label>
    <input type="checkbox" name="tomatoes" id="tomatoes" value="tomatoes">
    <label for="onion">Onion: </label>
    <input type="checkbox" name="onion" id="onion" value="onion">
  </div>

</form>



</body>
</html>
