<%-- 
    Document   : index
    Created on : 24/10/2022, 16:35:16
    Author     : francisco
--%>

<%@page import="java.sql.Connection"%>
<%@page import="com.github.ffrancoc.controlacademico.controller.db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">         
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Control Académico</title>
    </head>
    <body>
        <%
            Connection conn = Conexion.getConexion();
        %>
        <h1>Login</h1>
    </body>
</html>
