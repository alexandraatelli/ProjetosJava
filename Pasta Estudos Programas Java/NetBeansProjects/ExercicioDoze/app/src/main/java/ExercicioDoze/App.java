package ExercicioDoze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         
        Scanner leitor = new Scanner(System.in);
        
        float custo = 0f;
        float imposto = 0.45f;
        float distrib = 0.28f;
        float custoImposto = 0f;
        float venda = 0f;
        
        
        System.out.print("Digite o valor de custo do veiculo: ");
        custo = leitor.nextFloat();
        
        custoImposto = custo + (custo * imposto);
        venda = custoImposto + (custoImposto * distrib);
        
        System.out.println("O valor da venda é de: R$ " + venda);
    }
}
