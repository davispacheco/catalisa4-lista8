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

    public void removerProduto(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtos.remove(produto);
            }
        }
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }
}
