<%-- 
    Document   : index
    Created on : 9/06/2023, 19:46:19
    Author     : crist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
    <script src="recursos/funciones.js"></script>
    <title>LOGIN - ADMIN</title>
</head>
<body>
    <form name="form1" action="/ProyectoFinalAdmin/control" method="post">
        <h1>Administradores</h1>
        Usuario: <input type="text" name="usuario" placeholder="ingrese su usuario"/>
        <br>
        Password: <input type="password" name="password" placeholder="ingrese su contraseña"/>
        <br>
        <button>Iniciar sesión</button>
        <br>
        <a href="usuario.html">No eres administrador?, ingresa como usuario</a>
    </form>
</body>
</html>
