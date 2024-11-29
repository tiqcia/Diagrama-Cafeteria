package Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Salgados {
    private List<String> salgados;

    public Salgados() {
        salgados = new ArrayList<>();
        inicializarSalgados();
    }

    private void inicializarSalgados() {
        salgados.add("Coxinha - R$ 5.00");
        salgados.add("Empada - R$ 4.50");
        salgados.add("Quiche - R$ 8.00");
        salgados.add("Pão de Queijo - R$ 3.00");
        salgados.add("Croissant - R$ 8.00");
        salgados.add("Ovo Mexido - R$ 6.00");
        salgados.add("Omelete - R$ 6.00");
    }

    public void exibirSalgados() {
        System.out.println("\n----- Salgados -----");
        for (String salgado : salgados) {
            System.out.println(salgado);
        }
    }

    public double buscarPreco(String nomeSalgado) {
        for (String salgado : salgados) {
            if (salgado.startsWith(nomeSalgado)) {
                return Double.parseDouble(salgado.split("- R\\$ ")[1]);
            }
        }
        return 0;
    }
}