package LanchoneteTresLanches;

public class Salgadinho extends Prato {

    private String recheio;
    private String massa;

    public Salgadinho(String nome, double preco, String dataValidade, 
                double peso, String recheio, String massa) {
        super(nome, preco, dataValidade, peso);
        this.recheio = recheio;
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Salgadinho = " + super.toString() + 
                    ", recheio = " + this.recheio + 
                    ", massa = " + this.massa + "\n";
    }
}
