<%@page import="com.Breno.campsolidarium.model.Ong"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ONGs</title>
</head>
<body>

    <h1>Lista de ONGs</h1>

    <%
        List<Ong> ongs =
                (List<Ong>) session.getAttribute("ongs");
    %>

    <table border="1">

        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>Login</th>
        </tr>

        <%
            for(Ong o : ongs){
        %>

        <tr>
            <td><%= o.getCodigo() %></td>
            <td><%= o.getNome() %></td>
            <td><%= o.getLogin() %></td>
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