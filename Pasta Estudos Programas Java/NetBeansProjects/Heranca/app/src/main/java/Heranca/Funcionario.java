package Heranca;

import java.util.Date;

public class Funcionario {
    
    //Atributos comuns a todos os funcionários.
    private String nome;
    private String CPF;
    private Date dataNascimento;
    private float salario;
    
    //Metodos modificadores acessorios para acesso aos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    //Atributos que todo funcionario tem
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    

}
