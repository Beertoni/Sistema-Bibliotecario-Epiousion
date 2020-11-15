<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu | Fazer Empréstimo</title>
<link rel="icon" href="./Imagens/book.svg">
</head>
<body>
<img alt="aranha" title="Empreste um livro aqui" src="./Imagens/aranhinha.svg" style="margin-left: 50rem;">
    <div id="container-cad-livro">
        
        <form action="salvarEmprestimo" method="post" class="formcad"> 
            <h1>Realizar empréstimo</h1>
            <table>
                <tr>
                    <td>Login do usuário:</td>		
                    <td><input type="text" id="login" name="login"></td>	
                </tr>
                <tr>
                    <td>Empréstimo:</td>		
                    <td><input type="text" id="emprestimo" name="emprestimo"></td>	
                </tr>
                <tr>
                    <td>Nome do livro:</td>		
                    <td><input type="text" id="nomeLivro" name="nomeLivro"></td>	
                </tr>
                <tr>
                    <td>ID do livro:</td>		
                    <td><input type="text" id="idLivro" name="idLivro"></td>	
                </tr>
                <tr>
                    <td>Status do livro:</td>		
                    <td><input type="text" id="status" name="status"></td>	
                </tr>
    
            </table>
            <input type="submit" value="Salvar" style="width: 6rem;">
        </form>
        <img src="./Imagens/livro3.svg" alt="livro3" style="transform: rotateY(180deg); margin-left: 17rem;">
    </div>
			
		
	

</body>
</html>