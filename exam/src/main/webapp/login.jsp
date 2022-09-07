<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="base.jsp" %>
<meta charset="UTF-8">
<title>Login/Register</title>
<%@include file="base.jsp" %>
</head>
<body>
<br><br><br><br>
<div class="row justify-content-center">

<div class="col-md-4">
<div class="card">
  
  <div class="card-body">
    <h5 class="card-title text-center">Login</h5>
    <p class="card-text">
    <form action="LoginServlet" method="post">
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" class="form-control" id="email"  name="email">
    
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    
    
    </p>
    
  </div>
</div>

</div>

<div class="col-md-4">
<div class="card">
  
  <div class="card-body">
    <h5 class="card-title text-center">Signup</h5>
    <p class="card-text">
    <form action="RegisterServlet" method="post">
    <div class="form-group">
    <label for="name">Name</label>
    <input type="text" class="form-control" id="txtname"  name="txtname">
    
  </div>
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" class="form-control" id="txtemail"  name="txtemail">
    
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="txtpassword" name="txtpassword">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    
    
    </p>
    
  </div>
</div>

</div>
</div>
</body>
</html>