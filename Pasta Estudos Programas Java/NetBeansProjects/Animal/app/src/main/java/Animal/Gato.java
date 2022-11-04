package Animal;

public class Gato extends Animal{
    
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    //subscreve o metodo da superclasse e define o comportamento especifico que
    //esse animal gato faz
    @Override
    public String emitirSom(){
        return "miau miau miau";
    }
}
