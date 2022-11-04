package AluraByteBanc;

public class App {
 
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); 
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        //atribuindo valor a um objeto
        
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
        
    }
}
