<jsp:include page="includes/header.jsp" />

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="col-md-12">
	<h1>Student Details</h1>
	<div class="row">
		<div class="col-md-2 labels">
			<label for="example-text-input" class="col-form-label">First
				Name: </label>
		</div>
		<div class="col-md-10">${studentInfo.student.firstName}</div>

	</div>
	<div class="row">
		<div class="col-md-2 labels">
			<label for="example-text-input" class="col-form-label">Last
				Name: </label>
		</div>
		<div class="col-md-10">${studentInfo.student.lastName}</div>
	</div>
	<div class="row">
		<div class="col-md-2 labels">
			<label for="example-text-input" class="col-form-label">Semester:
			</label>
		</div>
		<div class="col-md-10">${studentInfo.semester}</div>
	</div>
	<div class="row">
		<div class="col-md-2 labels">
			<label for="example-text-input" class="col-2 col-form-label">Courses:
			</label>
		</div>
		<div class="col-md-10">
			<c:forEach var="course" items="${studentInfo.courses}">
				<div>${course.name}</div>
			</c:forEach>
		</div>
	</div>

	<a class="btn btn-primary" href="${contextPath}/student">Back</a>
</div>

<jsp:include page="includes/footer.jsp" />