<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="panel panel-primary">
  <div class="panel-heading">
    <h3 class="panel-title">Please signup</h3>
  </div>
  <div class="panel-body">
	<form:form modelAttribute="user">
	
		<form:errors cssClass="error"/>
		<div class="form-group">
		  <form:label path="firstName">First Name</form:label>
		  <form:input path="firstName" type="text" class="form-control" id="exampleInputName1" placeholder="First Name"/>
		  <form:errors path="firstName" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="surname">Surname</form:label>
		  <form:input path="surname" type="text" class="form-control" id="exampleInputName1" placeholder="Surname"/>
		  <form:errors path="surname" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="address">Address</form:label>
		  <form:input path="address" type="text" class="form-control" id="exampleInputName1" placeholder="Address"/>
		  <form:errors path="address" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="zipCode">Zip Code</form:label>
		  <form:input path="zipCode" type="text" class="form-control" id="exampleInputName1" placeholder="Zip Code"/>
		  <form:errors path="zipCode" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="town">Town</form:label>
		  <form:input path="town" type="text" class="form-control" id="exampleInputName1" placeholder="Town"/>
		  <form:errors path="town" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="email">Email address</form:label>
		  <form:input path="email" type="email" class="form-control" id="exampleInputEmail1" placeholder="Email"/>
		  <form:errors path="email" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="password">Password</form:label>
		  <form:input path="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
		  <form:errors path="password" cssClass="error"/>
		</div>
		<div class="form-group">
		  <form:label path="password2">Confirm your Password</form:label>
		  <form:input path="password2" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
		  <form:errors path="password2" cssClass="error"/>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
  </div>
</div>

<%@include file="includes/footer.jsp"%>     
