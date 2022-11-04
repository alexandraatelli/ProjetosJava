package ExercicioPOO6;

public class Elevador {

    int andarAtual; //terreo = 0;
    int totalAndares;
    int capacidade;
    int pessoasPresentes;

    public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = pessoasPresentes;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
    
    //Inicializa:
    public void Inicializar(int andarAtual, int capacidade){
        this.andarAtual = andarAtual;
        this.capacidade = capacidade;
    }
    
    //Entra Pessoas:
    public void Entra(){
        this.pessoasPresentes = pessoasPresentes + 1;
    }
    
    //Sai Pessoas:
    public void Sai(){
        this.pessoasPresentes = pessoasPresentes - 1;
    }
    
    //Sob andar:
    public void Sobe(){
        this.andarAtual = andarAtual + 1;
    }
    
    //Desce andar:
    public void Desce(){
        this.andarAtual = andarAtual - 1;
    }
}