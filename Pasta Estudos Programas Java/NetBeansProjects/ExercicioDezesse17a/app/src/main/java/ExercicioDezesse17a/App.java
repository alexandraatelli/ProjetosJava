package ExercicioDezesse17a;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int numero = 0;
        int aux = 0;
        
        for(int i = 1; i <= 5; i++){
            
            System.out.print("Digite um numero: ");
            numero = leitor.nextInt();
            
                if (numero >= 10 && numero <= 150){
                     aux = aux + 1;
                 }
        }
        
        System.out.print("Foram lidos no intervalo solicitado " + aux + " "
                    + "numeros.");
    }
}
