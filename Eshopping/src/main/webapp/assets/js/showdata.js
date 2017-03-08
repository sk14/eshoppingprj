 $(function(){
	$('#prdat')
	           .DataTable(
					    {
						ajax : {
							url : '/Eshopping/products/all/pro',
							dataSrc : ''
						},

						columns : [

								
								{
									data : 'name'
								},
								{
									data : 'description'
								},
								{
									data : 'price'
								},
								{
									data : 'imageUrl',
									mRender : function(data, type, row) {
										return '<img src="SamplePrj/assets/images/prdimg'+data+'.jpg" height="170px" width="190px">';
									}
								},
								{
									data : 'id',
									mRender : function(data, type,row) {
										return '<a href="prdview/'+data+'" role="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="">view</a><button type="submit" class="btn btn-danger btn-lg">Add to Cart</button>';
									}
								}	
						]
					});
   });