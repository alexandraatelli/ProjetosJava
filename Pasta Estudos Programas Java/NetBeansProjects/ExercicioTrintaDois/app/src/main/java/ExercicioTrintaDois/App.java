package ExercicioTrintaDois;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float lado1 = 0f;
        float lado2 = 0f;
        float lado3 = 0f;
        
        System.out.print("Digite o lado 1: ");
        lado1 = leitor.nextFloat();
        
        System.out.print("Digite o lado 2: ");
        lado2 = leitor.nextFloat();
        
        System.out.print("Digite o lado 3: ");
        lado3 = leitor.nextFloat();
        
        if (lado1 == lado2 && lado2 == lado3){
            System.out.print("Triangulo Equilátero!");
        }else if (lado1 == lado2 && lado2 != lado3){
            System.out.print("Triangulo Isóceles!");
        }else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            System.out.print("Triangulo Escaleno!");
        }
    }
}