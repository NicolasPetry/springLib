<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="panel panel-primary">
  <div class="panel-heading">
    <h3 class="panel-title">Create Speciality</h3>
  </div>
  <div class="panel-body">
  	<form:form modelAttribute="spec"> 
  	
  	<form:errors cssClass="error"/>
  	<div class="form-group">
  		<form:label path="name">speciality</form:label>
  		<form:input path="name" type="text" class="form-control" placeholder="speciality"></form:input>
  		<form:errors path="name" cssClass="error"/>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
  	</form:form>
 	</div>
 	</div>

<%@include file="includes/footer.jsp"%>    