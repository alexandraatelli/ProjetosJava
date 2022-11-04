package model;

public abstract class Prato {
	
	protected String nome;
	protected double preco;
	protected String dataValidade;
	protected double peso;
	
	public Prato(String nome, double preco, String dataValidade, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}
	
	
    @Override
    public String toString() {
        return nome + ", preco = " + preco + ", dataDeValidade = " + dataValidade + ", peso = " + peso;
    }
    
    public double getPreco() {
    	return this.preco;
    }
	
    public String getNome() {
    	return this.nome;
    }
}
