<%@page import="java.util.ArrayList"%>
<%@page import="dao.DaoListarLivro"%>
<%@page import="bean.BeanLivro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./Estilos/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu | Consulta de livros Disponíveis</title>
<link rel="icon" href="./Imagens/book.svg">
</head>
<body>
<img alt="aranha" title="Aqui estão os livros disponíveis e os alugados" src="./Imagens/aranhinha.svg" style="margin-left: 50rem;">
<div id="listaLivro"

	style=
	"margin-right: 3rem;
	 margin-top: 3rem;
	 position: relative;
     float: left;
     border-width: 2px;
     width: auto;
     height: auto;
     left: 730px;
	 ">

	<h1 style="margin-left: 4rem">Livros/Status</h1>
		<%
		ArrayList<BeanLivro> listaLivroDisp = new ArrayList<BeanLivro>();
		try{
			DaoListarLivro daoListarLivro = new DaoListarLivro();
			listaLivroDisp = daoListarLivro.getlistaLivro();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(BeanLivro l:listaLivroDisp){
	
	%>


	<table>
	<tr>
		<td style="width: 200px;"><h3><%=l.getNome()  %></h3></td>
		
		<br>
		
		<c:out value="---------------------------------------------------------"></c:out>
		<td><h3><%=l.getStatus()%></h3></td>

	</tr>
		<%} %>
	</table>
	
</div>
<img src="./Imagens/livro3.svg" title="Aqui estão os livros disponíveis e os alugados" alt="livro3" style="margin-top: 19rem; margin-right: 10rem">



</body>
</html>