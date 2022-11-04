package ExercicioVinteCinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.print("Digite o primeiro numero: ");
        n1 = leitor.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = leitor.nextInt();

        if (n1 == n2) {
            System.out.print("São iguais!");
        } else if (n1 > n2) {
            System.out.print("São diferentes e o maior deles é " + n1);
        } else {
            System.out.print("São diferentes e o maior deles é " + n2);
        }
    }
}
