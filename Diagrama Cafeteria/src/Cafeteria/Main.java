package Cafeteria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        Cardapio cardapio = new Cardapio();
        Cliente cliente = new Cliente(nomeCliente); // Passando o nome inserido pelo cliente
        Balconista balconista = new Balconista("Carlos", "B123");
        Pedido pedido = new Pedido(cliente);

        balconista.recepcionar(cliente);

        cliente.verCardapio(cardapio);

        System.out.print("\nEscolha um doce (ou digite 'nenhum'): ");
        String doce = scanner.nextLine();
        if (!doce.equalsIgnoreCase("nenhum")) {
            pedido.adicionarProduto(doce, cardapio.buscarPreco(doce), 1);
        }

        System.out.print("Escolha um salgado (ou digite 'nenhum'): ");
        String salgado = scanner.nextLine();
        if (!salgado.equalsIgnoreCase("nenhum")) {
            pedido.adicionarProduto(salgado, cardapio.buscarPreco(salgado), 1);
        }

        System.out.print("Escolha uma bebida (ou digite 'nenhum'): ");
        String bebida = scanner.nextLine();
        if (!bebida.equalsIgnoreCase("nenhum")) {
            pedido.adicionarProduto(bebida, cardapio.buscarPreco(bebida), 1);
        }

        balconista.anotarPedido(pedido);

        System.out.print("\nEscolha a forma de pagamento (dinheiro/cartão/pix): ");
        String formaPagamento = scanner.nextLine();

        System.out.println("Forma de pagamento escolhida: " + formaPagamento);
        balconista.entregarPedido();

        scanner.close();
    }
}
