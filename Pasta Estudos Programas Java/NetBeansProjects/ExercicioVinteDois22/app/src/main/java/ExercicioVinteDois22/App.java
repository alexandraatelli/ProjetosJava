package ExercicioVinteDois22;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String produto;
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;
                
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        int i = 0;
        for (; i < 3; i++) {

            System.out.print("Produto: ");
            produto = leitor.next();

            System.out.print("Preco de Custo: ");
            precoCusto = leitor.nextFloat();

            System.out.print("Preco de Venda: ");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto < precoVenda) {
                System.out.print("Lucro! \n");
            } else if (precoCusto == precoVenda) {
                System.out.print("Empate! \n");
            } else {
                System.out.print("Prejuizo! \n");
            }
            
            System.out.print("Produto = " + produto + ". Custo = " + 
                        precoCusto + ". Venda = " + precoVenda + ". Lucro: " +
                        (precoVenda - precoCusto) + "\n");
        }
        
        System.out.print("A media do preco de custo é: " + (totalCusto/i) + "\n");
        System.out.print("A media do preco de venda é: " + (totalVenda/i));
    }
}
