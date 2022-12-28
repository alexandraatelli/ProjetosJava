package agenda;

public class Endereco extends TipoPessoa{
    
    private String TipoPessoa;
    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    private int cep;
    private TipoEndereco TipoEndereco;

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.TipoEndereco = tipoEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }


    
}
