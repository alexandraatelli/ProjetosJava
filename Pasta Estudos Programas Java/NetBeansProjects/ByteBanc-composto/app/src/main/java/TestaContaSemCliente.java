public class TestaContaSemCliente {
    
    public static void main(String[] args) {
        Conta contaAlexandra = new Conta();
        //System.out.println(contaAlexandra.saldo);
        
        contaAlexandra.titular = new Cliente();
        System.out.println(contaAlexandra.titular.nome);
        
    }
    
}
