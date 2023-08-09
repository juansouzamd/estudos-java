package task.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 85d, 58);
        cadastroProdutos.adicionarProduto(2L, "Produto 6", 5d, 56);
        cadastroProdutos.adicionarProduto(5L, "Produto 1", 20d, 7);
        cadastroProdutos.adicionarProduto(9L, "Produto 5", 19d, 31);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}
