package TestaCadastro;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Nerço da Capitinga", 
                    new Date(1955, 11, 19), 
                    55);
        
        Funcionario funcionario = new Funcionario("Axel Rose", 
                    new Date(1955, 11, 05), 
                    1500.00f);
        
        Gerente gerente = new Gerente("Axel Rose", 
                    new Date(1954, 12, 05), 
                    25000.00f, "Operacional"); 
        
        
        CadastroPessoas cadastro = new CadastroPessoas();
        
        cadastro.cadastroPessoa(cliente);
        cadastro.cadastroPessoa(funcionario);
        cadastro.cadastroPessoa(gerente);
        
        cadastro.imprimiCadastro(cliente);
        cadastro.imprimiCadastro(funcionario);
        cadastro.imprimiCadastro(gerente);
        
        System.out.println("");
        
 
       
        
                    
                
        
        
        
        
        
        
        
        
    }
}
