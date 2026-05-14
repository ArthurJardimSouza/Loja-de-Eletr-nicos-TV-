package br.com.tv.view;

import java.util.Scanner;
import br.com.tv.model.TV;

public class Atendente {

    // Cores ANSI
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE_BOLD = "\u001B[1;37m";

    static Scanner input = new Scanner(System.in);

    public Atendente() {
    }

    public int MenuPrincipal() {
        System.out.println("\n" + BLUE + "╔══════════════════════════════════════╗" + RESET);
        System.out.println(BLUE + "║" + WHITE_BOLD + "                             StoreTV                " + BLUE + "                ║" + RESET);
        System.out.println(BLUE + "╠══════════════════════════════════════╣" + RESET);
        System.out.println(BLUE + "║" + CYAN + "  1 → Cadastrar Produto               " + BLUE + "║");
        System.out.println("║" + CYAN + "  2 → Listar Todos                    " + BLUE + "      ║");
        System.out.println("║" + CYAN + "  3 → Remover Produto                " + BLUE + "║");
        System.out.println("║" + CYAN + "  4 → Buscar Produto                  " + BLUE + "  ║");
        System.out.println("║" + CYAN + "  5 → Sair                            " + BLUE + "             ║");
        System.out.println("╚══════════════════════════════════════╝" + RESET);
        System.out.print(WHITE_BOLD + "Escolha a operação desejada: " + RESET);
        return input.nextInt();
    }

    public String Marca() {
        System.out.print("\n" + CYAN + "  Informe a marca do produto: " + RESET);
        input.nextLine();
        return input.nextLine();
    }

    public double Tamanho() {
        System.out.print(CYAN + "  Informe o tamanho da TV (pol): " + RESET);
        return input.nextDouble();
    }

    public String Resolucao() {
        System.out.print("\n" + CYAN + "  Informe a resolução da TV: " + RESET);
        input.nextLine();
        return input.nextLine();
    }

    public double Preco() {
        System.out.print(CYAN + "  Informe o preço do produto: " + RESET);
        return input.nextDouble();
    }

    public void vizualizar(TV tv) {
        System.out.println("\n" + GREEN + "╔══════════════════════════════════════╗" + RESET);
        System.out.println(GREEN + "║" + WHITE_BOLD + "           📺 Dados da TV             " + GREEN + "║");
        System.out.println(GREEN + "╠════════════════════════════════╣" + RESET);
        System.out.println(GREEN + "║ " + YELLOW + "Marca:      " + RESET + tv.getMarca());
        System.out.println(GREEN + "║ " + YELLOW + "Tamanho:    " + RESET + tv.getTamanho() + " polegadas");
        System.out.println(GREEN + "║ " + YELLOW + "Resolução:  " + RESET + tv.getResolucao());
        System.out.println(GREEN + "║ " + YELLOW + "Preço:      R$ " + RESET + tv.getPreco());
        System.out.println(GREEN + "╚══════════════════════════════════════╝" + RESET);
    }

    public String remover_tv() {
        System.out.print("\n" + RED + "  Informe a marca do produto que deseja remover: " + RESET);
        input.nextLine();
        return input.nextLine();
    }

    public String busca_tv() {
        System.out.print("\n" + BLUE + "  Informe a marca do produto que deseja buscar: " + RESET);
        input.nextLine();
        return input.nextLine();
    }

    public void vizualizarCasaRemovida(String marca) {
        System.out.println("\n" + GREEN + "✔ Produto da marca \"" + marca + "\" removido com sucesso!" + RESET);
    }

    public void mensagemNaoEncontrado() {
        System.out.println("\n" + YELLOW + "⚠ Nenhum produto encontrado com essa marca." + RESET);
    }

    public static void finalizarApp() {
        System.out.println("\n" + RED + "===============================");
        System.out.println("      Encerrando aplicativo…   ");
        System.out.println("===============================");
        System.out.println(GREEN + "     ✔ Aplicativo encerrado    ");
        System.out.println("===============================" + RESET);
    }
}
