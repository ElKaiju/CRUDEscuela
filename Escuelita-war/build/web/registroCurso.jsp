<%-- 
    Document   : registroCurso
    Created on : May 17, 2019, 11:30:46 AM
    Author     : ztx187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar un curso</title>
    </head>
    <body>
        <h1>Registrar un Curso</h1><br><br>
        <form action="cursoServlet">
            <input type="text" name="idCurso" placeholder="Ingrese ID del curso"required ><br>
            <input type="text" name="nombre" placeholder="Ingrese nombre del Curso" requiered ><br>
            <input type="text" name="cantidad" placeholder="Ingrese cantidad de alumnos" requiered ><br>
            <input type="text" name="rutDocente" placeholder="Ingrese rut docente" requiered ><br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
