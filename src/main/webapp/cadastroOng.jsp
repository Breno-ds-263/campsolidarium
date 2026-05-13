<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro ONG</title>
</head>
<body>

    <h1>Cadastro de ONG</h1>

    <%
        String msg = (String) session.getAttribute("msg");

        if(msg != null){
    %>

        <h3><%= msg %></h3>

    <%
            session.removeAttribute("msg");
        }
    %>

    <form action="Ongs" method="POST">

        Código:
        <input type="number" name="codigo">

        <br><br>

        Nome:
        <input type="text" name="nome">

        <br><br>

        Login:
        <input type="text" name="login">

        <br><br>

        Senha:
        <input type="password" name="senha">

        <br><br>

        <button type="submit">
            Cadastrar
        </button>

    </form>

    <br>

    <a href="index.jsp">
        Voltar
    </a>

</body>
</html>