
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>postToFousquareView</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<img src="logo.png" alt="MonumentsSearcher.com" width="620" height=105">
	<h1>Publicar Post en Foursquare</h1>
	<div class="container">
	
		<p class="venue"></p>
		
			<form action="/foursquarePost" method="post">
			
			Venue: <textarea name="nameVenue"></textarea>
			<br>
			Latitude: <textarea name="latitude"></textarea>
			<br>
			Longitude: <textarea name="longitude"></textarea>
			<br>
			<div class="bottom">
				<button type="submit" class="button">Publicar en Foursquare</button>
			</div>
	</form></div></body>
</html>