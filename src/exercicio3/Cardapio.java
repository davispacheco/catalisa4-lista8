package src.exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Cardapio {
    private Set<Prato> pratos = new HashSet<>();

    public Cardapio() {
        this.pratos = pratos;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void listarPratos() {
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato cadastrado.");
        } else {
            System.out.println("Pratos cadastrados: " + pratos.size());
            for (Prato prato : pratos) {
                System.out.println("Nome do prato: " + prato.getNome());
                System.out.println("Ingredientes: " + prato.getIngredientes());
            }
        }
    }
    public boolean removerPrato(String nome) {
        return pratos.removeIf(prato -> prato.getNome().equalsIgnoreCase(nome));
    }
    public Set<Prato> getCandidatos() {
        return pratos;
    }

    public void setCandidatos(Set<Prato> pratoes) {
        this.pratos = pratos;
    }
}
