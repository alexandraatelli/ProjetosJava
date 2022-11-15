package agendacontatos;

import java.util.*;

public class BancoDeDadosSimulacao {

    //Cada Array faz o papel de uma tabela no Banco de Dados
    List<Pessoa> pessoas = new ArrayList<>();
    List<Endereco> enderecos = new ArrayList<>();
    List<Telefone> telefones = new ArrayList<>();
    List<Email> emails = new ArrayList<>();
    public List<TiposGerais> tiposGerais = new ArrayList<>();

    

    //Construtor do Banco de Dados
    public BancoDeDadosSimulacao() {

        //Inserir pessoas
        Inserir(new Pessoa("Alexandra", "15/02/1980", "Fisica", "11111111111"));
        Inserir(new Pessoa("Marcio", "16/03/1977", "Fisica", "22222222222"));
        Inserir(new Pessoa("Alexandra", "15/02/1980", "Fisica", "11111111111"));
        Inserir(new Pessoa("Pedro", "01/06/2018", "Fisica", "22222222222"));
        Inserir(new Pessoa("C&A", "01/01/1980", "Juridica", "11111111111111"));

        //Inserir Endereco
        Inserir(new Endereco(1, "Avenida LogoAli", 0, "terreo",
                    "Vila SemRua", "Fim do Mundo", "Critico", "01001000"));
        Inserir(new Endereco(2, "Rua SemFim", 1, "LadoImpar",
                    "Historico", "Alem", "Nuven", "02002000"));
         Inserir(new Endereco(3, "Rua DAqui", 1, "LadoParImpar",
                    "Historico", "Alem", "Nuven", "02002000"));

        //Inserir Telefone
        Inserir(new Telefone(1, "11111111111"));
        Inserir(new Telefone(2, "22222222222"));
        Inserir(new Telefone(2, "33333333333"));

        //Inserir Email
        Inserir(new Email(1, "alexandra@hostale.com"));
        Inserir(new Email(2, "marcio@marcionet.com"));
        Inserir(new Email(2, "marcio.net@marcionet.com"));

        //Inserir Tipos Gerais
        Inserir(new TiposGerais("Fisica", "TipoPessoa"));
        Inserir(new TiposGerais("Juridica", "TipoPessoa"));
        Inserir(new TiposGerais("Residencial", "TipoEndereco"));
        Inserir(new TiposGerais("Comercial", "TipoEndereco"));
        Inserir(new TiposGerais("Particular", "TipoTelefone"));
        Inserir(new TiposGerais("Comercial", "TipoTelefone"));
        Inserir(new TiposGerais("Particular", "TipoEmail"));
        Inserir(new TiposGerais("Comercial", "TipoEmail"));
        Inserir(new TiposGerais("Cobranca", "TipoEmail"));
        Inserir(new TiposGerais("Outro", "TipoPessoa"));

    }

    public final boolean Inserir(Object o) {
        switch (o.getClass().getSimpleName()) {
            case "Pessoa":
                pessoas.add((Pessoa) o);
                break;
            case "Endereco":
                enderecos.add((Endereco) o);
                break;
            case "Telefone":
                telefones.add((Telefone) o);
                break;
            case "Email":
                emails.add((Email) o);
                break;
            case "TiposGerais":
                tiposGerais.add((TiposGerais) o);
                break;
        }
        return true;
    }

    //Retorna uma Array com os indices dos dados dentro da estrutura (pessoas, outros, telefone...)
    public final ArrayList Select(String nomeLista, String chave) {
    List<Integer> lista = new ArrayList<>();

        switch (nomeLista) {
            case "Pessoa":
                pessoas.get(0);
                for (Pessoa pessoa : pessoas) {
                    if (pessoa.getNumeroInscricao().equalsIgnoreCase(chave)) {
                        lista.add(pessoas.indexOf(pessoa));
                        //System.out.println(pessoas.indexOf(pessoa); 
                    }
                }
                break;
            case "Endereco":
                enderecos.get(0);
                for (Endereco endereco : enderecos) {
                    if (endereco.idPessoa == Integer.parseInt(chave)) {
                        lista.add(enderecos.indexOf(endereco));
                        //System.out.println("=>"+enderecos.indexOf(endereco)); 
                    }
                }
                break;
            case "Telefone":
                telefones.get(0);
                for (Telefone telefone : telefones) {
                    if (telefone.idPessoa == Integer.parseInt(chave)) {
                        lista.add(telefones.indexOf(telefone));
                        //System.out.println(telefones.indexOf(telefone)); 
                    }
                }
                break;
            case "Email":
                emails.get(0);
                for (Email email : emails) {
                    if (email.idPessoa == Integer.parseInt(chave)) {
                        lista.add(emails.indexOf(email));
                        System.out.println(emails.indexOf(email));
                    }
                }
                break;
            case "TiposGerais":
                for (TiposGerais tipos : tiposGerais) {
                    if (tipos.categoria.equalsIgnoreCase(chave)) {
                        lista.add(tiposGerais.indexOf(tipos));
                        // System.out.println(tiposGerais.indexOf(tipos)); 
                    }
                }
                break;
        }
        return (ArrayList) lista;
    }

    public String ImprimiDados(String nomeLista, String chave, String tipoRetorno) {
        
    String dadosRetorno = "";
    ArrayList dados;
    
        switch (nomeLista) {
            case "Pessoa":
                dados = Select("Pessoa", chave);
                if(dados.size() >= 0){
                if (tipoRetorno.equalsIgnoreCase("completo")) {
                    for (int i = 0; i < dados.size(); i++) {
                        dadosRetorno = dadosRetorno + "Nome: " + pessoas.get((int) dados.get(i)).getNome() + "\n";
                        dadosRetorno = dadosRetorno + "Data Nascimento: " + pessoas.get((int) dados.get(i)).getNascimento() + "\n";
                        dadosRetorno = dadosRetorno + "Tipo de Pessoa: " + pessoas.get((int) dados.get(i)).getTipoPessoa() + "\n";
                        dadosRetorno = dadosRetorno + "Numero Documento: " + pessoas.get((int) dados.get(i)).getNumeroInscricao() + "\n";
                    }
                } else if (tipoRetorno.equalsIgnoreCase("id")) {
                    dadosRetorno += pessoas.get((int) dados.get(0)).getIdPessoa();
                }
                }else{
                    dadosRetorno = "Pessoa nao encontrada!";
                }
                break;
            case "Endereco":
                dados = Select("Endereco", chave);
                if(dados.size() > 0){
                if (tipoRetorno.equalsIgnoreCase("completo")) {
                    //System.out.println(dadosEnd.size());
                    for (int i = 0; i < dados.size(); i++) {
                        dadosRetorno = dadosRetorno + "Id Endereco: " + enderecos.get((int) dados.get(i)).getIdEndereco() + "\n";
                        dadosRetorno = dadosRetorno + "Endereco: " + enderecos.get((int) dados.get(i)).getRua() + "\n";
                        dadosRetorno = dadosRetorno + "Numero: " + enderecos.get((int) dados.get(i)).getNumero() + "\n";
                        dadosRetorno = dadosRetorno + "Complemento: " + enderecos.get((int) dados.get(i)).getComplemento() + "\n";
                        dadosRetorno = dadosRetorno + "Bairro: " + enderecos.get((int) dados.get(i)).getBairro() + "\n";
                        dadosRetorno = dadosRetorno + "Cidade: " + enderecos.get((int) dados.get(i)).getCidade() + "\n";
                        dadosRetorno = dadosRetorno + "Estado: " + enderecos.get((int) dados.get(i)).getEstado() + "\n";
                        dadosRetorno = dadosRetorno + "Cep: " + enderecos.get((int) dados.get(i)).getCep() + "\n";
                    }
                } else if (tipoRetorno.equalsIgnoreCase("id")) {
                    dadosRetorno += enderecos.get((int) dados.get(0)).getIdEndereco();
                }
                }else{
                    dadosRetorno = "Sem dados de Endereço!";
                }
                break;
                case "Telefone":
                dados = Select("Telefone", chave);
                if(dados.size() >= 0){
                if (tipoRetorno.equalsIgnoreCase("completo")) {
                    for (int i = 0; i < dados.size(); i++) {
                        dadosRetorno = dadosRetorno + "Id Telefone: " + telefones.get((int) dados.get(i)).getIdTelefone() + "\n";
                        dadosRetorno = dadosRetorno + "Telefone: " + telefones.get((int) dados.get(i)).getNumeroFone() + "\n";
                    }
                } else if (tipoRetorno.equalsIgnoreCase("id")) {
                    dadosRetorno += telefones.get((int) dados.get(0)).getIdTelefone();
                }
                }else{
                    dadosRetorno = "Telefone nao encontrado!";
                }
                break;
                case "Email":
                dados = Select("Email", chave);
                if(dados.size() >= 0){
                if (tipoRetorno.equalsIgnoreCase("completo")) {
                    for (int i = 0; i < dados.size(); i++) {
                        dadosRetorno = dadosRetorno + "Id Email: " + emails.get((int) dados.get(i)).getIdEmail() + "\n";
                        dadosRetorno = dadosRetorno + "Email: " + emails.get((int) dados.get(i)).getEmail() + "\n";
                    }
                } else if (tipoRetorno.equalsIgnoreCase("id")) {
                    dadosRetorno += emails.get((int) dados.get(0)).getIdEmail();
                }
                }else{
                    dadosRetorno = "Email nao encontrado!";
                }
                break;
        }
        return dadosRetorno;
            
        
        
    }
}
