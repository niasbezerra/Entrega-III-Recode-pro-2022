package br.com.maldivastravel.model;

public class cliente {
	private int id_cliente;
	private String nome;
	private String email;
	private String senha;
	private String destino_interesse;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDestino_interesse() {
		return destino_interesse;
	}
	public void setDestino_interesse(String destino_interesse) {
		this.destino_interesse = destino_interesse;
	}

	
	
}