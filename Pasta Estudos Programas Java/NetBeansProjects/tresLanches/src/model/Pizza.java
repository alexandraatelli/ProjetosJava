package model;

public class Pizza extends Prato {

    private String molho;
    private String recheio;
    private String borda;
	
	public Pizza(String nome, double preco, String dataValidade, double peso, String molho, String recheio, String borda) {
		super(nome, preco, dataValidade, peso);
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
	}

	@Override
	public String toString() {
		return "Pizza = " + super.toString() + ", molho = " + molho + ", recheio = " + recheio + ", borda = " + borda + "\n";
	}
}
