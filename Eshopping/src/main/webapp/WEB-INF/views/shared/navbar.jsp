
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${contextRoot}/home">E-Shopping</a>
		</div>
		
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li id="about"><a href="${contextRoot}/about">About</a></li>

				<li id="contact"><a href="${contextRoot}/contact">Contact</a></li>

				<li id="listProducts"><a
					href="${contextRoot}/show/all/products">View Products</a></li>
					
					
					
					
				<!-- <li id="adminProduct"><a href="${contextRoot}/admin">Admin</a></li> -->
				
				<security:authorize access="hasAuthority('ADMIN')">
				
				<li class="dropdown" id="adminProduct">
                      <a class="dropdown-toggle" data-toggle="dropdown" href="${contextRoot}/admin">Admin
                         <span class="caret"></span></a>
                          <ul class="dropdown-menu">
                            <li><a href ="${contextRoot}/admin">Category</a></li>
                            <li><a href="${contextRoot}/admin/admin/Products">Product</a></li>
                           
                          </ul>
                      </li>
                    
				
				</security:authorize>
				
				<ul class="nav navbar-nav navbar-right">
				
					<li id="register"><a href="${contextRoot}/register"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
							<security:authorize access="isAnonymous()">
							
					<li><a href="${contextRoot}/login"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
							</security:authorize>
							
				<%--	<li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>--%>
							
							
					<security:authorize access="isAuthenticated()">
					<li><a href="${contextRoot}/perform_logout"><span
							class="glyphicon glyphicon-log-out"></span> Logout</a></li>
							</security:authorize>
				</ul>
		</div>

	</div>
	<!-- /.navbar-collapse -->
	</div>
	<!-- /.container -->
</nav>

