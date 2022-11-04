package ExercicioOnze;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        float custo = 0f;
        float venda = 0f;
        float percent = 0f;
        
        System.out.println("Digite o valor de custo do produto: ");
        custo = leitor.nextFloat();
        
        System.out. println("Digite a porcentagem sobre o valor de custo; ");
        percent = leitor.nextFloat();
        
        venda = custo + ((custo * percent) / 100);
        
        System.out.println("O valor da venda é de: R$ " + venda);
    }
}
