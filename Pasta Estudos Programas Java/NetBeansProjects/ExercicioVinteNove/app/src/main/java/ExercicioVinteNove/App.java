package ExercicioVinteNove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao;

        System.out.print("Digite o mês desejado: De 1 a 12 (numeros): ");
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("janeiro");
                break;
            case 2:
                System.out.print("fevereiro");
                break;
            case 3:
                System.out.print("março");
                break;
            case 4:
                System.out.print("abril");
                break;
            case 5:
                System.out.print("jmaio");
                break;
            case 6:
                System.out.print("junho");
                break;
            case 7:
                System.out.print("julho");
                break;
            case 8:
                System.out.print("agosto");
                break;
            case 9:
                System.out.print("setembro");
                break;
            case 10:
                System.out.print("outubro");
                break;
            case 11:
                System.out.print("novembro");
                break;
            case 12:
                System.out.print("dezembro");
                break;
            default:
                System.out.print("mes invalido!");
                break;
        }
    }
}
