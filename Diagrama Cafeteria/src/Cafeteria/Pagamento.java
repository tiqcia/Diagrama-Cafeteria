package Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private List<ProdutoPedido> produtos;

    public Pagamento() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtos.add(new ProdutoPedido(nome, preco, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ProdutoPedido produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("Resumo do Pedido:");
        for (ProdutoPedido produto : produtos) {
            System.out.println(produto.getQuantidade() + "x " + produto.getNome() + " - R$ " + produto.getPreco());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
