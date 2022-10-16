package br.com.maldivastravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
			
			}
		
	}
}
		
	public void update (destinos_disponiveis destinos_disponiveis) {
	
	String sql = "UPDATE destinos_disponiveis SET destino = ?, valor = ?," + "WHERE id_destino = ?";
	
	Connection con = null;
	PreparedStatement pstm = null;
	
	try  {
		con = ConnectionFactory.createConnectionToMySQL();
		
		pstm = con.prepareStatement(sql);
		
		pstm.setString(1, destinos_disponiveis.getDestino());
		pstm.setString(2, destinos_disponiveis.getValor());
		
		
		pstm.setInt(3, destinos_disponiveis.getId_destino());
		pstm.execute();			
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(pstm!=null) {
				pstm.close();
			}
			if(con!=null) {
				con.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
	}
	
	}
}


public void deleteById_destino(int id_destino) {
	
	String sql = "DELETE FROM destinos_disponiveis WHERE id_destino = ?";
	
	Connection con = null;
	
	PreparedStatement pstm = null;
	
	try {
		con = ConnectionFactory.createConnectionToMySQL();
		
		pstm = con.prepareStatement(sql);
		
		pstm.setInt(1, id_destino);
		
		pstm.execute();
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (con != null) {
				con.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}



public List<destinos_disponiveis> getDestinos_disponiveis(){
	
	String sql = "SELECT * FROM destinos_diponiveis";
	List <destinos_disponiveis> destinos_disponiveis = new ArrayList<destinos_disponiveis>();
	
	Connection con = null;
	PreparedStatement pstm = null;
	
	ResultSet rset = null;
	
	try {
		con = ConnectionFactory.createConnectionToMySQL();
		
		pstm = (PreparedStatement) con.prepareStatement(sql);
		
		rset = pstm.executeQuery();
		
		while (rset.next()) {
			destinos_disponiveis destino1 = new destinos_disponiveis();
			
			destino1.setId_destino(rset.getInt("id_destino"));
			destino1.setDestino(rset.getString("destino"));
			destino1.setValor(rset.getString("valor"));
			
			
			destinos_disponiveis.add(destino1);				
		}
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		 {
			try {
			if (rset!=null) {
				rset.close();
			}
			if(pstm!=null) {
				pstm.close();
			}
			
			if(con!=null) {
			con.close();
			}
			
			}catch(final Exception e) {
			  e.printStackTrace();
		  }

		 
		return destinos_disponiveis;	
		 }}}
		 
		