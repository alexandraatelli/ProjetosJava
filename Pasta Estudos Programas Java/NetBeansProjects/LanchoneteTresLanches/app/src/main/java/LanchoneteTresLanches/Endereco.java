package LanchoneteTresLanches;

class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;

    public void setCep(String cep) {
        if (cep.length() != 8 || cep.matches("^([0-9]){5}-[0-9]{3}$")) {
            this.cep = "Invalido!";
        } else {
            this.cep = cep;
        }
    }

    public void setLogradouro(String logradouro) {
        if (logradouro.length() <= 3) {
            this.logradouro = "Invalido!";
        } else {
            this.logradouro = logradouro;
        }
    }

    public void setComplemento(String complemento) {
        if (complemento.length() <= 0) {
            this.complemento = "Invalido!";
        } else {
            this.complemento = complemento;
        }
    }

    public void setBairro(String bairro) {
        if (bairro.length() <= 2) {
            this.bairro = "Invalido!";
        } else {
            this.bairro = bairro;
        }
    }

    public void setCidade(String cidade) {
        if (cidade.length() < 3) {
            this.cidade = "Invalido!";
        } else {
            this.cidade = cidade;
        }
    }

    public String getEnderecoCliente() {
        return "Endereco: CEP " + cep + "\n"
                    + "Situado na: " + logradouro + ", " + complemento + "\n"
                    + "Bairro " + bairro + "\n"
                    + "Cidade de " + cidade;

    }
}
