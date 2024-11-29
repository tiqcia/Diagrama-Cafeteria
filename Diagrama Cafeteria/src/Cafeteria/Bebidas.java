package Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Bebidas {
    private List<String> bebidas;

    public Bebidas() {
        bebidas = new ArrayList<>();
        inicializarBebidas();
    }

    private void inicializarBebidas() {
        bebidas.add("Café Expresso - R$ 5.00");
        bebidas.add("Cappuccino - R$ 7.50");
        bebidas.add("Chá Gelado - R$ 4.50");
        bebidas.add("Chá Quente - R$ 4.50");
        bebidas.add("Latte Machiato - R$ 4.50");
        bebidas.add("Affogato - R$ 4.50");
        bebidas.add("Mocha - R$ 4.50");

    }

    public void exibirBebidas() {
        System.out.println("\n----- Bebidas -----");
        for (String bebida : bebidas) {
            System.out.println(bebida);
        }
    }

    public double buscarPreco(String nomeBebida) {
        for (String bebida : bebidas) {
            if (bebida.startsWith(nomeBebida)) {
                return Double.parseDouble(bebida.split("- R\\$ ")[1]);
            }
        }
        return 0;
    }
}
