package br.com.maldivastravel.aplicacao;

import br.com.maldivastravel.dao.clienteDAO;
import br.com.maldivastravel.model.cliente;

public class main {

	public static void main(String[] args) {
		
		clienteDAO clienteDAO = new clienteDAO();		
		cliente cliente = new cliente();
		

		cliente.setNome("Madonna Delafuente");
		cliente.setEmail("bDelafuentee@gmail.com");
		cliente.setSenha("9632145"); 
		cliente.setDestino_interesse("sao paulo");
		
		clienteDAO.save(cliente);

	}

}
