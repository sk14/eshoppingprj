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
		<!--  <div class="row">
			<div class="form-group col-md-12">
					<div class="col-md-7">
					<form:checkbox path="billing" value="Shipping address same as Billing"/>Shipping address same as Billing
					<div class="has-error">
						<form:errors path="billing" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>-->
		<div class="row">
			<div class="form-actions floatRight">
				<input name="_eventId_submit" type="submit" value="Submit" class="btn btn-primary btn-sm">
				</div>
			<div class="form-actions floatRight">
				<input name="_eventId_edit" type="submit" value="Edit" class="btn btn-primary btn-sm">
				</div>
		</div>
	</form:form>
	</div>
