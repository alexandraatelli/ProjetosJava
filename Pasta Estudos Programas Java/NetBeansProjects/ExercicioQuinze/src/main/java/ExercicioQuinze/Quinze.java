package ExercicioQuinze;
//

import java.util.Scanner;

public class Quinze {

    public static void main(String[] args) {

        int numero;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O numero esta no intervalo!");
        } else {
            System.out.println("O numero nao esta no intervalo!");
        }

    }
}
