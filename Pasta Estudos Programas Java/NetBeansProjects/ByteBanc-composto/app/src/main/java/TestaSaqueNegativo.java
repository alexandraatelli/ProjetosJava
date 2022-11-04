public class TestaSaqueNegativo {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.err.println(conta.saca(101));
        
        conta.saca(101);
        
        //para incovar o metodo nao precisa passar nada nos parenteses.
        System.err.println(conta.getSaldo());
        
        
    }
    
}
