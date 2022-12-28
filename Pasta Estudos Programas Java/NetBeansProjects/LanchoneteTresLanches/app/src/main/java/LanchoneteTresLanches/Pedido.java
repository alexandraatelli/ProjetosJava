package LanchoneteTresLanches;

import java.util.ArrayList;

public class Pedido {

    private String nomeCliente;
    private double percentualTaxaServico;
    private double valorTaxaServico;
    private ArrayList<Prato> itensConsumidos;
    private double preco;
    
    public Pedido(){}

    //Array tem que vir instanciados já com os itens preenchidos - e passar ela como argumento no meu construtor
    public Pedido(String nomeCliente, double percentualTaxaServico, ArrayList<Prato> itensConsumidos) {
        this.nomeCliente = nomeCliente;
        this.percentualTaxaServico = percentualTaxaServico;
        this.itensConsumidos = itensConsumidos;
    }

    //Para cada prato do itens consumidos, faz um somatorio do preco
    public double calcularPrecoPedido() {
        for (Prato prato : itensConsumidos) {
            preco = preco + prato.getPreco();
        }
        return preco; // retorna o preco do pedido
    }

    public double calcularTaxaServico() {
        valorTaxaServico = percentualTaxaServico * preco;
        return valorTaxaServico;
    }

    public double calcularTotal() {
        return preco + valorTaxaServico;
    }

    //poderia passar essa responsabilidade em outra classe
    public double calcularTroco(double recebido) {
        double troco = recebido - calcularTotal();
        if (troco > 0) {
            return troco;
        } else {
            return -1;
        }
    }

    public double getPreco() {
        return preco;
    }
          
    //Roda o toString em cada um dos elementos dele e imprime cada um deles no Main
    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + "\n"
                    + "Taxa de Serviço: " + Double.toString(percentualTaxaServico) + "\n"
                    + "Itens Consumidos: " + itensConsumidos.toString();
    }
}

