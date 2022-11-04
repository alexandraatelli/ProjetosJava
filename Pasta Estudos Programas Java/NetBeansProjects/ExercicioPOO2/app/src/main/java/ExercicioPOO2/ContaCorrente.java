package ExercicioPOO2;

public class ContaCorrente {

    private int numeroConta;
    private String nomeCorrentista;
    private float saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    
    public String Cadastro(){
        return "Conta Corrente n. " + getNumeroConta() + " de titular: " + 
                    getNomeCorrentista() + " tem o saldo" + " no valor de R$ " + 
                    getSaldo();
    }
    
    public String AlterarNome(String alterarNome){
        return nomeCorrentista = alterarNome;
    }
    
    public float Deposito(float deposito) {
        return saldo = saldo + deposito;
    }
 
    public float Saque( float saque){
        return saldo = saldo - saque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
           this.saldo = saldo;
    }
}
