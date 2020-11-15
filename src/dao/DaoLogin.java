package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnection;

public class DaoLogin {

	private Connection connection;
	
	public DaoLogin() {
		connection = SingleConnection.getConnection(); // faz a conexao com os dados do banco
	}
	
	
	public boolean validarLoginAdm(String login, String senha) throws Exception{ //faz a verificaçao do usuario no banco
		String sql = "select * from usuarios where login = '"+login+"' and senha = '"+senha+"'";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()){
			return true; //possui usuario
		}else{
			return false; //nao possui usuario
		}
	}
	
	
}
