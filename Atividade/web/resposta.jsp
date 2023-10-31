<%-- 
    Document   : resposta
    Created on : 25/08/2023, 20:49:43
    Author     : note
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>
        <%
        //isso é conhecido como scriptlet. Ou seja,
        //a mistura de código Java com HTML...
        String resultado = (String) request.getAttribute("TOTAL").toString();
        	//recebendo o valor atravez do atributo criado na servlet denominado SOMA
        %>
        
        <h1>Resultado da Operação</h1>
        <strong><%=resultado%></strong><br/>
    </body>
</html>
