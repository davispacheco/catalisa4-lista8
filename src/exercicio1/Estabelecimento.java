package src.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Estabelecimento {
    private Set<Produto> produtos = new HashSet<>();

    public Estabelecimento() {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto p1) {
        this.produtos.add(p1);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Produtos cadastrados: " + produtos.size());
            for (Produto produto : produtos) {
                System.out.println("Nome do produto: " + produto.getNome());
                System.out.println("Preço do produto: " + produto.getPreco());
            }
        }
    }

    public boolean removerProduto(String nomeProduto) {
        return produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nomeProduto));
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }
}
