package br.com.maldivastravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.maldivastravel.factory.ConnectionFactory;
import br.com.maldivastravel.model.cliente;

public class clienteDAO {

	public void save(cliente cliente) {
		
		String sql = "INSERT INTO cliente(id_cliente,nome, email, senha, destino_interesse) VALUES (?,?,?,?,?)";
	
		Connection con=null;
		PreparedStatement pstm = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			
			pstm.setInt(1, cliente.getId_cliente());
			pstm.setString(2, cliente.getNome());
			pstm.setString(3, cliente.getEmail());
			pstm.setString(4, cliente.getSenha());
			pstm.setString(5, cliente.getDestino_interesse());
			
			pstm.execute();
		
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		
		finally {
			
			try {
				if (pstm!=null) {
					pstm.close();
				}
			
				if (con!=null) {
					con.close();
				}}
				catch (Exception e) {
				e.printStackTrace();}
			
			}
			}
	
	public void update (cliente cliente) {
		
		String sql = "UPDATE cliente SET nome = ?, email = ?, senha = ?, destino_interesse = ?" + 
		"WHERE id_cliente = ?";
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		try  {
			con = ConnectionFactory.createConnectionToMySQL();
			
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getEmail());
			pstm.setString(3, cliente.getSenha());
			pstm.setString(4, cliente.getDestino_interesse());
			
			pstm.setInt(5, cliente.getId());
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

	
	public void deleteByID(int id_cliente) {
		
		String sql = "DELETE FROM cliente WHERE id_cliente = ?";
		
		Connection con = null;
		
		PreparedStatement pstm = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, id_cliente);
			
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
		
	
	
	
	public List<cliente> getCliente(){
		
		String sql = "SELECT * FROM cliente";
		List <cliente> cliente = new ArrayList<cliente>();
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				cliente cliente1 = new cliente();
				
				cliente1.setId_cliente(rset.getInt("id_cliente"));
				cliente1.setNome(rset.getString("nome"));
				cliente1.setEmail(rset.getString("email"));
				cliente1.setSenha(rset.getString("senha"));
				cliente1.setDestino_interesse(rset.getString("destino_interesse"));
				
				cliente1.add(cliente1);				
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
 
			 
			return cliente;	
	

}}}
