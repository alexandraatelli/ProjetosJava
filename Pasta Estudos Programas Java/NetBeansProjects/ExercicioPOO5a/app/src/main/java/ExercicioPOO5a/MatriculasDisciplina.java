
package ExercicioPOO5a;

public class MatriculasDisciplina {
    
    private int matricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;
    private float notaCorte = 7.00f;

    public MatriculasDisciplina(int matricula, String nome, float notaProva1, 
                float notaProva2, float notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }
    
    //Tira o parametro porque nao está usando. Abstraindo o calculo - to retornando o calculo.
    public float MediaFinal (){
        return  (notaProva1 + notaProva2 + notaTrabalho) / 3;
    }
    
    public float ProvaFinal(){
       // float provaFinal = 7.00f;
       // return provaFinal - MediaFinal();
       if (notaProva1 + notaProva2 + notaTrabalho == 7){
           return 0;
        }else{
       return this.notaCorte = notaCorte - MediaFinal();
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
