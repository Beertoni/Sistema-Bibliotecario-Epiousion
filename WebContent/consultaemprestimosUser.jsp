<%@page import="dao.DaoListarUsuario"%>
<%@page import="bean.BeanUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu | Verificar meus empréstimos</title>
<link rel="icon" href="./Imagens/book.svg">
</head>
<body>

<div id="listaLivro">
<h1>Usuarios/Emprestimos</h1>
		<%
		String usuario = (String)request.getSession().getAttribute("login");
		ArrayList<BeanUsuario> lista = new ArrayList<BeanUsuario>();
		try{
			DaoListarUsuario daoListarUsuario = new DaoListarUsuario();
			lista = daoListarUsuario.getUsuario(usuario);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(BeanUsuario b:lista){
			
	
	%>


	<table>
	<tr>
		<td style="width: 170px;"><h3><%=b.getLogin()%></h3></td>
		
		<br>
		
		<c:out value="---------------------------------------------------------"></c:out>
		
		<td><h3><%=b.getEmprestimo()%></h3></td>

	</tr>
		<%} %>
	</table>
</div>
<img src="./Imagens/livro3.svg" title="Esses aqui são os seus empréstimos" alt="livro3" style="margin-top: 7rem">


	
<!-- <h1 style="margin: auto auto auto 30rem">Por favor confirme seus dados para prosseguir com a consulta:</h1>
	
	<form action="trazEmprestimoUnico" style="margin: 5rem auto auto 50rem" method="post">
	
	<table>
		<tr>
			<td>Login:</td>
			<td><input type="text" id="login" name="login"></td>
		
		</tr>
		
		<tr>
			<td>Senha:</td>
			<td><input type="password" id="senha" name="senha"></td>
		
		</tr>
		
	</table>
	<input type="submit" value="Confirmar Dados" style="margin-left: 70px">
	</form> -->	



</body>
</html>