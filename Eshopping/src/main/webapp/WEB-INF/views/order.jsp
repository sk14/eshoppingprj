<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${action}" method="post">
		<div class="container">
			<div class="jumbotron">
				<br>
				<br>
				<div class="col-lg-8"></div>

				<form role="form">
					<div class="container">
						<div class="col-lg-6">

							<div class="form-group">
								<label for="name">Username</label><br> <input type="text"
									class="form-control" id="name" name="username"
									placeholder="Enter username" required="true">
							</div>
							<br>


							<div class="form-group">
								<label for="billingAddress">Billing Address</label><br> <input
									type="text" class="form-control" id="billingAddress"
									name="billingAddress" placeholder="Enter billing address"
									required="true">
							</div>
							<br>

							<div class="form-group">
								<label for="shippingAddress">Shipping Address</label><br> <input
									type="text" class="form-control" id="shippingAddress"
									name="shippingAddress" placeholder="Enter shipping address"
									required="true">
							</div>
							<br>

							<div class="form-group">
								<label for=" pay_type">Payment Type</label><br> <input
									type="text" class="form-control" id="pay_type" name="pay_type"
									placeholder="Enter payment type" required="true">
							</div>
							<br>




							<button type="submit" class="btn btn-primary btn-block">Place
								Order</button>
							<br>
							<br>

						</div>
					</div>
				</form>
			</div>
		</div>
	</form:form>



	<br>
	<br>


</body>
</html>