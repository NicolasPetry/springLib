<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>Spring Framework Lib</title>
	    
	    <!-- Bootstrap -->
	   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	    
<%-- 	    <link type="text/css" href="<c:url value="/css/style.css"/>" rel="stylesheet"> --%>
	    
	</head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Greetings</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/">SpringLib <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/signup">Sign Up</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/login">Log In</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/speciality" tabindex="-1">Speciality</a>
      </li>
      <form:form id="logoutForm" action="/logout" class="form-inline">
      <button class="btn btn-outline-success my-2 my-sm-0" type="button" onclick="document.getElementById('logoutForm').submit()">Log out</button>
      </form:form>
    </ul>
  </div>
</nav>

<c:if test="${not empty flashMessage }">
	<div class="alert alert-${flashKind }" role="alert">
	${flashMessage }
	<button type="button" class="close" data-dismiss="alert" aria-tabel="Close">
	<span aria-hidden="ture">&times;</span>
	</button>
	</div>
</c:if>