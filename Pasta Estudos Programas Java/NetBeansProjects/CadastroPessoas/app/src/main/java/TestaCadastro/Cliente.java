
package TestaCadastro;

import java.util.Date;

public class Cliente extends Pessoa{
    
    private int codigoCliente;

    public Cliente(String nome, Date nascimento, int codigoCliente) {
        super(nome, nascimento);
        this.codigoCliente = codigoCliente;
    }
    /*
    public int getCodigoCliente() {
        return codigoCliente;
    }
    
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    */ 
    
    @Override
    public String imprimeDados() {
        return "O nome do cliente eh " + this.nome
                    + ", sua data e nascimento eh " + nascimento.getDataNascimento()
                    + " e seu codigo eh " + Integer.toString(this.codigoCliente);
    }
}
