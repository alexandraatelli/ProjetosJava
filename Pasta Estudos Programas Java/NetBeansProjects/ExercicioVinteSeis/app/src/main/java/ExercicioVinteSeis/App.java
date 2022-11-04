package ExercicioVinteSeis;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int opcao = 0;
        
        System.out.print("Digite um numero 1 a 5: ");
        opcao = leitor.nextInt();
        
        switch(opcao){
            
            case '1':
                System.out.print("um");
                break;
            case 2:
                System.out.print("dois");
                break;
            case 3:
                System.out.print("tres");
                break; 
            case 4:
                System.out.print("quatro");
                break; 
            case 5:
                System.out.print("cinco");
                break;
            default:
                System.out.print("numero invalido");
        }
    }
}
