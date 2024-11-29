package Cafeteria;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verCardapio(Cardapio cardapio) {
        System.out.println("\nAqui está o cardápio:\n");
        cardapio.exibirCardapio();
    }
}
