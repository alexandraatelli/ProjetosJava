package TestaCadastro;

import java.util.ArrayList;

public class CadastroPessoas {
    
    private int quantidade;
    
        public int quantidadeAtual = 0;
        
        //lista é uma estrutura de dados
        public ArrayList<Pessoa> cadastroPessoas = new ArrayList<Pessoa>();
        
        public void cadastroPessoa(Pessoa pessoa){
            cadastroPessoas.add(pessoa);
            quantidadeAtual += 1;
        }
    
        public void imprimiCadastro(Pessoa pessoa){
            System.out.println(pessoa.imprimeDados());
        }
}
