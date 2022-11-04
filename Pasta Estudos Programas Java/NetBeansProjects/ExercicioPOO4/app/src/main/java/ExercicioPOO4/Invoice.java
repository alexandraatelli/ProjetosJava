package ExercicioPOO4;

public class Invoice {

    //private - para acessar os atributos via metodos acessorios:
    private int codigo;
    private String descricao;
    private int quantidade;
    private float valorUnitario;

    //Construtor - no Main ela é instanciada e recebera os valores nos parametros
    //this aqui acompanha para se referir a essa classe - tem haver com herança
    public Invoice(int codigo, String descricao, int quantidade, float valorUnitario) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setValorUnitario(valorUnitario);
    }

    public double getInvoiceAmount() {
        return quantidade * valorUnitario;
    } 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //validacao: Aqui é o local exato para nao ter entradas indesejadas
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getValorUnitario() {
        return valorUnitario;
    }
    
    //validacao: Aqui é o local exato para nao ter entradas indesejadas
    public void setValorUnitario(float valorUnitario) {
        if (valorUnitario < 0) {
            this.valorUnitario = 0;
        } else {
            this.valorUnitario = valorUnitario;
        }
    }
}
