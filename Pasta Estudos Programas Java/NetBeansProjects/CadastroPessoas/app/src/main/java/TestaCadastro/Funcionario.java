package TestaCadastro;

import java.util.Date;

public class Funcionario extends Pessoa {

    protected float salario;

    public Funcionario(String nome, Date nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
   
    }

    public void setSalario(float salario) {
        if(this.salario > 0 && this.salario < 50000.00f){
        this.salario = salario;
        }
    }

    public float calculaImposto() {
        return this.salario * 0.03f;
        // return (float) (this.salario * 0.03);
    }

    // regras de encapsulamento e visibilidade que define como fazemos a chamada
    @Override
    public String imprimeDados() {
        return "O nome do funcionario eh: " + this.nome
                    + ", sua data e nascimento eh: " + nascimento.getDataNascimento()
                    + " e seu salario eh: " + Float.toString(this.salario);
    }
}
