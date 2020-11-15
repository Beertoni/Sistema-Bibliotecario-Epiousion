<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu | Cadastro de usuário</title>
</head>
<body>
    <img alt="aranha" title="Faça aqui o cadastro de um usuário" src="./Imagens/aranhinha.svg" style="margin-left:70rem;">
    <div id="container-cad">
        
        <form action="salvarUsuario" method="post" class="formcad"> 
            <h1>Cadastro de Usuários</h1>
            <table>
                <tr>
                    <td>Login:</td>		
                    <td><input type="text" id="login" name="login"></td>	
                </tr>
                <tr>
                    <td>Senha:</td>		
                    <td><input type="password" id="senha" name="senha"></td>	
                </tr>
                <tr>
                    <td>Permissao:</td>		
                    <td><input type="text" id="permissao" name="permissao"></td>	
                </tr>
                <tr>
                    <td>Emprestimo:</td>		
                    <td><input type="text" id="emprestimo" name="emprestimo"></td>	
                </tr>
            </table>
            <input type="submit" value="Salvar" style="width: 6rem;">
        </form>
        <img src="./Imagens/livro3.svg" title="Preencha as informações para fazer um cadastro" alt="livro3" class="fadeimg2 imgreverse">
    </div>

	

</body>
</html>