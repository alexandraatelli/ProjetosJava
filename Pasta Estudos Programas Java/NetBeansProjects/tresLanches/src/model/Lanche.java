package model;

public class Lanche extends Prato {
	
	private String pao;
    private String recheio;
    private String molho;
	
	public Lanche(String nome, double preco, String dataValidade, double peso, String pao, String recheio, String molho) {
		super(nome, preco, dataValidade, peso);
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}
	
	@Override
	public String toString() {
		return "Lanche = " + super.toString() + ", pao = " + this.pao + ", recheio = " + this.recheio + ", molho = " + this.molho + "\n";
	}
}
