package br.com.maldivastravel.aplicacao;

import br.com.maldivastravel.dao.clienteDAO;
import br.com.maldivastravel.model.cliente;

public class main {

	public static void main(String[] args) {
		
		clienteDAO clienteDAO = new clienteDAO();		
		cliente cliente = new cliente();
		

		cliente.setNome("Beyonce Knowless");
		cliente.setEmail("beyonce@gmail.com");
		cliente.setSenha("32569874"); 
		cliente.setDestino_interesse("recife");
		
		clienteDAO.save(cliente);

	}

}
