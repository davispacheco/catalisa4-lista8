package src.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Cardapio cardapio = new Cardapio();
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("Escolha sua opção.");
            System.out.println("1: Cadastrar um prato");
            System.out.println("2: Listar pratos cadastrados");
            System.out.println("3: Remover um prato do cardápio");
            System.out.println("4: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Nome do prato:");
                    String nomePrato = input.next();
                    System.out.println("Ingredientes:");
                    String ingredientesPrato = input.next();
                    Prato prato = new Prato(nomePrato, ingredientesPrato);
                    cardapio.adicionarPrato(prato);
                    System.out.println("Prato cadastrado com sucesso!");
                    break;
                case "2":
                    cardapio.listarPratos();
                    break;
                case "3":
                    System.out.println("Informe o nome do prato que deseja remover do cardápio:");
                    nomePrato = input.next();
                    if (cardapio.removerPrato(nomePrato)) {
                        System.out.println("Prato com o nome " + nomePrato + " removido com êxito!");
                    } else {
                        System.out.println("Prato não encontrado com este nome.");
                    }
                    break;
                case "4":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
}
