<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Admin-Reservation</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
		<a class="navbar-brand"
			href="${pageContext.request.contextPath}/Admin"><img
			style="margin: auto;"
			src="data:image/png;base64,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"
			height="40px" width="180px" alt=""> </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="${pageContext.request.contextPath}/List-Apprenant">Apprenants
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="${pageContext.request.contextPath}/List-Reservation">Reservation
						<span class="sr-only">(current)</span>
				</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0" method="post" action="${pageContext.request.contextPath}/deconnect">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Deconnection</button>
			</form>
		</div>
	</nav>
	<br>
	<br>
	<div>
		<h1 style="text-align: center;">Neveau Reservation Pas Accepter</h1>
	</div>
	<br>
	<br>
	<div>
		<table class="table table-dark">
			<thead>

				<tr>
					<th scope="col">ID Reservation</th>
					<th scope="col">NOM Apprenants</th>
					<th scope="col">Date Reservation</th>
					<th scope="col">NOM Fabrique</th>
					<th scope="col">Accepter</th>
					<th scope="col">No</th>

				</tr>
			</thead>
			<tbody>
				<s:forEach items="${ListRes}" var="l">

					<tr>
						<th scope="row">${l.id_reservation}</th>
						<td>${l.getApprenants().getNom_user()}</td>
						<td>${l.getAgenda().getDate()}</td>
						<td>${l.getFabrique().getNom_fabrique()}</td>
						<td>
							<form action="AccepteRes" method="post">
								<input style="display: none;" name="Accepte" value="${l.id_reservation}">
								<button class="btn btn-primary">Accepte</button>
							</form>
						</td>
						<td>
							<form action="RefuseRes" method="post">
								<input style="display: none;" name="Refuse"
									value="${l.id_reservation}">
								<button class="btn btn-primary">Refuse</button>
							</form>
						</td>
					</tr>
				</s:forEach>

			</tbody>
		</table>

	</div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</html>