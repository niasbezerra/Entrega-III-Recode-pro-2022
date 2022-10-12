package br.com.maldivastravel.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "88147320";
	private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/maldivastravel";
	
	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection con = createConnectionToMySQL();
		
		if(con!=null) {
			System.out.println("Conexão bem sucedida vc arrazou");
			con.close();
			
		}
	}
	
}