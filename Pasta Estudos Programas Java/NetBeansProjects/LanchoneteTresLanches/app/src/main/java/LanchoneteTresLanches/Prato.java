package LanchoneteTresLanches;

public abstract class Prato {

    //vê as propriedades - acessa seus valores - tem visibilidades nas subclasses
    protected String nome;
    protected double preco;
    protected String dataValidade;
    protected double peso;
    // protected Pizza pizza;
    // protected Lanche lanche;
    // protected Salgadinho salgadinhos;

    //construir a classe e preencher os seus valores
    public Prato(String nome, double preco, String dataValidade,
                double peso) {
        //this referencia a propriedade da classe
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    //Para representar como string - mostrar os pratos
    @Override
    public String toString() {
        return nome + ", preco = " + preco
                    + ", dataDeValidade = " + dataValidade
                    + ", peso = " + peso;
    }

    //facilitador para totaliza os preco dos itens. This para ficar mais explicito a propriedade
    public double getPreco() {
        return this.preco;
    }

    //Apresentar o nome do item
    public String getNome() {
        return this.nome;
    }
}
