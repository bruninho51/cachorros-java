<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro Cachorro</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="/cachorros">Cachorros</a>
	</nav>
	
	<div class="container mb-2">
		<form:form modelAttribute="cachorroModel" action="/cachorros/" method="post">
			<form:input type="hidden" path="id" name="id" value="${ id }" />
			<div class="form-group">
				<label class="control-label" for="">Nome: </label>
				<form:input type="text" path="nome" name="nome" id="nome" value="" class="form-control" />
				<font color="red">
					<form:errors path="nome" />
				</font>
			</div>
			<div class="form-group">
				<label class="control-label" for="">Raça: </label>
				<form:input type="text" path="raca" name="raca" id="raca" value="" class="form-control" />
				<font color="red">
					<form:errors path="raca" />
				</font>
			</div>
			<div class="form-group">
				<label class="control-label" for="">Porte: </label>
				<form:input placeholder="MINI, P, M, G, XG" type="text" path="porte" name="porte" id="porte" value="" class="form-control" />
				<font color="red">
					<form:errors path="porte" />
				</font>
			</div>
			<div class="form-group">
				<label class="control-label" for="">Idade: </label>
				<form:input type="text" path="idade" name="idade" id="idade" value="" class="form-control" />
				<font color="red">
					<form:errors path="idade" />
				</font>
			</div>
			<div class="form-group">
				<label class="control-label" for="">Cor: </label>
				<form:input type="text" path="cor" name="cor" id="cor" value="" class="form-control" />
				<font color="red">
					<form:errors path="cor" />
				</font>
			</div>
			<div class="form-group">
				<label class="control-label" for="">Peso: </label>
				<form:input type="text" path="peso" name="nome" id="peso" value="" class="form-control" />
				<font color="red">
					<form:errors path="peso" />
				</font>
			</div>
			<div class="form-group">
				<label class="control-label" for="">Sexo: </label>
				<form:input placeholder="M, F" type="text" path="sexo" name="sexo" id="sexo" value="" class="form-control" />
				<font color="red">
					<form:errors path="sexo" />
				</font>
			</div>
			<button type="submit" class="btn btn-success btn-block">Cadastrar</button>
		</form:form>
	</div>

</body>
</html>