<%@page contentType="text/html" import="java.util.*, java.text.*, java.lang.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <link rel="shortcut icon" type="image/png" href="java.png"> 
        <script>
            function validateInput(event) { 
                var input1 = document.querySelector('.input1').value;
                var input2 = document.querySelector('.input2').value;
                if (input1 === '' || input2 === '') {
                    alert('Não pode haver campos vazios');
                    event.preventDefault(); 
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <div class="principal">
            <h1 class="titulo">Página criada com JSP</h1>
            <p class="frase" id="dataAtual"></p>
            <form action="home" onsubmit="return validateInput(event);" method="post"> 
                <span class="email">Nome</span>
                <input type="text" class="input1" name="input1" required> <br>
                <span class="senha">Senha</span>
                <input type="password" class="input2" name="input2" required><br>
                <input type="submit" class="entrar" value="Entrar">
            </form>
        </div>
    </body>
</html>