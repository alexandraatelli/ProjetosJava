
package TestaCadastro;

import java.util.Date;

public abstract class Pessoa {
    
    //protected herda automaticamente. 
    //Poderia ser private, mas necessarios metodos de acesso.
    protected String nome;
    protected Date nascimento;
    
    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public abstract String imprimeDados();
}
