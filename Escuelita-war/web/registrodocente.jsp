<%-- 
    Document   : registrodocente
    Created on : May 17, 2019, 12:31:04 AM
    Author     : ztx187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar un docente</h1><br><br>
        <form action="docenteServlet" method="post">
            <input type="text" name="rut" placeholder="Ingrese rut" required><br>
            <input type="text" name="nombre" placeholder="Ingrese nombre" required><br>
            <input type="text" name="apellido" placeholder="Ingrese apellido" required><br>
            <input type="text" name="edad" placeholder="Ingrese edad" required><br>
            <input type="text" name="area" placeholder="Ingrese área" required><br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
