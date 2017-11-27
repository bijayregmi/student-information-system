<jsp:include page="includes/header.jsp" />

<script type="text/javascript">
	$(function() {
		$("#sample_editable").dataTable({
			searching : false
		});
		getdata('get', 'students');
		$("#btnsearch").click(function() {
			$("#sample_editable").dataTable().fnClearTable();
			getdata('get', 'students/search/' + $("#search").val());

		});

	});

	function getdata(requestType, currenturl) {

		$
				.ajax({
					type : requestType,
					url : currenturl,
					data : {
						format : 'json'
					},
					success : function(data) {
						if (data != null) {
							$
									.each(
											data,
											function(key, value) {

												var rowIndex = $(
														"#sample_editable")
														.dataTable()
														.fnAddData(
																[
																		value.id,
																		value.firstName,
																		value.lastName,
																		'<a href="editStudent/'+value.id+'"> Edit </a>',
																		'<a href="student/'+value.id+'"> View </a>'

																]);
												var row = $('#sample_editable')
														.dataTable()
														.fnGetNodes(rowIndex);
												$(row).attr('id', value.id);
											});
						}

					},
					error : function(jqXHR, status, err) {
						alert("Failure");
					}
				});

	}
</script>

<a href="${contextPath}/student"><h1>List Of Students</h1></a>

<div class="pull-right">
	<input type="text" id="search" placeholder="Search by Last Name"
		required>
	<button id="btnsearch" class="btn btn-primary">Search</button>
</div>

<table class="table table-striped table-hover table-bordered"
	id="sample_editable">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Edit</th>
			<th>View</th>
		</tr>
	</thead>
</table>
<jsp:include page="includes/footer.jsp" />