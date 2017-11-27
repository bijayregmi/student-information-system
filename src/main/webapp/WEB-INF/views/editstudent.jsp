<jsp:include page="includes/header.jsp" />
	
<h1>Update Student Information</h1>

<form action="${pageContext.request.contextPath}/students" method="post" name="editStudent">
	<input type="hidden" name="id" id="id" value="${student.id}" />
	
	<div class="form-group">
		<label class="col-form-label" for="firstName">First Name:</label> 
		<input type="text" class="form-control" name="firstName" id="firstName" value="${student.firstName}" placeholder="Enter student first name">
	</div>
	<div class="form-group">
		<label class="col-form-label" for="lastName">Last Name:</label> 
		<input type="text" class="form-control" name="lastName" id="lastName" value="${student.lastName}" placeholder="Enter student last name">
	</div>

	<input class="btn btn-primary" type="button" value="Submit" onClick="updateStudent('${pageContext.request.contextPath}')"> 
	<input class="btn btn-warning" type="reset" value="Reset">
	<a class="btn btn-primary" href="${contextPath}/student">Back</a>

</form>

<script type="text/javascript">
	
</script>

<jsp:include page="includes/footer.jsp" />