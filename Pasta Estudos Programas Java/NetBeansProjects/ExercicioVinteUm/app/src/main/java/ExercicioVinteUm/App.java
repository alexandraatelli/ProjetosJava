package ExercicioVinteUm;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        char genero = 'm';
        int idade = 0;
        char saude = 'b'; //= 'b'; /// b - bom e r - ruim
        char continua = 's';
        int aptos = 0;
        int inaptos = 0;
    
        while (continua == 's' || continua == 'S'){
        
            for(int i = 1; i <= 3; i++){
                
                System.out.print("Nome: ");
                nome = leitor.nextLine();
                
                System.out.print("Genero: ");
                genero = leitor.nextLine().charAt(0);
                
                System.out.print("Idade: ");
                idade = leitor.nextInt();
                
                System.out.print("Saude: ");
                saude = leitor.next().charAt(0);
                
                             
                if (idade >= 18 && genero == 'm' && saude == 'b'){
                    System.out.print("Apto para o serviço militar \n");
                    aptos++;
                }else{
                    System.out.print("Inapto para o  serviço militar \n");
                    inaptos++;
                }
            }
            
            System.out.print("Continua? ");
            continua = leitor.nextLine().charAt(0);
        }
        
        //System.out.print(aptos + " pessoas estao aptos e " + inaptos + " "
        //                + " estão inaptos para o serviço militar!");
    }
}
