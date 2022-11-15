package agendacontatos;

public class Email extends Registro{
    
    public int idPessoa;
    public int idEmail;
    private String email;

    public Email(int idPessoa, String email) {
        super(idRegistro);
        this.idPessoa = idPessoa;
        this.idEmail = idRegistro;
        this.email = email;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmail() {
        return email;
    }
    
    
}
