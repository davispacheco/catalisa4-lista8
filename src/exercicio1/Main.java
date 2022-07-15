package src.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Estabelecimento estabelecimento = new Estabelecimento();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
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
                    if (estabelecimento.getProdutos().isEmpty()) {
                        System.out.println("Nome do produto:");
                        produto1.setNome(input.next());
                        System.out.println("Preço:");
                        produto1.setPreco(input.nextDouble());
                        estabelecimento.adicionarProduto(produto1);
                        System.out.println("Produto 1 adicionado com sucesso!");
                    } else {
                        switch (estabelecimento.getProdutos().size()) {
                            case 1:
                                System.out.println("Nome do produto: ");
                                produto2.setNome(input.next());
                                System.out.println("Preço:");
                                produto2.setPreco(input.nextDouble());
                                estabelecimento.adicionarProduto(produto2);
                                System.out.println("Produto 2 adicionado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Nome do produto:");
                                produto3.setNome(input.next());
                                System.out.println("Preço:");
                                produto3.setPreco(input.nextDouble());
                                estabelecimento.adicionarProduto(produto3);
                                System.out.println("Produto 3 adicionado com sucesso!");
                                break;
                            default:
                                System.out.println("Não pode adicionar mais produtos à lista.");
                        }
                    }
                    break;
                case "2":
                    estabelecimento.listarProdutos();
                    break;
                case "3":
                    System.out.println("Informe o nome do produto que deseja remover:");
                    String nomeProduto = input.next();
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