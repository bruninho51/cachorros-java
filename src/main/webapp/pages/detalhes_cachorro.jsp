<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detalhes Cachorro</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light mb-2">
	  <a class="navbar-brand" href="/cachorros">Cachorros</a>
	</nav>
	
	<div class="container">
		<div class="card" style="display:inline">
		  <div class="card-header">
		  	Detalhes Cachorro
		  </div>
		  <div class="card-body">
		    <p>ID: ${ cachorro.id }</p>
			<p>Nome: ${ cachorro.nome } </p>
			<p>Raça: ${ cachorro.raca } </p>
			<p>Porte: ${ cachorro.porte } </p>
			<p>Idade: ${ cachorro.idade } </p>
			<p>Cor: ${ cachorro.cor } </p>
			<p>Peso: ${ cachorro.peso }Kg </p>
			<c:if test="${ cachorro.sexo == 'M' }">
				<p>Sexo: Masculino</p>
			</c:if>
			<c:if test="${ cachorro.sexo == 'F' }">
				<p>Sexo: Feminino</p>
			</c:if>
		  </div>
		</div>
	</div>
	
</body>
</html>