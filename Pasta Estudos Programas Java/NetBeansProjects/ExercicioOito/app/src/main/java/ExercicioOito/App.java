package ExercicioOito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        float cotacaoReal = 0f;
        float cotacaoDolar = 0f;
        float quantDolares = 0f;
        
        System.out.println("Digite o valor da cotação da moeda Dolar: ");
        cotacaoDolar = leitor.nextFloat();
        
        System.out.println("Digite a quantidade de dolares disponíveis: ");
        quantDolares = leitor.nextFloat();
        
        cotacaoReal = cotacaoDolar * quantDolares;
        
        System.out.println("O valor dos dolares convertidos em reais é de R$ "
                    + cotacaoReal);
    }
}
