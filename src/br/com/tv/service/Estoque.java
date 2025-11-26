package br.com.tv.service;

import br.com.tv.model.TV;
import br.com.tv.view.Atendente;
import java.util.ArrayList;

public class Estoque {

	

		private ArrayList<TV> listaTV = new ArrayList<>();
		Atendente view = new Atendente();

		public void gerenciarCompra(int opcao) {

			switch (opcao) {
			case 1: // CADASTRAR --------------------------
				String marca = view.Marca();
				double tamanho = view.Tamanho();
				String resolucao = view.Resolucao();
				double preco = view.Preco();

				TV novaTv = new TV(marca, tamanho, resolucao, preco);
				listaTV.add(novaTv);

				System.out.println("\n✔ Produto cadastrado com sucesso!\n");
				break;

			case 2: // LISTAR -----------------------------
				if (listaTV.isEmpty()) {
					System.out.println("\n⚠ Nenhum produto cadastrado.\n");
				} else {
					System.out.println("\n===== PRODUTOS CADASTRADOS =====\n");
					for (TV tv : listaTV) {// em caso de erro colocar novaTv no lugar de tv
						view.vizualizar(tv);
					}
				}
				break;

			case 3: // REMOVER ----------------------------
				String remover = view.remover_tv();
				boolean removido = false;

				for (int i = 0; i < listaTV.size(); i++) {
					if (listaTV.get(i).getMarca().equalsIgnoreCase(remover)) {
						listaTV.remove(i);
						view.vizualizarCasaRemovida(remover);
						removido = true;
						break;
					}
				}

				if (!removido) {
					view.mensagemNaoEncontrado();
				}
				break;

			case 4: // BUSCAR -----------------------------
				String buscar = view.busca_tv();
				boolean achou = false;

				for (TV tv : listaTV) {
					if (tv.getMarca().equalsIgnoreCase(buscar)) {
						view.vizualizar(tv);
						achou = true;
						break;
					  }
                }

                if (!achou) {
                    view.mensagemNaoEncontrado();
                }
                break;

            case 5:
                System.out.println("\nEncerrando o sistema...\n");
                break;

            default:
                System.out.println("\n⚠ Opção inválida.\n");
						
					}
				}
			


	
}

