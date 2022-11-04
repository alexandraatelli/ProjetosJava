package Animal;
//requisitos desse exercicio nao define se abstrato 
abstract class  Animal{   
    
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    abstract String emitirSom();
    
    /*se nao fosse classe abstrata seria assim o metodo:
    public String emitirSom(){
        return "Qual animal se quer saber o som que emite?"
    }*/
}
