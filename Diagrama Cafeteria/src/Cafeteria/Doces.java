package Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Doces {
    private List<String> doces;

    public Doces() {
        doces = new ArrayList<>();
        inicializarDoces();
    }

    private void inicializarDoces() {
        doces.add("Bolo de Cenoura - R$ 6.00");
        doces.add("Brigadeiro - R$ 2.50");
        doces.add("Torta de Limão - R$ 8.00");
        doces.add("Torta de Morango - R$ 8.00");
        doces.add("Donut - R$ 8.00");
        doces.add("Carolina - R$ 2.50");
        doces.add("Cinnamon Roll - R$ 8.00");
        doces.add("Sonho - R$ 5.00");
        doces.add("Waffle - R$ 6.00");
        doces.add("Panqueca - R$ 6.00");

    }

    public void exibirDoces() {
        System.out.println("\n----- Doces -----");
        for (String doce : doces) {
            System.out.println(doce);
        }
    }

    public double buscarPreco(String nomeDoce) {
        for (String doce : doces) {
            if (doce.startsWith(nomeDoce)) {
                return Double.parseDouble(doce.split("- R\\$ ")[1]);
            }
        }
        return 0;
    }
}
