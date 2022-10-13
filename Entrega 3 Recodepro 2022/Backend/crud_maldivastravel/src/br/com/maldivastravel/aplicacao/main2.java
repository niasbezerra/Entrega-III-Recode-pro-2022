package br.com.maldivastravel.aplicacao;


import br.com.maldivastravel.dao.destinos_disponiveisDAO;

import br.com.maldivastravel.model.destinos_disponiveis;

public class main2 {

	public static void main(String[]args){
		
		destinos_disponiveisDAO destinos_disponiveisDAO = new destinos_disponiveisDAO();		
		destinos_disponiveis destinos_disponiveis = new destinos_disponiveis();
		

		destinos_disponiveis.setDestino("Rio de Janeiro");
		destinos_disponiveis.setValor("2.500,00");
		
		
		destinos_disponiveisDAO.save(destinos_disponiveis);

	}

}
