package ExercicioDez;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float valorProduto = 0f;
        int quantParcelas = 5;
        float valorParcelas = 0f;
        
        System.out.println("Digite o valor do produto: ");
        valorProduto = leitor.nextFloat();
        
        valorParcelas = valorProduto / quantParcelas;
        
        System.out.println("O valor das 5 parcelas é de R$ " + valorParcelas );
  }
}
