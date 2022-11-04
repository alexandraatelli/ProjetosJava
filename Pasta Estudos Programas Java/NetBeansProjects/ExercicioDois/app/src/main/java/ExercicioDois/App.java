package ExercicioDois;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float n1 = 0f;
        float n2 = 0f;
        float soma = 0f;
        float sub = 0f;
        float multi = 0f;
        float div = 0f;
             
        System.out.println("Digite um numero: ");
        n1 = leitor.nextFloat();
        
        System.out.println("Digite outro numero: ");
        n2 = leitor.nextFloat();
        
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        
        System.out.println("A soma entre os numeros digitados e " + soma + ". "
                    + "A subtracao e " + sub + ". A multiplicacao e " + multi + 
                    ". A divisao e " + div);
        
        
    }
}
