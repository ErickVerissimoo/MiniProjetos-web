<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Gerador de Senhas</title>
    <style>
        *{
            overflow: hidden;
        }
        body, html {
    margin: 0; 
    height: 100%; 
}
        output {
            display: block; /* Alterado para block para melhor controle de layout */
            margin-top: 20px; /* Adicionando margem superior */
            font-size: 25px;
            color: darkblue; /* Mudança na cor para melhor visibilidade */
        }
        button {
            width: 75px;
            transition: 0.3s ease;
            cursor: pointer;
            background-color: blue;
            border-color: transparent;
            border-radius: 5px;
            font-size: 20px;
            color: aliceblue;
            position: relative;
            left: 45px;
        }
        button:hover {
            transform: scale(1.15);
            opacity: 0.9; 
        }
     .container {
    display: flex;
    flex-direction: column; 
    border: none;
    padding: 10px; 
    width: 170px;
    height: 100px;
    border-radius: 10px;
    background: white;
    position: absolute;
    left: 600px;
    top: 250px;
    box-shadow: 1px 6px 10px rgba(0, 0, 0, 0.6); 
}
        .background {
            position: absolute;
    background-image: url("luca-bravo-ESkw2ayO2As-unsplash.jpg"); /* Caminho para sua imagem */
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center; 
    height: 100vh; 
    width: 100vw; 
}
output{
    position: relative;
    left: 35px;
}
    </style>
</head>
<body>
    <div class="background"></div>
    <form method="POST" action="Home" class="container">
        <button type="submit">Gerar</button>
        <output>${senha}</output>  
    </form>
</body>
</html>