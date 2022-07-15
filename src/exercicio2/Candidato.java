package src.exercicio2;

public class Candidato {
    private String numeroMatricula;
    private double nota;

    public Candidato(String numeroMatricula, double nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
