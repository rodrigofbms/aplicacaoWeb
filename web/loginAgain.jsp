<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 03/04/2018
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BEM VINDO AO CHAT DO MEU BOM!</title>
</head>
<body>
<script> window.onload = function (ev) {
    alert("Acesso inválido!") } </script>
<div align="center">
<form action="LoginServlet" method="post">
    <input type = "text" name = "login"> <br>
    <input type="password" name="senha"> <br>
    <button type="submit"> Entrar </button> <br>
</form>
<form action="" method = "post">
    <button type = "submit">Não é cadastrado ?</button>
</form>
</div>
</body>
</html>
