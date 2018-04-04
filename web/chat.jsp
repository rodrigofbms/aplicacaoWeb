<%--
  Created by IntelliJ IDEA.
  User: Usuario
  Date: 02/04/2018
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CHAT DO MEU BOM!</title>
</head>
<body>
<h1 align="center">
    BEM VINDO, <% out.print(session.getAttribute("login")+ "!");%>
</h1>
<br>
    <div align="center">
<textarea readonly rows="40" cols="90" style="resize: none"><%if(application.getAttribute("mensagem") != null) {
        out.print(application.getAttribute("mensagem"));
    }
    %>
</textarea> <br>
    <form method="post" action="ChatServlet">
<input type="text" name="mensagem"> <br>
<button type="submit">Enviar </button>
    </form>
</div>
</body>
</html>
