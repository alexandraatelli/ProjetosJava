package AgendaContatosRefatorado;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in); 
        
        ArrayList<Cliente> bancoDeDadosCliente = new ArrayList<Cliente>();

        Boolean continua = true;
        int menu = 0;
        do{

            System.out.println("\n********Selecione uma opção********\n");
            System.out.println("1 - Adicionar novo cliente \n");
            System.out.println("2 - Remover um cliente \n");
            System.out.println("3 - Listar todos os clientes \n");
            menu = leitor.nextInt();
            
            switch(menu){
                // ACadastrar
                case 1:
                    Cliente cliente = cadastarCliente(bancoDeDadosCliente.size());
                    bancoDeDadosCliente.add(cliente);
                    continua = verificarContinuidade();
                    break;
                // Excluir
                case 2:
                    int id;
                    System.out.println("\nInforme o id do usario a ser removido: ");
                    id = leitor.nextInt();
                    bancoDeDadosCliente.remove(id - 1);
                    break;
                    // Listar
                    case 3:
                    imprimirClientes(bancoDeDadosCliente);
                    break;

                    default:
                        System.out.println("Opcao invalida ");
                        continue;
                }
                
            }while(continua);

            System.out.println("Execução finalizada!");
                
     
    }
    private static Boolean verificarContinuidade(){
        Scanner sc = new Scanner(System.in); 
        int opcao;
        System.out.println("\nDeseja continua a execução do programa? "
                    + "Digite 1 para continuar ou outro numero para sair");
        opcao = sc.nextInt();

        
        if(opcao == 1){
            return true;
        }
        return false;

    }

    private static void imprimirClientes(ArrayList<Cliente> bancoDeDadosCliente) {
        System.out.println("\n IMPRIMINDO LISTA DE CLIENTES");

        for(Cliente cliente : bancoDeDadosCliente){
            System.out.println(cliente.toString());
            System.out.println("--------------------");
        }
    }

    public static Cliente cadastarCliente(int tamanhoDaLista){
        Scanner sc = new Scanner(System.in); 
        String nome, email, rua, cidade, estado;
        
        System.out.println("Digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("Digite o email do cliente: ");
        email = sc.nextLine();
        System.out.println("Digite a rua do cliente: ");
        rua = sc.nextLine();
        System.out.println("Digite a cidade do cliente: ");
        cidade = sc.nextLine();
        System.out.println("Digite o estado do cliente: ");
        estado = sc.nextLine();

        Endereco endereco = new Endereco(rua, cidade, estado);

        Cliente cliente = new Cliente(tamanhoDaLista + 1, nome, email, endereco);
        

        return cliente;
        
    }
       
}

