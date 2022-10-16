package br.com.maldivastravel.aplicacao;

import br.com.maldivastravel.dao.clienteDAO;
import br.com.maldivastravel.model.cliente;

public class main {

	public static void main(String[] args) {

		clienteDAO clienteDAO = new clienteDAO();		
		cliente cliente = new cliente();
		
	
		cliente.setNome("maria de lordes bezerra da silva");
		cliente.setEmail("katy@gmail.com");
		cliente.setSenha("36985214"); 
		cliente.setDestino_interesse("piaui");
		
		//clienteDAO.save(cliente);
		
		cliente cli = new cliente();
		cli.setId_cliente(8);
		cli.setNome("raines");
		cli.setEmail("raines@hotmail.com");
		cli.setSenha("888844444");
		cli.setDestino_interesse("maldivas");
				
		//clienteDAO.update(cli);	
			
		clienteDAO.deleteByID(1);
		
		for(cliente c : clienteDAO.getcliente()) {
			System.out.println("Cliente salvo");
			
		}
		
	}

}
