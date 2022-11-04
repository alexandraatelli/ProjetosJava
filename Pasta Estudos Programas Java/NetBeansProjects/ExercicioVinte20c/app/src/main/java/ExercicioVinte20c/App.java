package ExercicioVinte20c;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        char genero;
        int idade;
        char saude;
        char continua = 's';
        int apto = 0;
        int inapto = 0;
        
        while (continua == 'S' || continua == 's'){
            
            System.out.print("Nome: ");
            nome = leitor.nextLine();
            
            System.out.print("Genero: m ou f: ");
            genero = leitor.nextLine().charAt(0);
            
            System.out.print("Idade: ");
            idade = leitor.nextInt();
                        
            System.out.print("Saude: p - perfeita ou d - debilitada: ");
            saude = leitor.nextLine().charAt(idade);
            
            if ((genero == 'm' || genero == 'M') && idade >= 18 && saude == 'p')
            {
                System.out.print("Apto para o alistamento militar \n");
                apto++;
            }else {
                System.out.print("Inapto para o alistamento militar \n");
                inapto++;
            }
            
            System.out.print("Continua? S ou N ");
        }
        
        System.out.print("Total de aptos para alistamento: " + apto + "\n");
        System.out.print("Total de inaptos para alistamento: " + apto + "\n");
    }
}
