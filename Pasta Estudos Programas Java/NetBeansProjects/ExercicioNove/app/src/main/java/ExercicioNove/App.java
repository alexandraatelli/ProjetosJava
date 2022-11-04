package ExercicioNove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        float dep = 0f;
        float juros = 0.07f;
        float rend = 0f;
        
        System.out.println("Digite o valor total do deposito: ");
        dep = leitor.nextFloat();
        
        rend = dep + (dep * juros);
        
        System.out.println("O valor dos rendimentos no mês é de: " + rend);
    }
}
