package model;

public class Cliente {
	
	public String nome;
	public int qtdPecas;
	public float valorPecas;

	public Cliente() {
		
	}
	
	public Cliente(String nome, int qtdPecas, float valorPecas) {
		this.nome = nome;
		this.qtdPecas = qtdPecas;
		this.valorPecas = valorPecas;
	}

}
