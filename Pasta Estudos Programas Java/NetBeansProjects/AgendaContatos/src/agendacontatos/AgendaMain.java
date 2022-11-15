package agendacontatos;

import java.util.ArrayList;

public class AgendaMain {

    public static void main(String[] args) {

        //conexao com o meu Banco de Dados - Escopo Global - Esse banco de Dados é um objeto
        BancoDeDadosSimulacao bancoDeDados = new BancoDeDadosSimulacao();

        //bancoDeDados.Inserir(new TiposGerais("Celular", "TipoTelefone"));
        //System.out.println("Dados: " + bancoDeDados.tiposGerais.size());

        /*
        ArrayList dados = bancoDeDados.Select("TiposGerais", "TipoPessoa");
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.tiposGerais.get((int) dados.get(i)).valor);
         
        }*/
        
        /*
        ArrayList dados = bancoDeDados.Select("Pessoa", "11111111111");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.pessoas.size());
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.pessoas.get((int) dados.get(i)).getNumeroInscricao());

        }*/

        /*
        ArrayList dados = bancoDeDados.Select("Endereco", "2");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.enderecos.size());
 
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.enderecos.get((int) dados.get(i)).idPessoa);

        }*/
        
        /*
        ArrayList dados = bancoDeDados.Select("Telefone", "1");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.telefones.size());

        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.telefones.get((int) dados.get(i)).idPessoa);

        }*/
        
        /*
        ArrayList dados = bancoDeDados.Select("Email", "2");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.emails.size());

        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.emails.get((int) dados.get(i)).idPessoa);

        }*/
       System.out.println(bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"));
       System.out.println(bancoDeDados.ImprimiDados("Pessoa", "11111111111", "completo"));
    
       System.out.println(bancoDeDados.ImprimiDados("Endereco",bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"),  "completo"));
     
       System.out.println(bancoDeDados.ImprimiDados("Telefone",bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"),  "completo"));
       System.out.println(bancoDeDados.ImprimiDados("Telefone",bancoDeDados.ImprimiDados("Pessoa", "22222222222", "id"),  "completo"));
    
       System.out.println(bancoDeDados.ImprimiDados("Email",bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"),  "completo"));
       System.out.println(bancoDeDados.ImprimiDados("Email",bancoDeDados.ImprimiDados("Pessoa", "22222222222", "id"),  "completo"));
    }
}
