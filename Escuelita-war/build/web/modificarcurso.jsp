<%-- 
    Document   : modificaralumno
    Created on : May 17, 2019, 12:53:32 PM
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
        <form action="servletModificarCurso">
            <input type="idCurso" name="idCurso" value="${param.idCurso}">
            <input type="nombre" name="nombre" value="${param.nombre}">
            <input type="cantidad" name="cantidad" value="${param.cantidad}">
            <input type="docente" name="rutDocente" value="${param.rutDocente}">
        </form>
    </body>
</html>
