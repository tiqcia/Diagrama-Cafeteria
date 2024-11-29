package Cafeteria;

public class Pedido {
    private Cliente cliente;
    private Pagamento pagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pagamento = new Pagamento();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        pagamento.adicionarProduto(nome, preco, quantidade);
    }
}
