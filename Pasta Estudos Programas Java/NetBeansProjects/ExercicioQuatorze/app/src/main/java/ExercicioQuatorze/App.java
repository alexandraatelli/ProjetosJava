package ExercicioQuatorze;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int n1;
        int n2;
        
        System.out.println("Digite o n1: ");
        n1 = leitor.nextInt();
        
        System.out.println("Digite o n2: ");
        n2 = leitor.nextInt();
        
        if (n1 > n2){
            System.out.println("O primeiro numero é maior que o segundo!");
        }else {
            System.out.println("O segundo numero é maior que o primeiro!");
        }
    }
}
