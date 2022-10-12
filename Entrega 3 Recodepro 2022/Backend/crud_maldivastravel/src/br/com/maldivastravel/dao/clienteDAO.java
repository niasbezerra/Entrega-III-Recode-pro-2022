package br.com.maldivastravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.maldivastravel.factory.ConnectionFactory;
import br.com.maldivastravel.model.cliente;

public class clienteDAO {

	public void save(cliente cliente) {
		
		String sql = "INSERT INTO cliente(nome, email, senha, destino_interesse) VALUES (?,?,?,?)";
		
		Connection con=null;
		PreparedStatement pstm = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getEmail());
			pstm.setString(3, cliente.getSenha());
			pstm.setString(4, cliente.getDestino_interesse());
			
			pstm.execute();
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if (pstm!=null) {
					pstm.close();
				}
			
				if (con!=null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		
	
}
	}
