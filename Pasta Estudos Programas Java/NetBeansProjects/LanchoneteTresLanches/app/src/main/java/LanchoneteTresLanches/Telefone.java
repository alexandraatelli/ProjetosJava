package LanchoneteTresLanches;

class Telefone {

    private String telefoneCelular; 

    public void setTelefone(String telefone) {
        if (//telefone.length() == 10 && 
                    telefone.length() == 11 || 
                    !telefone.matches("^\\(?\\d{2}\\)?[\\s-]?\\d{5}-?\\d{4}$")){
            this.telefoneCelular = telefone;
        }else {
            this.telefoneCelular = "Invalido!";
        }
    }
    
    public String getTelefoneCliente() {
        return "Telefone: " + telefoneCelular;
    }
}
