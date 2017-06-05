<div class="container">
	<div class="container col-md-offset-2 col-md-col-md-8">
		<form:form action="/onlineshopping/admin/add/product" method="POST"	modelAttribute="product" enctype="multipart/form-data" class="form-horizontal">
			
			<div class="form-group">
				<label class="col-md-2 control-label" for="name">Product Name</label>
				<div class="col-sm-6">
					<form:input type="text" path="name" id="name" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="name" class="help-inline" />
					</div>
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-2 control-label" for="description">Description</label>
				<div class="col-sm-6">
					<form:input type="text" path="description" id="description"	class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="description" class="help-inline" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label" for="price">Price</label>
				<div class="col-sm-6">
					<form:input type="text" path="price" id="price"	class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="price" class="help-inline" />
					</div>
				</div>
			</div>
			
			<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="img">Image URL</label>
                <div class="col-md-7">
                    <form:input type="text" path="imageUrl" id="imageUrl" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="imageUrl" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form:form>
	</div>
</div>
<div class="row">
	<div class="col-md-offset-2 col-md-8">
		<table class="table table-striped table-bordered" id="myproduct">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Image</th>
					<th></th>
				</tr>
			</thead>
		</table>
	</div>
</div>