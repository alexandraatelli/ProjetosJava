package ExercicioVinteTres;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.print("Digite um número: ");
        numero = leitor.nextInt();
        
        if (numero > 80){
            System.out.print(numero + " é maior que 80!");
        }else if (numero < 25){
             System.out.print(numero + " é menor que 25!");
        }else if (numero == 40){
             System.out.print(numero + " é igual a 40!");
        }
    }
}
