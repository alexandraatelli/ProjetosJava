package ExercicioPOO4a;

public class Invoice1 {
    
    private int codigo;
    private String descricao;
    private int quantidade;
    private float valorUnitario;

    public Invoice1(int codigo, String descricao, int quantidade, float valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    
    public double getInvoice1Amount(){
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

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            this.quantidade = 0;
        }else {
            this.quantidade = quantidade;
        }
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        if (valorUnitario < 0 ){
            this.valorUnitario = 0;
        }else {
            this.valorUnitario = valorUnitario;
        }
    }
}
