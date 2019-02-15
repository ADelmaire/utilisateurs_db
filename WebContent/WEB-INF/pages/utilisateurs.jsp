<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="ressources/css/utilisateurs.css" />
<title>utilisateurs</title>
</head>
<body>

	<h1>Les Utilisateurs</h1>

<a href="ajouter">Ajouter un utilisateur</a>
	<div id=conteneur>
		<c:forEach items="${utilisateurs}" var="utilisateur">
			<div class=blockPhoto>
				<a href="utilisateur-infos?id=${utilisateur.id}"><img src="${ utilisateur.photo }" /></a>
				<div>${ utilisateur.nom } ${ utilisateur.prenom }</div>
			</div>
		</c:forEach>
	</div>

</body>
</html>