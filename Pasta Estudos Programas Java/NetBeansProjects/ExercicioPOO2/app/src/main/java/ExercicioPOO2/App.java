package ExercicioPOO2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        
        ContaCorrente conta = new ContaCorrente(0,"",0.00f);
      
        conta.setNumeroConta(121);
        conta.setNomeCorrentista("Alexandra Atelli");
        conta.setSaldo(1200.00f);
        
        System.out.print(conta.Cadastro() + "\n");
                
        conta.AlterarNome("Carla Atelli");
        System.out.print("O novo titular da conta é: " + 
                    conta.getNomeCorrentista() + "\n");
        
        conta.Deposito(3000);
        System.out.print("O novo saldo é de: R$ " + conta.getSaldo() + "\n");
        
        conta.Saque(500);
        System.out.print("O novo saldo é de: R$ " + conta.getSaldo() + "\n");
        
        System.out.print(conta.Cadastro() + "\n");
        
        System.out.print("Digite o numero da conta: \n");
        conta.setNumeroConta(leitor.nextInt());
        leitor.nextLine();//consumindo a nova linha restante usando o método nextLine().
        System.out.print(conta.Cadastro() + "\n");
        
        System.out.print("Digite o novo titular da conta: \n");
        conta.AlterarNome(leitor.nextLine());
        System.out.print(conta.Cadastro() + "\n");
        
        System.out.print("Digite o valor do deposito: \n");
        conta.Deposito(leitor.nextFloat());
        System.out.print(conta.Cadastro() + "\n");
        
        System.out.print("Digite o valor do saque: \n");
        conta.Saque(leitor.nextFloat());
        System.out.print(conta.Cadastro() + "\n");
    
    }
    
    /**POR QUE SCANNER ESTÁ PULANDO NEXTLINE() APÓS O USO DE OUTRAS FUNÇÕES 
     * NEXT?
     * 
     * Esse problema ocorre porque, quando ométodo nextInt() da classe Scanner 
     * é usado para ler a idade da pessoa, por exemplo, ele retorna o valor 1
     * para a variável idade, conforme o esperado. Mas o cursor, depois de 
     * ler 1, fica logo depois dele.
     * 
     * Portanto, quando o nome do Pai é lido usando o método nextLine() 
     * da classe Scanner, por exemplo, esse método começa a ler a partir da 
     * posição atual do cursor. Nesse caso, ele começará a ler logo após 1. 
     * Portanto, a próxima linha após 1 é apenas uma nova linha, que é 
     * representada pelo caractere '\ n'. Conseqüentemente, o nome do Pai é 
     * apenas '\ n'.
     * 
     * Como resolver este problema?
     * 
     * Esse problema pode ser resolvido de uma das seguintes maneiras:
     * 
     * 1. ler a linha completa para o inteiro e convertê-lo em um inteiro, ou
     * Sintaxe:
     *          int var = Integer.parseInt (sc.nextLine());
     * Embora este método não seja aplicável para string de entrada após o 
     * caractere de byte (Byte.parseByte (sc.nextLine()). O segundo método é 
     * aplicável nesse caso.
     * 
     * 2. Consumindo a nova linha restante usando o método nextLine().
     * Sintaxe:
     *              // Leia o inteiro
     *                 int var = sc.nextInt();
     *              // Leia a nova linha restante
     *                 sc.nextLine();
     */
}
