public class TestaGetSet {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        // conta.numero= 1337; não compila, o atributo é privado
        conta.setNumero(1337);//parenteses pois invocacao de metodo
        
        System.err.println(conta.getNumero());
        
        
    }
}
