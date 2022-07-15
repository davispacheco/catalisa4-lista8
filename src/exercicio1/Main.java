package src.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Estabelecimento estabelecimento = new Estabelecimento();
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("Escolha sua opção.");
            System.out.println("1: Cadastrar um produto");
            System.out.println("2: Listar os produtos cadastrados");
            System.out.println("3: Remover um produto pelo nome");
            System.out.println("4: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Nome do produto:");
                    String nomeProduto = input.next();
                    System.out.println("Preço:");
                    Double precoProduto = input.nextDouble();
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    estabelecimento.adicionarProduto(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case "2":
                    estabelecimento.listarProdutos();
                    break;
                case "3":
                    System.out.println("Informe o nome do produto que deseja remover:");
                    nomeProduto = input.next();
                    if (estabelecimento.removerProduto(nomeProduto)) {
                        System.out.println("Produto " + nomeProduto + " removido com êxito!");
                    } else {
                        System.out.println("Nenhum produto encontrado com este nome.");
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