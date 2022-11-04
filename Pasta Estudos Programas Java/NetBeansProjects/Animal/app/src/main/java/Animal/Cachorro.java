
package Animal;

public class Cachorro extends Animal {
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
        
    }
     //subscreve o metodo da superclasse e define o comportamento especifico que
     //esse animal cachorro faz
    @Override
    public String emitirSom(){
        return "au au au";
    }
}
