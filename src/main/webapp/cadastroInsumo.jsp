<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro Insumo</title>
</head>
<body>

    <h1>Cadastro de Insumo</h1>

    <%
        String msg = (String) session.getAttribute("msg");

        if(msg != null){
    %>

        <h3><%= msg %></h3>

    <%
            session.removeAttribute("msg");
        }
    %>

    <form action="Insumos" method="POST">

        Código:
        <input type="number" name="codigo">

        <br><br>

        Nome:
        <input type="text" name="nome">

        <br><br>

        Marca:
        <input type="text" name="marca">

        <br><br>

        Categoria:
        <input type="text" name="categoria">

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