package src.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();
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
                    if (vestibular.getCandidatos().isEmpty()) {
                        System.out.println("Número da matrícula:");
                        candidato1.setNumeroMatricula(input.next());
                        System.out.println("Nota:");
                        candidato1.setNota(input.nextDouble());
                        vestibular.adicionarCandidato(candidato1);
                        System.out.println("Candidato 1 cadastrado com sucesso!");
                    } else {
                        switch (vestibular.getCandidatos().size()) {
                            case 1:
                                System.out.println("Número da matrícula:");
                                candidato2.setNumeroMatricula(input.next());
                                System.out.println("Nota:");
                                candidato2.setNota(input.nextDouble());
                                vestibular.adicionarCandidato(candidato2);
                                System.out.println("Candidato 2 cadastrado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Número da matrícula:");
                                candidato3.setNumeroMatricula(input.next());
                                System.out.println("Nota:");
                                candidato3.setNota(input.nextDouble());
                                vestibular.adicionarCandidato(candidato3);
                                System.out.println("Candidato 3 cadastrado com sucesso!");
                                break;
                            default:
                                System.out.println("Não pode adicionar mais candidatos à lista.");
                        }
                    }
                    break;
                case "2":
                    vestibular.listarCandidatos();
                    break;
                case "3":
                    System.out.println("Informe o número da matrícula do candidato que deseja remover:");
                    String matricula = input.next();
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
