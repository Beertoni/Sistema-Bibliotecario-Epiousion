<%@page import="bean.BeanUsuario"%>
<%@page import="dao.DaoListarLivro"%>
<%@page import="bean.BeanLivro"%>
<%@page import="dao.DaoListarUsuario"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu | Verificar Empréstimos</title>
<link rel="icon" href="./Imagens/book.svg">
</head>
<body>

    <img alt="aranha" title="Esses são todos os usuários e livros" src="./Imagens/aranhinha.svg" >
<div id="listaUsuario">

	<h1>Usuarios/Emprestimos</h1>
		<%
		ArrayList<BeanUsuario> lista = new ArrayList<BeanUsuario>();
		try{
			DaoListarUsuario daoListarUsuario = new DaoListarUsuario();
			lista = daoListarUsuario.getlista();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(BeanUsuario b:lista){
			
	
	%>


	<table>
	<tr>
		<td style="width: 170px;"><h3><%=b.getLogin()%></h3></td>
		
		
		<c:out value="---------------------------------------------------------"></c:out>
		<td><h3><%=b.getEmprestimo()%></h3></td>

	</tr>
		<%} %>
	</table>
</div>



<div id="listaLivro">

	<h1>Livros/Status</h1>
		<%
		ArrayList<BeanLivro> listaLivro = new ArrayList<BeanLivro>();
		try{
			DaoListarLivro daoListarLivro = new DaoListarLivro();
			listaLivro = daoListarLivro.getlistaLivro();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(BeanLivro l:listaLivro){
			
	
	%>


	<table>
	<tr>
		<td style="width: 170px;"><h3><%=l.getNome()%></h3></td>
		
		
		<c:out value="---------------------------------------------------------"></c:out>
		<td><h3><%=l.getStatus()%></h3></td>

	</tr>
		<%} %>
	</table>
</div>



</body>
</html>