package ExercicioSete;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float cel;
        float Fah;
        
        System.out.println("Digite a tempetura em Celsius: ");
        cel = leitor.nextFloat();
        
        Fah = (9 * cel + 160) / 5;
        
        System.out.println("A temperatura em Fahrenheit e: " + Fah);
    }
}
