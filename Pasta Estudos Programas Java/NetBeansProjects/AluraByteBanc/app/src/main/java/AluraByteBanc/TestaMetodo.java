package AluraByteBanc;

public class TestaMetodo {
    
    public static void main(String[] args) {
        
        Conta contaAlexandra = new Conta();
        contaAlexandra.saldo = 100;
        contaAlexandra.deposita(50);
        System.err.println("contaAlexandra.saldo");
        
        
        boolean consegiuRetirar = contaAlexandra.saca(20);
        System.err.println(contaAlexandra.saldo);
        
        Conta contaMarcio = new Conta();
        contaMarcio.deposita(1000);
        
        // boolean sucessoTransferencia = contaMarcio.transfere(300, contaAlexandra);
        contaMarcio.transfere(300, contaAlexandra);
        System.err.println(contaMarcio.saldo);
        System.err.println(contaAlexandra.saldo);
        
        /*fariamos um if assim:
            if(sucessoTransferencia){
                System.err.println("Sucesso");
        }else{
                System.err.println("Falha");
        }
        */
        
        contaAlexandra.titular = "Alexandra Atelli";
        System.err.println(contaAlexandra.titular);
        
        
    }
}
