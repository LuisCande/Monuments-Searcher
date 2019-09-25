<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resultView.css">
<title>resultView</title>
</head>
<body>

<img src="logo.png" alt="MonumentsSearcher.com" width="620" height=105">
<p>Si falta algun lugar de tu ciudad no dudes en <a href="postToFoursquareView.jsp" class="button">incluirlo.</a></p>

<fieldset id="Flickr">
<legend>Fotos relacionadas con <c:out value="${param.searchQuery}"/></legend>
<c:forEach items="${requestScope.photos}" var="photo">
<img src ='http://farm<c:out value="${photo.farm}"/>.staticflickr.com/<c:out value="${photo.server}"/>/<c:out value="${photo.id}"/>_<c:out value="${photo.secret}"/>.jpg'/>
</c:forEach>
</fieldset>

<fieldset id="Google Maps">
<legend>Ubicacion exacta de <c:out value="${param.searchQuery}"/></legend>
<iframe width="600" height="450" frameborder="0" style="border:0" src="https://www.google.com/maps/embed/v1/search?q=<c:out value="${param.searchQuery}"/>%2C%20Espa%C3%B1a&key=AIzaSyBKv4BtyhBzuX4Wtx7AY9vhgBzYRqn2grw" allowfullscreen></iframe>
</fieldset>

<fieldset id="Foursquare">
<legend>Lugares de <c:out value="${param.searchQuery}"/></legend>
<c:forEach items="${requestScope.venues}" var="venue">
	<span><c:out value="${venue.name}"/>,<c:out value="${venue.location.address}"/>,<c:out value="${venue.contact.phone}"/>.</span><br/>
	<!--<button data-venue="${venue.name}" class="postTrello">Enviar a trello</button>-->
</c:forEach>
</fieldset>

<fieldset id="Wunderground">
<legend>Parte meteorologico actual de <c:out value="${param.searchQuery}"/></legend>
<p>Precipitaciones: <c:out value="${requestScope.precipitations}"/></p>
<p>Composicion del cielo: <c:out value="${requestScope.sky}"/></p>
<p>Velocidad del viento: <c:out value="${requestScope.windspeed}"/> kms/h</p>
<p>Temperatura: <c:out value="${requestScope.temperature}"/></p>
<p>Para mas informacion consulta el siguiente enlace <c:out value="${requestScope.info}"/></p>

</fieldset>

</body>
</html>