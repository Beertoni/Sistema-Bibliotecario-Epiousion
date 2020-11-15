package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.BeanLivro;
import bean.BeanUsuario;
import connection.SingleConnection;

public class DaoEmprestimo {
	


	private Connection connection;
	
	public DaoEmprestimo() {
		connection = SingleConnection.getConnection();
	}
	
	public void atualizarUser(BeanUsuario usuario){
		
		try{
		
		String sql = "UPDATE usuarios SET emprestimo = ?";
		sql += " WHERE login = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, usuario.getEmprestimo());
		statement.setString(2, usuario.getLogin());
		statement.executeUpdate();
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
	
	public void atualizarLivro(BeanLivro beanLivro){
		
		try{
		
		String sql = "UPDATE livros SET status = ?";
		sql += " WHERE nome = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, beanLivro.getStatus());
		statement.setString(2, beanLivro.getNome());
		statement.executeUpdate();
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
	
	public void trazerEmprestimo(BeanUsuario beanUsuario){
		
		try{
		String sql = "SELECT emprestimo FROM usuarios";
		sql+= "WHERE login = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, beanUsuario.getLogin());
		statement.setString(2, beanUsuario.getSenha());
		statement.execute();
		connection.commit();
		
		}catch(Exception e){
			try{
			connection.rollback();
			}catch(SQLException e1){
				e1.printStackTrace();
			}
			
		}
		
	}
	
//	public List<BeanUsuario> listar()throws Exception{
//		List<BeanUsuario> listar = new ArrayList<BeanUsuario>();
//		
//		String sql = "SELECT emprestimo FROM usuarios WHERE login = ?";
//		
//		PreparedStatement statement = connection.prepareStatement(sql);
//		ResultSet resultSet = statement.executeQuery();
//		BeanUsuario beanUsuario = new BeanUsuario();
//		beanUsuario.setLogin(resultSet.getString("login"));
//		beanUsuario.setSenha(resultSet.getString("senha"));
//		listar.add(beanUsuario);
//		
//		return listar;
//	}
	
	
	
	
	
	
	
}
