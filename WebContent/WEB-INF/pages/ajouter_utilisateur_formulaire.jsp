<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="ressources/css/ajouter_utilisateur_formulaire.css"/>
<title>Insert title here</title>
</head>
<body>

<h1>Inscription</h1>

<div>
<form action="ajouter" method= "post" id="form">
<fieldset>
<legend>Nouvel utilisateur</legend>
		<label for="nom">Nom:</label>
		<input type="text" id="nom" name="nom" class="bloc"/>
		<br>
		<label for="prenom">Prenom:</label>
		<input type="text" id="prenom" name="prenom" class="bloc"/>
		<br>
		<label for="numero">Numéro:</label>
		<input type="text" id="numero" name="numero" class="bloc"/>
		<br>
		<label for="phone">Numéro de téléphone:</label>
		<input type="text" id="phone" name="phone" class="bloc"/>
		<br>
		<label for="email">email:</label>
		<input type="text" id="email" name="email" class="bloc"/>
		<br>
		<label for="adresse">Adresse:</label>
		<input type="text" id="adresse" name="adresse" class="bloc"/>
		<br>
		<label for="photo">Photo:</label>
		<input type="text" id="photo" name="photo" class="bloc"/>
		<br>
		</fieldset>
		<input type="submit" value="envoyer" class="bouton">
		<input type="reset" value="annuler" class="bouton">
		
</form>
</div>

</body>
</html>