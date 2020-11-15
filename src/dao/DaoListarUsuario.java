package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.BeanUsuario;
import connection.SingleConnection;

public class DaoListarUsuario extends SingleConnection{
	private Connection connection;

	public DaoListarUsuario()throws Exception {
		connection = SingleConnection.getConnection();
	}
	
	public ArrayList<BeanUsuario> getlista()throws Exception{
		
		ArrayList<BeanUsuario> lista = new ArrayList<>();
		String sql = "SELECT * FROM usuarios";
		SingleConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			BeanUsuario beanUsuario = new BeanUsuario();
			beanUsuario.setLogin(resultSet.getString("login"));
			beanUsuario.setEmprestimo(resultSet.getString("emprestimo"));
			
			lista.add(beanUsuario);
		}
		return lista;
		
		
	}
	

	
	public ArrayList<BeanUsuario> getUsuario(String usuario) throws Exception{
		
		ArrayList<BeanUsuario> listaUser = new ArrayList<>();
		String sql = "SELECT * FROM usuarios ";
		sql+= "WHERE login = ?";
		SingleConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, usuario);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			BeanUsuario beanUsuario = new BeanUsuario();
			beanUsuario.setLogin(resultSet.getString("login"));
			beanUsuario.setEmprestimo(resultSet.getString("emprestimo"));
			listaUser.add(beanUsuario);
		}
		return listaUser;
	}
	
}
