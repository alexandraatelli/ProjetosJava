package ExercicioVinte20a;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int ano = 0;
        float valorVeiculo = 0f;
        float porcentDesconto = 0f;
        float valorDesconto = 0f;
        float valorPago = 0f;
        char desejaContinuar = 's';
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
        
            System.out.print("Digite o ano do veiculo: ");
            ano = leitor.nextInt();

            System.out.print("Digite o valor do veiculo: ");
            valorVeiculo = leitor.nextFloat();
            
            if (ano <= 2000){
                porcentDesconto = 0.12f;
            }else{
                porcentDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            
            valorDesconto = valorVeiculo * porcentDesconto;
            valorPago = valorVeiculo - valorDesconto;
            
            System.out.print("O valor do desconto é de: " + valorDesconto + "\n");
            System.out.print("O valor a pagar é: " + valorPago + "\n");
            
            System.out.print("Deseja Continuar: s - sim / n - nao \n");
            desejaContinuar = leitor.next().charAt(0);
        }
        
        System.out.print("O total de semi novos: " + totalCarrosSemiNovos + "\n");
        System.out.print("O total de carros: " + totalCarros);
    }
}
