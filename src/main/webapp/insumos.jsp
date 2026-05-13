<%@page import="com.Breno.campsolidarium.model.Insumo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insumos</title>
</head>
<body>

    <h1>Lista de Insumos</h1>

    <%
        List<Insumo> insumos =
                (List<Insumo>) session.getAttribute("insumos");
    %>

    <table border="1">

        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>Marca</th>
            <th>Categoria</th>
        </tr>

        <%
            for(Insumo i : insumos){
        %>

        <tr>
            <td><%= i.getCodigo() %></td>
            <td><%= i.getNome() %></td>
            <td><%= i.getMarca() %></td>
            <td><%= i.getCategoria() %></td>
        </tr>

        <%
            }
        %>

    </table>

    <br>

    <a href="index.jsp">
        Voltar
    </a>

</body>
</html>