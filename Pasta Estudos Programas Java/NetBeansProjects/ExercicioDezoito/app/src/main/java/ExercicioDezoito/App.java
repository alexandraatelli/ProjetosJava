package ExercicioDezoito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade = 0;

        for (int i = 0; i <= 5; i++) {

            System.out.println("Digite a idade: ");
            idade = leitor.nextInt();

            if (idade >= 18) {
                System.out.println("Você atingiu a maioridade!");
            }else{
                System.out.println("Você não 2atingiu a maioridade!");
            }
        }
    }
}
