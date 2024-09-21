<%-- 
    Document   : resposta
    Created on : 20 de ago. de 2024, 22:06:15
    Author     : Erick 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" type="text/css" href="resposta.css"/>
                      <link rel="shortcut icon" type="imagex/png" href="java.png">
  
    </head>
    <body>
        <div class="Container">
        <h1>Resposta:</h1>
        
            <span class="requisicao"> <%out.print(request.getParameter("input1"));%></span>
        </div>
    </body>
</html>
