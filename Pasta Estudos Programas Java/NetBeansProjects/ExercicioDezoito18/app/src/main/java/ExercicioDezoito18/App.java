package ExercicioDezoito18;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int idade = 0;
        
        for(int i = 1; i <= 3; i++){
            
            System.out.print("Digite a idade: ");
            idade = leitor.nextInt();
            
            if (idade >= 18){
                System.out.print("Maioridade! \n");
            }else{
                System.out.print("Menoridade! \n");
            }
        }
    }
}
