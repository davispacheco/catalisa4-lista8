package src.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Vestibular {
    private Set<Candidato> candidatos = new HashSet<>();

    public Vestibular() {
        this.candidatos = candidatos;
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void listarCandidatos() {
        if (candidatos.isEmpty()) {
            System.out.println("Nenhum candidato cadastrado.");
        } else {
            System.out.println("Candidatos cadastrados: " + candidatos.size());
            for (Candidato candidato : candidatos) {
                System.out.println("Número da matrícula: " + candidato.getNumeroMatricula());
                System.out.println("Nota: " + candidato.getNota());
            }
        }
    }
    public boolean removerCandidato(String matricula) {
        return candidatos.removeIf(candidato -> candidato.getNumeroMatricula().equalsIgnoreCase(matricula));
    }
    public Set<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Set<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
