package ExercicioVinteSeis26;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero = 0;
        System.out.print("Digite um numero de 1 a 5: ");
        numero = leitor.nextInt();

        switch (numero) {
            case 1:
                System.out.print("um");
                break;
            case 2:
                System.out.print("dois");
                break;
            case 3:
                System.out.print("tres");
                break;
            case 4:
                System.out.print("quatro");
                break;
            case 5:
                System.out.print("cinco");
                break;
            default:
                System.out.print("numero invalido");
                break;
        }
    }
}
