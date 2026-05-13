<%@page import="com.Breno.campsolidarium.model.Emergencia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Emergências</title>
</head>
<body>

    <h1>Lista de Emergências</h1>

    <%
        List<Emergencia> emergencias =
                (List<Emergencia>) session.getAttribute("emergencias");
    %>

    <table border="1">

        <tr>
            <th>Código</th>
            <th>Local</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>

        <%
            for(Emergencia e : emergencias){
        %>

        <tr>
            <td><%= e.getCodigo() %></td>
            <td><%= e.getLocal() %></td>
            <td><%= e.getTipo() %></td>
            <td><%= e.getDescricao() %></td>
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