<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


 	<a href="${flowExecutionUrl}&_eventId_home">Home</a>
 	<div class="form-container">
 	
 	<h1>Registration Form</h1>
 	
	<form:form method="POST" modelAttribute="user" class="form-horizontal">

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="userName">User Name</label>
				<div class="col-md-7">
					<form:input type="text" path="username" id="username" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="username" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="password">Password</label>
				<div class="col-md-7">
					<form:input type="password" path="password" id="password" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="password" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="Name">Name</label>
				<div class="col-md-7">
					<form:input type="text" path="name" id="name" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="name" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="email">Email</label>
				<div class="col-md-7">
					<form:input type="text" path="email" id="email" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="email" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="phone">Phone</label>
				<div class="col-md-7">
					<form:input type="text" path="phone" id="phone" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="phone" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="role">role</label>
				<div class="col-md-7">
				    <form:radiobutton path="role" id="role" value="customer" class="form-control input-sm"/> Customer
				    <form:radiobutton path="role" id="role" value="supplier" class="form-control input-sm"/> Supplier
					
					<div class="has-error">
						<form:errors path="role" class="help-inline"/>
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
