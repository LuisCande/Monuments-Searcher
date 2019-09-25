<?php
include_once("cabecera.html");

?>
<!DOCTYPE html>
<html>
<head>
    
<style>

#cabecera{
       
        border-bottom: 3px solid black;
    }
table, th, td {
    margin-right: 150px;
    margin-left: 80px;
    
    bordser: 1px solid black;
    border-collapse: collapse;
    padding: 5px;
    /text-align: left;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
}
table#t01 tr:nth-child(odd) {
    background-color: #ccc;
}
table#t01 th {
    color: white;
    background-color: black;
}
div#cuerpo{
    margin-right: 150px;
    margin-left: 80px;
    padding: 5px;
}
div#metodos {
    text-decoration: underline;
    margin-right: 150px;
    margin-left: 80px;
    padding: 5px;
}
div#descripcion {
/*    margin-top: 100px;
    margin-bottom: 100px;*/
    margin-right: 150px;
    margin-left:80px;
    padding: 5px;
}
div#ejemplo{
/*    margin-top: 100px;
    margin-bottom: 100px;*/
    margin-right: 150px;
    margin-left: 150px;
    padding: 5px;
}
</style>
<div id="cabecera"><center><img  src="logo(cabecera).png" alt="MS" ></center></div><br>

</head>
<body>

<table id="t01">
  <tr>
    <th><h3>HTTP</h3></th>
    <th><h3>Plantilla URI</h3></th> 
    <th><h3>Descripcion</h3></th>
  </tr>
  <tr>
    <td>Post</td>
    <td>/OpinionList/{Ciudad}/{Autor}</td>
    <td>Añadir una nueva opinión. Si se añade correctamente, devolverá *200 OK* con la referencia a la URI. Si no es correcto, debe devolver un error *400 Bad Request*. Si está duplicada, devolverá *409 Conflict*.</td>
  </tr>
  <tr>
    <td>Get</td>
    <td>/OpinionList/{Ciudad}</td>
    <td>Ver la opinión para cada lugar. Si la opinión no está disponible, deberá devolver *404 Not Found*</td>
  </tr>
  <tr>
    <td>Put</td>
    <td>/OpinionList/{Ciudad}/{Autor}/</td>
    <td>Modifica las opiniones. Si se realiza correctamente, debe devolver un *204 No Content*. Si se intentan modificar  todas las opiniones, deberá devolver un *405 Request Method not Supported*</td>
  </tr>
  <tr>
    <td>Delete</td>
    <td>/OpinionList/{Ciudad}</td>
    <td>Borrar las opiniones de una ciudad concreta. Si no existe, deberá devolver un *404 Not Found*.</td>
  </tr>
  <tr>
    <td>Get</td>
    <td>/OpinionList/</td>
    <td>Ver todas las opiniones. Si no hay opiniones disponibles, deberá devolver *404 Not Found* </td>
  </tr>
      <tr>
    <td>Delete</td>
    <td>/OpinionList/{Ciudad}/{Autor}</td>
    <td>Borra todas las opiniones. Si se intenta borrar todas las opiniones,  Si se tratan de borrar todas las opiniones, deberá devolver un *403 Forbidden* </td>
  </tr>
      <tr>
    <td>Delete</td>
    <td>/OpinionList/</td>
    <td>Borrar todas las opiniones. Si se intenta borrar todas las opiniones, devolverá *304 Not Modified* </td>
  </tr>
</table>
<br>
<div id="cuerpo">
<h3>Ejemplos de uso:</h3>

         <div id="metodos">-GET(ciudad):</div>
    <div id="descripcion">Listado con las opiniones de los usuarios acerca de la ciudad especificada. Se obtiene una respuesta en formato JSON.<br>Lo cual devolverá:</div>
    <div id="ejemplo">[{"ciudad":"Sevilla", "texto":"...opinión...", "nombre del autor":"Mayik", "apellidos del autor":"Al-Jazeera Islamabad", 
    "valoración":"10/10","fecha de publicación":"20/06/2017"},<br> {"ciudad":"Sevilla", "texto":"...opinión...", 
    "nombre del autor":"José Manuel", "apellidos del autor":"Ruiz-Mateos Ruiz De Lacanal", "valoración":"3/10",
    "fecha de publicación":"04/09/2017"},<br> {"ciudad":"Sevilla", "texto":"...opinión...", "nombre del autor":"Jerjes", 
    "apellidos del autor":"El  Inmortal", "valoración":"8/10","fecha de publicación":"02/10/2017"}]</div><br>
    <div id="metodos">-GET(general):</div>
    <div id="descripcion">Listado con las opiniones de los usuarios acerca de todas las ciudades. Se obtiene una respuesta en formato JSON.<br>
    Lo cual devolverá:</div>
    <div id="ejemplo">[{"ciudad":"Bilbao", "texto":"...opinión...", "nombre del autor":"Mayik", "apellidos del autor":"Al-Jazeera Islamabad", 
    "valoración":"10/10","fecha de publicación":"20/06/2017"},<br>
    {"ciudad":"Jerez", "texto":"...opinión...", 
    "nombre del autor":"José Manuel", "apellidos del autor":"Ruiz-Mateos Ruiz De Lacanal", "valoración":"3/10",
    "fecha de publicación":"04/09/2017"},<br>
    {"ciudad":"Ceuta", "texto":"...opinión...", "nombre del autor":"Jerjes", 
    "apellidos del autor":"El  Inmortal", "valoración":"8/10","fecha de publicación":"02/10/2017"}]</div>
    <br>
    
    
    <div id="metodos">-POST:</div>
    <div id="descripcion">Subida de nuevas opiniones en una ciudad, se introduce un objeto Opinión en formato Json (cuyo ejemplo se mostrará a 
     continuación) y se obtiene la ciudad insertada con su conjunto de opiniones en formato Json, contando con la nuestra.<br>
     Lo cual devolverá:</div>
    <div id="ejemplo">[{"ciudad":"Zamora", "texto":"...opinión...", "nombre del autor":"Steve", "apellidos del autor":"Jobs Fernández", 
    "valoración":"5/10","fecha de publicación":"LA PONDRÍA EL SISTEMA(?)"}<br>

     (Y SE AÑADE A EL RESTO DE OPINIONES DE ZAMORA Y GENERALES) + <br>

    {"ciudad":"Bilbao", "texto":"...opinión...", "nombre del autor":"Mayik", "apellidos del autor":"Al-Jazeera Islamabad", 
    "valoración":"10/10","fecha de publicación":"20/06/2017"},<br> {"ciudad":"Jerez", "texto":"...opinión...", 
    "nombre del autor":"José Manuel", "apellidos del autor":"Ruiz-Mateos Ruiz De Lacanal", "valoración":"3/10",
    "fecha de publicación":"04/09/2017"},<br> {"ciudad":"Ceuta", "texto":"...opinión...", "nombre del autor":"Jerjes", 
    "apellidos del autor":"El  Inmortal", "valoración":"8/10","fecha de publicación":"02/10/2017"}]</div><br>
   
     

    
    <div id="metodos">-PUT(ciudad):</div>
    <div id="descripcion">Actualización de una opinión acerca de la ciudad especificada, se introduce un Json, y se obtiene la ciudad insertada
     con su conjunto de opiniones en formato Json, contando con la actualizada.<br>

     Lo cual devolverá:</div>
    <div id="ejemplo">[{"ciudad":"Zamora", "texto":"...opinión...", "nombre del autor":"Steve", "apellidos del autor":"Jobs Fernández", 
    "valoración":"7/10","fecha de publicación":"LA PONDRÍA EL SISTEMA(?)"}<br>

     (Y SE AÑADE A EL RESTO DE OPINIONES DE ZAMORA Y GENERALES) + <br>

    {"ciudad":"Bilbao", "texto":"...opinión...", "nombre del autor":"Mayik", "apellidos del autor":"Al-Jazeera Islamabad", 
    "valoración":"10/10","fecha de publicación":"20/06/2017"},<br>
    {"ciudad":"Jerez", "texto":"...opinión...", 
    "nombre del autor":"José Manuel", "apellidos del autor":"Ruiz-Mateos Ruiz De Lacanal", "valoración":"3/10",
    "fecha de publicación":"04/09/2017"}, <br>{"ciudad":"Ceuta", "texto":"...opinión...", "nombre del autor":"Jerjes", 
    "apellidos del autor":"El  Inmortal", "valoración":"8/10","fecha de publicación":"02/10/2017"}]</div><br>
    <div id="metodos"> -DELETE(ciudad):<br></div>
    <div id="descripcion"> Eliminación de una opinión de una ciudad especificada, solo hay que introducir el nombre y no devuelve nada.</div><br>
    <div id="metodos">CÓDIGOS DE ESTADO:</div>
    <div id="descripcion">Actualmente, la API utilizará 5 respuestas HTTP:</div>
    <div id="ejemplo">- 200 OK --> La solicitud fue procesada con éxito.<br>
    - 204 No Content --> La solicitud se ha modificado correctamente.<br>
    - 400 Bad Request --> La solicitud no fue procesada correctamente.<br>
    - 404 Not Found --> La solicitud no está disponible.<br>
    - 409 Conflict --> La solicitud está duplicada.
    <br>
    A FALTA DE PONER LAS DE LOS MÉTODOS CUANDO SE TRATA DE MODIFICAR O BORRAR TODAS LAS OPINIONES</div><br>
 
   
    
</div>
</body>
<footer>
<center><button id="botonAtras" onclick="window.location.href='searchView.html'">Atras</button></center>
</footer>
</html>