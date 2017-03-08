 	<div class="form-container">
 	
 	<h1>Enrollment Form</h1>
 	
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
					<form:input type="text" path="password" id="password" class="form-control input-sm"/>
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
				<label class="col-md-3 control-lable" for="country">Country</label>
				<div class="col-md-7">
					<form:select path="country" id="country" class="form-control input-sm">
				        <form:option value="">Select Country</form:option>
			    	    <form:options items="${countries}" />
				    </form:select>
					<div class="has-error">
						<form:errors path="country" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="Register" class="btn btn-primary btn-sm">
				</div>
		</div>
	</form:form>
	</div>
