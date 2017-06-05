<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
    <spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title> Products</title>
<script>
	window.menu = '${title}';
</script>
<script src="${js}/jquery.js"></script>
<script src="${js}/bootstrap.min.js"></script>
<script src="${js}/jquery.dataTables.js"></script>
<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap darkly theme -->
<link href="${css}/bootstrap-darkly-theme.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">
<link rel="stylesheet" href="${css}/dataTables.bootstrap.css" />
<link rel="stylesheet" href="${css}/jquery.dataTables.min.css" />
</head>
<body>
<div class="wrapper">
	

 	<!--<a href="${flowExecutionUrl}&_eventId_home">Home</a> -->
 	<a href="/Eshopping">Home</a><br /><br />
 	
 	
 	<div class="form-container">
 	
 	<h1>Billing Address</h1>
 	
	<form:form method="POST" modelAttribute="address" class="form-horizontal">

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="addressLine1">Address Line1</label>
				<div class="col-md-7">
					<form:input type="text" path="addressLine1" id="addressLine1" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="addressLine1" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="addressLine2">Address Line2</label>
				<div class="col-md-7">
					<form:input type="text" path="addressLine2" id="addressLine2" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="addressLine2" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="City">City</label>
				<div class="col-md-7">
					<form:input type="text" path="city" id="city" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="city" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="state">State</label>
				<div class="col-md-7">
					<form:input type="text" path="state" id="state" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="state" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="country">Country</label>
				<div class="col-md-7">
					<form:input type="text" path="country" id="country" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="country" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-actions floatRight">
				<input name="_eventId_submit" type="submit" value="Submit" class="btn btn-primary btn-sm">
				<input name="_eventId_edit" type="submit" value="Edit" class="btn btn-primary btn-sm">
				</div>
		</div>
	</form:form>
	</div>
