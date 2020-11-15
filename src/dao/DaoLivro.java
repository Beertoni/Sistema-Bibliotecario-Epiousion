package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.BeanLivro;
import connection.SingleConnection;

public class DaoLivro {

	private Connection connection;
	
	public DaoLivro() {
		connection = SingleConnection.getConnection();
		
	}
	
	public void salvarLivro(BeanLivro livro){
		
		
		try{
		String sql = "insert into livros(nome, autor, id, status) values (?, ?, ?, ?)";
		PreparedStatement insert = connection.prepareStatement(sql);
		insert.setString(1, livro.getNome());
		insert.setString(2, livro.getAutor());
		insert.setString(3, livro.getId());
		insert.setString(4, livro.getStatus());
		insert.execute();
		
		connection.commit();
		}catch(Exception e){
			e.printStackTrace();
			try{
				connection.rollback();
			}catch(SQLException e1){
				e1.printStackTrace();
			}
		}
	}
	
}
