package ExercicioDezenova;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        char sexo;
        int totM = 0;
        int totH = 0;

        for (int i = 1; i <= 2; i++) {

            System.out.println("Digite o nome: ");
            nome = leitor.nextLine();

            System.out.println("Digite o sexo: F - Feminino / M - Masculino ");
            sexo = leitor.nextLine().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                totM = totM + 1;
            } else {
                totH = totH + 1;
            }
        }

        System.out.println("O total de homens é de: " + totH + " e o de "
                    + "mulheres e de: " + totM);
    }
}
