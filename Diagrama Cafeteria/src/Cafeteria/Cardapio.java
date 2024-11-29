package Cafeteria;

public class Cardapio {
    private Doces doces;
    private Salgados salgados;
    private Bebidas bebidas;

    public Cardapio() {
        doces = new Doces();
        salgados = new Salgados();
        bebidas = new Bebidas();
    }

    public void exibirCardapio() {
        System.out.println("\n===== Cardápio =====\n");
        doces.exibirDoces();
        salgados.exibirSalgados();
        bebidas.exibirBebidas();
    }

    public double buscarPreco(String nomeItem) {
        double preco = doces.buscarPreco(nomeItem);
        if (preco == 0) {
            preco = salgados.buscarPreco(nomeItem);
        }
        if (preco == 0) {
            preco = bebidas.buscarPreco(nomeItem);
        }
        return preco;
    }
}
