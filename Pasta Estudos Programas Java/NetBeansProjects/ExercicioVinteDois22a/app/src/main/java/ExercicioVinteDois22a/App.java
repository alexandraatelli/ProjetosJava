package ExercicioVinteDois22a;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        int quantidadeProdutos;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        System.out.print("Digite a quantidade de produtos a cadastrar: ");
        quantidadeProdutos = leitor.nextInt();
        
        for(int i = 0; i < quantidadeProdutos; i++){
        
            System.out.print("Produto: ");
            nomeProduto = leitor.next();
            
            System.out.print("Preco de Custo: ");
            precoCusto = leitor.nextFloat();
            
            System.out.print("Preco de Venda: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto < precoVenda){
                System.out.print("Lucro! \n");
            } else if (precoCusto == precoVenda){
                System.out.print("Empate! \n");
            }else {
                System.out.print("Prejuizo! \n");
            }
            
            System.out.print("Produto: " + nomeProduto + ". Custo = " + precoCusto +
                        ". Venda = " + precoVenda + ". Lucro: " + (precoVenda - 
                                    precoCusto) + ". \n");
        }
        System.out.print("A media do preco de custo é: " + 
                    (totalCusto/quantidadeProdutos) + "\n");
        System.out.print("A media do preco de venda é: " + 
                    (totalVenda/quantidadeProdutos));
    }
}
