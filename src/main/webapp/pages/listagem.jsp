<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cachorros</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light mb-2">
	  <a class="navbar-brand" href="/cachorros">Cachorros</a>
	</nav>
	
	<div class="container">
		<c:if test="${not empty message}">
			<p id="message" class="alert alert-warning">
				${message}
			</p>
		</c:if>
		
		<a href="/cachorros/form?page=cadastro_cachorro" class="btn btn-success mt-3 mb-3">Cadastrar Cachorro</a>
		
		<table class="table table-striped">
			<thead>
				<td>ID</td>
				<td>Nome</td>
				<td>Raça</td>
				<td>Porte</td>
				<td>Idade</td>
				<td>Cor</td>
				<td>Peso</td>
				<td>Sexo</td>
				<td>Ações</td>
			</thead>
				<c:forEach items="${cachorros}" var="cachorro">
					<tr>
						<td><c:out value = "${cachorro.value.id}"/></td>
						<td><c:out value = "${cachorro.value.nome}"/></td>
						<td><c:out value = "${cachorro.value.raca}" /></td>
						<td><c:out value = "${cachorro.value.porte}"/></td>
						<td><c:out value = "${cachorro.value.idade}"/></td>
						<td><c:out value = "${cachorro.value.cor}"/></td>
						<td><c:out value = "${cachorro.value.peso}Kg"/></td>
						<c:if test="${ cachorro.value.sexo == 'M' }">
							<td>Masculino</td>
						</c:if>
						<c:if test="${ cachorro.value.sexo == 'F' }">
							<td>Feminino</td>
						</c:if>
						
						<td>
							<form:form action="${cachorro.value.id}" method="delete">
								<a class="btn btn-success btn-xs" href="/cachorros/${cachorro.value.id}">Detalhes</a>
								<a class="btn btn-warning btn-xs" href="/cachorros/form?page=editar_cachorro&id=${cachorro.value.id}">Editar</a>
								<input type="submit" value="Excluir" class="btn btn-danger btn-xs">
							</form:form>
						</td>
					</tr>
					
				</c:forEach>
			<tbody>
			</tbody>
		</table>
	</div>
	
	<script>
		$(function() {
			setTimeout(function() {
				$("#message").fadeOut("slow");
			},3000);
		});
	</script>
	
</body>
</html>