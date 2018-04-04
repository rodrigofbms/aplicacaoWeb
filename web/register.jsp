<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 03/04/2018
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CADASTRO DO MEU BOM!</title>
</head>
<body>
<div align="center">
    <form method="post" action="sevletRegister">
Login: <input type="text" name = "loginRegister">
Password: <input type="password" name="passwordRegister">
    Comfirm Passaword: <input type="text" name="passwordRegisterConfirm">
    Email: <input type="text" name="emailRegister">
        <button type="submit"> Cadastrar </button>
    </form>
</div>
</body>
</html>
