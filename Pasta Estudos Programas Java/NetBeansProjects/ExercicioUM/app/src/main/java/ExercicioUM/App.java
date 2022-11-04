package ExercicioUM;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int n1;
        int n2;
        int s;
        
        System.out.println("Digite um numero ");
        n1 = leitor.nextInt();
        
        System.out.println("Digite outro numero: ");
        n2 = leitor.nextInt();
        
        s = n1 + n2;
        
        System.out.println("A soma dos numeros é; " + s);
   
    }
}
