package ExercicioPOO1;

import java.util.Calendar;

public class Pessoa {
    
    private String nome;
    private int anoNascimento;
    private float altura;

    public Pessoa(String nome, int anoNascimento, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    
    public int getPessoaIdade(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year - anoNascimento;
    }
    
    public String InformacoesPessoa(){
            return nome + " com " + getPessoaIdade() + 
                        " anos de idade, tem " + altura + 
                        "mts de altura."; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
