package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.BeanLivro;
import connection.SingleConnection;

public class DaoListarLivro {

	private Connection connection;
	
	public DaoListarLivro() {
		connection = SingleConnection.getConnection();
	}
	
	public ArrayList<BeanLivro> getlistaLivro()throws Exception{
		
		ArrayList<BeanLivro> listaLivro = new ArrayList<>();
		String sql = "SELECT * FROM livros";
		SingleConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			BeanLivro beanLivro = new BeanLivro();
			beanLivro.setNome(resultSet.getString("nome"));
			beanLivro.setStatus(resultSet.getString("status"));
			
			listaLivro.add(beanLivro);
		}
		return listaLivro;
	}
	
//	public ArrayList<BeanLivro> getlistaLivroDisp()throws Exception{
//		
//		ArrayList<BeanLivro> listaLivro = new ArrayList<>();
//		String sql = "SELECT * FROM livros";
//		SingleConnection.getConnection();
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery(sql);
//		while(resultSet.next()){		
//				BeanLivro beanLivro = new BeanLivro();				
//					beanLivro.setNome(resultSet.getString("nome"));
//					beanLivro.setStatus(resultSet.getString("status"));
//					listaLivro.add(beanLivro);
//
//			
//		}
//		return listaLivro;
//	}
	
	
	
	
}
