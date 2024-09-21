
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    <link rel="stylesheet" type="text/css" href="estilos.css"/>
    </head>
    <body>
        <div class="background">
        <div class="container">
            <form method="POST" action="Gerenciador">
                <h1 class="titulo"> Welcome back!</h1>
                <label for="email" class="label1"><strong>Email:</strong></label> <input type="email" name="email" class="email" required><br>
                <label for="password" class="label2"><strong>Senha:</strong></label> <input type="password" class="password" name="password" required ><br>
                <button type="submit" class="entrar">Entrar</button><br>
                <div class="link"> <a href="Cadastro.jsp" class="link">Ainda não é cadastrado? Clique aqui</a></div>
            </form>
        </div>
        </div>
    </body>
</html>
