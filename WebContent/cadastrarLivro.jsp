<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu | Cadastro de livro</title>
<link rel="icon" href="./Imagens/book.svg">
</head>
<body>
    <img alt="aranha" title="Já falei para tirar o mouse de cima de mim!!" src="./Imagens/aranhinha.svg" style="margin-left:70rem;">
    <div id="container-cad">
        
		<form action="salvarLivro" method="post" class="formcad"> 
            <h1>Cadastro de Livros</h1>
		<table style="margin-top: 3rem">
			<tr>
				<td>Título:</td>		
				<td><input type="text" id="nome" name="nome"></td>	
			</tr>
			<tr>
				<td>Autor:</td>		
				<td><input type="text" id="autor" name="autor"></td>	
			</tr>
			<tr>
				<td>ID:</td>		
				<td><input type="text" id="id" name="id"></td>	
			</tr>
			<tr>
				<td>Status:</td>		
				<td><input type="text" id="status" name="status"></td>	
			</tr>
		</table>
		<input type="submit" value="Salvar" style="width: 6rem;">
	</form>
    <img src="./Imagens/livro3.svg" title="Cadastre um livro para a biblioteca" alt="livro3" class="fadeimg2 imgreverse">
    </div>


</body>
</html>