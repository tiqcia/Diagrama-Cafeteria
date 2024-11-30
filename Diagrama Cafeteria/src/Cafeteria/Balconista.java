package Cafeteria;

public class Balconista {
    private String nome;
    private String id;

    public Balconista(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void recepcionar(Cliente cliente) {
        System.out.println("Bem-vindo à nossa cafeteria, " + cliente.getNome() + "! É um prazer atendê-lo(a).");
    }

    public void anotarPedido(Pedido pedido) {
        System.out.println("Anotando pedido do cliente " + pedido.getCliente().getNome());
        pedido.getPagamento().exibirResumo();
    }

    public void prepararPedido() {
        System.out.println("Pagamento realizado! O pedido será preparado.");
    }
}
