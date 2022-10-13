package br.com.maldivastravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.maldivastravel.factory.ConnectionFactory;
import br.com.maldivastravel.model.cliente;
import br.com.maldivastravel.model.destinos_disponiveis;

public class destinos_disponiveisDAO {

	public void save(destinos_disponiveis destinos_disponiveis) {
		
		String sql = "INSERT INTO destinos_disponiveis(destino, valor) VALUES (?,?)";
	
		Connection con=null;
		PreparedStatement pstm = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			
			pstm.setString(1, destinos_disponiveis.getDestino());
			pstm.setString(2, destinos_disponiveis.getValor());
					
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
