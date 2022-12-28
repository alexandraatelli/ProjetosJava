package LanchoneteTresLanches;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nomeCliente;
        double percentualTaxaServico;
        double totalRecebido;

        ArrayList<Prato> bancoDeDados = new BancoDeDados.popular();
        ArrayList<Prato> pratosPedidos = new ArrayList<Prato>();

        int contador = 1;
        int indiceDoPrato = 0;

        System.out.println("*****Registrar novo Pedido***** ");

        System.out.println("Cliente: ");
        nomeCliente = leitor.nextLine();
        System.out.println("\n");

        System.out.println("Percentual da Taxa de Serviço: ");
        percentualTaxaServico = leitor.nextDouble();
        System.out.println("\n");

        System.out.println("******Lista de Pratos: ******");
        System.out.println("\n");

        for (Prato prato : bancoDeDados) {
            System.out.println(contador + " : " + prato.toString());
            contador++;
        }

        while (true) {

            System.out.println("Informe o numero do prato desejado ou -1 para sair: ");

            indiceDoPrato = leitor.nextInt();

            if (indiceDoPrato == -1) {
                System.out.println("Pedido finalizado!");
                break;
            } else {
                if (indiceDoPrato >= 1 && indiceDoPrato < bancoDeDados.size()) {
                    pratosPedidos.add(bancoDeDados.get(indiceDoPrato - 1));
                    System.out.println("Prato "
                                + bancoDeDados.get(indiceDoPrato - 1).getNome()
                                + " adicionado! \n");
                } else {
                    System.out.println("Opção inválida! Favor informar uma opção válida. \n");
                }
            }
        }

        Pedido pedido = new Pedido(nomeCliente, percentualTaxaServico, pratosPedidos);

        System.out.println("Valor Total dos Pedidos: " + pedido.calcularPrecoPedido());
        
        System.out.println("Valor da Taxa de Serviço: " + pedido.calcularTaxaServico());

        System.out.println("Valor Total da Conta: " + pedido.calcularTotal());
         
        System.out.println("Valor recebido: ");
        totalRecebido = leitor.nextDouble();
        
        System.out.println("Nota Fiscal: ");
        System.out.println("Itens Consumidos: \n" + pedido.toString());
        System.out.println("Valor Total da Conta: \n" + pedido.calcularTotal());
        
        if (pedido.calcularTroco(totalRecebido) > 0) {
            System.out.println("Valor do Troco: "
                        + pedido.calcularTroco(totalRecebido) + "\n");
        } else {
            System.out.println("Recebimento menor que o valor total de Consumo!");
        }

        System.out.println("Consumo finalizado!");
    }
}
