<%-- 
    Document   : index
    Created on : 25/08/2017, 04:42:47 PM
    Author     : 5IM6 Hernández Marín Miguel Angel, Sánchez López Luis Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <!--Éste Script ejecuta una función para hacer un submit al formulario.-->
    <script>
        function una() {
            var algo2 = document.getElementById("algo");
            algo2.submit();
        }
    </script>
    <body onload="una()">
        <!--Éste form redirecciona la página a el servlet.-->
        <form action="http://localhost:8080/Serv/Hello" method="post" id="algo">
        </form>
    </body>
</html>
