package model;

import java.util.ArrayList;

import model.Prato;

public class Pedido {
	
    private String nomeCliente;
    private double percentualTaxaDeServico;
    private double valorTaxaDeServico;
    private ArrayList<Prato> itensConsumidos;
    private double preco;

    public Pedido(String nomeCliente, double taxaDeServico, ArrayList<Prato> itensConsumidos) {
        this.nomeCliente = nomeCliente;
        this.percentualTaxaDeServico = taxaDeServico;
        this.itensConsumidos = itensConsumidos;
    }
    
    @Override
    public String toString() {
    	return "Nome do cliente: " + nomeCliente + " Taxa de servico: " + Double.toString(percentualTaxaDeServico) + " Itens pedidos: " + itensConsumidos.toString();
     }
    
    public double getPreco() {
    	return this.preco;
    }
    
    public double calcularPrecoPedido() {
    	for(Prato prato : itensConsumidos) {
    		preco = preco + prato.getPreco();
    	}
    	
    	return preco;
    }
    
    public double calcularTaxaServico() {
    	valorTaxaDeServico = percentualTaxaDeServico * preco;
    	return valorTaxaDeServico;
    }
    
    public double calcularTotal() {
    	return preco + valorTaxaDeServico;
    }
    
    public double calcularTroco(double recebido) {
        double troco = recebido - calcularTotal();
        
        if (troco > 0) {
        	return troco;
        } else {
        	return -1;
        }
    }

}
