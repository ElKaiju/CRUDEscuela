<%-- 
    Document   : modificardocente
    Created on : May 17, 2019, 11:57:01 AM
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
        <form action="servletModificarDocente">
            <input type="hidden" name="rut" value="${param.rut}">
            <input type="text" name="nombre" value="${param.nombre}">
            <input type="text" name="apellido" value="${param.apellido}">
            <input type="text" name="edad" value="${param.edad}">
            <input type="text" name="area" value="${param.area}">
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>
