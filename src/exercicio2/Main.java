package src.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Vestibular vestibular = new Vestibular();
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("Escolha sua opção.");
            System.out.println("1: Cadastrar candidato");
            System.out.println("2: Listar candidatos cadastrados");
            System.out.println("3: Remover um candidato da lista");
            System.out.println("4: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Número da matrícula:");
                    String matricula = input.next();
                    System.out.println("Nota:");
                    double nota = input.nextDouble();
                    Candidato candidato = new Candidato(matricula, nota);
                    vestibular.adicionarCandidato(candidato);
                    System.out.println("Candidato cadastrado com sucesso!");
                    break;
                case "2":
                    vestibular.listarCandidatos();
                    break;
                case "3":
                    System.out.println("Informe o número da matrícula do candidato que deseja remover:");
                    matricula = input.next();
                    if (vestibular.removerCandidato(matricula)) {
                        System.out.println("Candidato com a matrícula " + matricula + " removido com êxito!");
                    } else {
                        System.out.println("Candidato não encontrado com este número de matrícula.");
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
