public class Cliente {
    
    private int id;
    private String nome;
    private String email;
    private Endereco endereco;
    // private String CPF;

    public Cliente(int id, String nome, String email, Endereco endereco/* ,String CPF*/) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        // this.CPF = CPF;
    }

    
    
    @Override
    public String toString() {
        return "\nID do cliente " + id + "\n Nome do cliente: " + nome + "\nEmail do cliente: " + email + endereco.toString();
    }
    
    // public String getCPF(){
    //     return CPF;
    // }

}
