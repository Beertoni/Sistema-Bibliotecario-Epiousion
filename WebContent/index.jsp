<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Concert+One&display=swap" rel="stylesheet">    
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca On-Line | Login</title>
<link rel="icon" href="./Imagens/book.svg">
</head>
<body>

	<div id="cabecalho">
		<img alt="aranhazinha" title="Olá meu nome é aranha :3" src="./Imagens/aranhinha.svg" style="margin-top: 0;">
		<h1>Bem vindo a biblioteca, para prosseguir faça seu login ou peça para ser cadastrado</h1>
		
	</div>
	<br/>
	<br/>
	
		
            <form action="LoginServlet" method="post" style="margin: 10rem auto auto 52rem; background: linear-gradient(330deg, #1E90FF 40%, #0000FF 90%);" class="login100-form validate-form p-b-33 p-t-5 p-l-10">
                <div class="input-block">
                    Login:
                    <input type="text" name="login" >
                    <br>
                    <br>
                    Senha:
                    <input type="password" name="senha">
                    <br>
                    <br>
                    <input type="submit" value="Fazer Login" style="margin-left: 4rem; width: 6rem;" >
                </div>
				 
				
			</form>

				<img alt="livro1" class="fadeimg2" src="./Imagens/livro1.svg" title="Coloque suas informações para fazer login" style="width: 22rem;margin-left:15rem;">


			



	
	

</body>
</html>