<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="ressources/css/utilisateur-infos.css" />
<title>Infos utilisateur</title>
</head>
<body>

	<h1>Infos utilisateur</h1>

	<div id="conteneur">
		<div id="nom">${utilisateur.prenom}${utilisateur.nom}</div>
		<div>
			<img alt="" src="${utilisateur.photo}">
		</div>

		<div>
			<ul>
				<li>${utilisateur.numero}</li>
				<li>${utilisateur.phone}</li>
				<li>${utilisateur.email}</li>
			</ul>
		</div>
		<div>
		<a href="supprimer?id=${utilisateur.id}">Supprimer</a><br/>
		<a href="modifier?id=${utilisateur.id}">Modifier</a>
		
		</div>
	</div>

</body>
</html>