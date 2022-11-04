package LanchoneteTresLanches;

import java.util.ArrayList;

public class Pedido {

    private Cliente nomeCliente;
    private double percentualTaxaServico;
    private double valorTaxaServico;
    private ArrayList<Prato> itensConsumidos;
    private double preco;

    public Pedido() {
    }

    public Pedido(Cliente nomeCliente, double percentualTaxaServico,
                double valorTaxaServiço, ArrayList<Prato> itensConsumidos,
                double preco) {
        this.nomeCliente = nomeCliente;
        this.percentualTaxaServico = percentualTaxaServico;
        this.valorTaxaServico = valorTaxaServiço;
        this.itensConsumidos = itensConsumidos;
        this.preco = preco;
    }

    public void setItensConsumidos(ArrayList<Prato> itensConsumidos) {
        this.itensConsumidos = itensConsumidos;
    }

    public double calcularPrecoPedido() {
        for (Prato prato : itensConsumidos) {
            preco = preco + prato.getPreco();
        }
        return preco;
    }

    public double calcularTaxaServico() {
        valorTaxaServico = percentualTaxaServico * preco;
        return valorTaxaServico;
    }

    public double calcularTotal() {
        return preco + valorTaxaServico;
    }

    public double calcularTroco(double recebido) {
        double troco = recebido - calcularTotal();
        if (troco > 0) {
            return troco;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + "\n"
                    + "Taxa de Serviço: " + Double.toString(percentualTaxaServico) + "\n"
                    + "Itens Consumidos: " + itensConsumidos.toString();
    }
}
