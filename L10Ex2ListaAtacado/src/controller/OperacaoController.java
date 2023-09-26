package controller;

import model.Cliente;
import model.Fila;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila<Cliente> fila) {
		for (int i =0;i<20;i++) {
			try {
				Cliente cliente = fila.remove();
				float total = cliente.valorPecas * cliente.qtdPecas;
				System.out.printf(cliente.nome+" => Valor total = R$%.2f%n",total);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
