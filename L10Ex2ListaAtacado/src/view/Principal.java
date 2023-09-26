package view;

import controller.OperacaoController;
import model.Cliente;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		OperacaoController o = new OperacaoController();
		Fila<Cliente> fila = new Fila<>();
		for (int i = 1;i<=20;i++) {
			String nome = "Cliente" + i;
			int qtd = (int)((Math.random()*31)+20);
			float valor = (float)((Math.random()*95)+5);
			Cliente cliente = new Cliente(nome, qtd, valor);
			fila.insert(cliente);
		}
		o.caixa(fila);
	}

}
