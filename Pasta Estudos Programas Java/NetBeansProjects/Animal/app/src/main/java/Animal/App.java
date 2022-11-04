package Animal;

public class App {
   
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("",0);
        cachorro.setNome("DogDog");
        cachorro.setIdade(2);
        
        System.out.println("\nNome do animal: " + cachorro.getNome());
        System.out.println("Idade do animal: " + cachorro.getIdade() + " ano(s).");
        System.out.println("O cachorro faz " + cachorro.emitirSom() + "\n");
                
        Gato gato = new Gato("", 0);
        gato.setNome("CatCat");
        gato.setIdade(1);
        
        System.out.println("\nNome do animal: " + gato.getNome());
        System.out.println("Idade do animal: " + gato.getIdade() + " ano(s).");
        System.out.println("O gato faz " + gato.emitirSom() + "\n");
        
        /*na classe foi definido como string - usa println para mostrar
        cachorro.emitirSom();
        gato.emitirSom();
       */
    }
}
