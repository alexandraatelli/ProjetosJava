package LanchoneteTresLanches;

public class Cliente {

    private String nomeCliente;
    private String cpf;
    private String cnpj;
    private Endereco endereco;
    private Telefone telefone;
    private Pedido pedido;

    public Cliente() {
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente.length() < 3) {
            this.nomeCliente = "Invalido";
        } else {
            this.nomeCliente = nomeCliente;
        }
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11 || cpf.matches("^(\\d)\\1{10}")) {
            this.cpf = "Inválido!";
        } else {
            this.cpf = cpf;
        }
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length() != 14 || cnpj.matches("^(\\d)\\1{13}")) {
            this.cnpj = cnpj;
        } else {
            this.cnpj = cnpj;
        }
    }

    public String getDadosClientePessoaFisica() {
        return "\n************* Tiquet da Venda ****************\n"
                    + "Cliente: " + nomeCliente + "\n"
                    + "CPF: " + cpf + "\n"
                    + endereco.getEnderecoCliente() + "\n"
                    + telefone.getTelefoneCliente() + "\n"
                    + "**********************************************";
     }

    public String getDadosClientePessoaJuridica() {
        return "\n************* Tiquet da Venda ****************\n"
                    + "Cliente: " + nomeCliente + "\n"
                    + "CNPJ: " + cnpj 
                    + endereco.getEnderecoCliente() + "\n"
                    + telefone.getTelefoneCliente() + "\n"
                    + "**********************************************";
    }
}
