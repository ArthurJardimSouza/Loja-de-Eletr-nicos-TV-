package br.com.tv;


import br.com.tv.service.Estoque;
import br.com.tv.view.Atendente;

public class TV_main {
	public static void main(String[] args) {

		Atendente view = new Atendente();
		Estoque estoque = new Estoque();

		int opcaoMenuEscolhida = 1;

		do {
			opcaoMenuEscolhida = view.MenuPrincipal();

			estoque.gerenciarCompra(opcaoMenuEscolhida);
		} while (opcaoMenuEscolhida != 5);

		Atendente.finalizarApp();
		;
	}

}
