package ExercicioDezenove19;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        char genero;
        int f = 0;
        int m = 0;
        
        
        
        for(int i = 1; i <= 5; i++){
            
            System.out.print("Digite o nome: ");
            nome = leitor.nextLine();
            
            System.out.print("Digite o genero: F para Feminino / M para Masculino: ");
            genero = leitor.nextLine().charAt(0);
            
                if (genero == 'f' || genero == 'F'){
                    f = f + 1;
                }else {
                    m = m + 1;
                }
        }
        
        System.out.print("Foram registrados " + f + " mulheres e " + m + " "
                    + "homens!");
    }
}
