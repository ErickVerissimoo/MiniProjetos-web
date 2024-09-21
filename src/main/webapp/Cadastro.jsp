
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    <link rel="stylesheet" type="text/css" href="estilos.css"/>
    </head>
    <body>
        <div class="background">
        <div class="container">
            <form method="POST" action="Gerenciador">
                <h1 class="titulo"> Welcome!</h1>
                <label for="Nome" class="nome" ><strong>Nome:</strong></label> <input type="text" class="nome" name="nome" required ><br>
                <label for="email" class="label1"><strong>Email:</strong></label> <input type="email" name="Email" class="Email" required><br>
                <label for="password" class="label2"><strong>Senha:</strong></label> <input type="password" class="password" name="Password" required ><br>
                <button type="submit" class="entrar"  >Entrar</button><br>
                <div class="link"> <a href="index.jsp" class="link">Já é cadastrado? Clique aqui</a></div>
            </form>
        </div>
        </div>
    </body>
</html>
