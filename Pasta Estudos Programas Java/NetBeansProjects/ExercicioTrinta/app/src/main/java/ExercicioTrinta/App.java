package ExercicioTrinta;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        System.out.print("Digite um n1: ");
        n1 = leitor.nextInt();

        System.out.print("Digite um n2: ");
        n2 = leitor.nextInt();

        System.out.print("Digite um n3: ");
        n3 = leitor.nextInt();

        if (n1 < n2) {
            if (n2 < n3) {
                System.out.print(n1 + "\n" + n2 + "\n" + n3);
            } else if (n1 < n3) {
                System.out.print(n1 + "\n" + n3 + "\n" + n2);
            } else {
                System.out.print(n3 + "\n" + n1 + "\n" + n2);
            }
        } else if (n2 < n3) {
            if (n1 < n3) {
                System.out.print(n2 + "\n" + n1 + "\n" + n3);
            }else {
                 System.out.print(n2 + "\n" + n3 + "\n" + n1); 
            }
        }else {
             System.out.print(n3 + "\n" + n2 + "\n" + n1); 
        }
    }
}
