

//tipo - em Java chamamos de classe
public class Conta {
    
    //atributos: isso é uma especificação de conta
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    //comportamentos - métodos
    public void deposita(double valor){
        this.saldo = this.saldo + valor; 
        // valor é uma variavel primitiva e não um atributo que toda conta tem.
        //é uma variavel temporaria, um argumento.
        //Ele não devolve nada para quem o invocou.
    }
    
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
}
