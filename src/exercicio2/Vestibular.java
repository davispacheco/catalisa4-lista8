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
        for (Candidato candidato : candidatos) {
            System.out.println("Número da matrícula: " + candidato.getNumeroMatricula());
            System.out.println("Nota: " + candidato.getNota());
        }
    }
    public boolean removerCandidato(String matricula) {
        if (candidatos.removeIf(candidato -> candidato.getNumeroMatricula().equalsIgnoreCase(matricula))) {
            return true;
        } else {
            return false;
        }
    }
    public Set<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Set<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
