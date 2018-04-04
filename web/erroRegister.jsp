<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 03/04/2018
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CADASTRO DO MEU BOM!</title>
</head>
<body>
<script> window.onload = function (ev) {
    alert("Confirmação da senha inválida!") } </script>
<div align="center">
    <form method="post" action="sevletRegister">
        Login: <input type="text" name = "loginRegister">
        Password: <input type="password" name="passwordRegister">
        Comfirm Passaword: <input type="text" name="passwordRegisterConfirm">
        Email: <input type="text" name="emailRegister">
    </form>
</div>

</body>
</html>
