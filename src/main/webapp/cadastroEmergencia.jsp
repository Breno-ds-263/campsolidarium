<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro Emergência</title>
</head>
<body>

    <h1>Cadastro de Emergência</h1>

    <%
        String msg = (String) session.getAttribute("msg");

        if(msg != null){
    %>

        <h3><%= msg %></h3>

    <%
            session.removeAttribute("msg");
        }
    %>

    <form action="Emergencias" method="POST">

        Código:
        <input type="number" name="codigo">

        <br><br>

        Local:
        <input type="text" name="local">

        <br><br>

        Tipo:
        <input type="text" name="tipo">

        <br><br>

        Descrição:
        <input type="text" name="descricao">

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