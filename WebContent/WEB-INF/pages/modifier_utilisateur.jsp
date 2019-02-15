<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="ressources/css/modifier_utilisateur.css"/>
<title>modification</title>
</head>
<body>
<h1>Modifier vos infos</h1>

<div>
<form action="modifier" method= "post" id="form">
<fieldset>
<legend>Modifications d'infos utilisateur</legend>

		<input type="text" id="id" name="id" value=${utilisateur.id} hidden/>
		<label for="nom">Nom:</label>
		<input type="text" id="nom" name="nom" value=${utilisateur.nom} class="bloc"/>
		<br>
		<label for="prenom">Prenom:</label>
		<input type="text" id="prenom" name="prenom" value=${utilisateur.prenom} class="bloc"/>
		<br>
		<label for="numero">Numéro:</label>
		<input type="text" id="numero" name="numero" value=${utilisateur.numero} class="bloc"/>
		<br>
		<label for="phone">Numéro de téléphone:</label>
		<input type="text" id="phone" name="phone" value=${utilisateur.phone} class="bloc"/>
		<br>
		<label for="email">email:</label>
		<input type="text" id="email" name="email" value=${utilisateur.email} class="bloc"/>
		<br>
		<label for="adresse">Adresse:</label>
		<input type="text" id="adresse" name="adresse" value=${utilisateur.adresse} class="bloc"/>
		<br>
		<label for="photo">Photo:</label>
		<input type="text" id="photo" name="photo" value=${utilisateur.photo} class="bloc"/>
		<br>
		</fieldset>
		<input type="submit" value="modifier" class="bouton">
		<input type="reset" value="annuler" class="bouton">
		
</form>
</div>

</body>
</html>