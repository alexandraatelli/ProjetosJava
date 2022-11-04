
public class TestaBanco {
    
    public static void main(String[] args) {
        
        Cliente paulo = new Cliente();
        //popular = setar atributos ao objeto
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.cpf = "Programador";
        
        Conta contaPaulo = new Conta();
        contaPaulo.deposita(100);
            
        contaPaulo.titular = paulo;
        System.err.println(contaPaulo.titular.nome);
        System.err.println(contaPaulo.titular);
        System.err.println(paulo);
        // eles apontam para o mesmo objeto
        
    }
    
}
