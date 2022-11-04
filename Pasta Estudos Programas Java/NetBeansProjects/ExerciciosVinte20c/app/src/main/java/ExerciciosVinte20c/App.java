package ExerciciosVinte20c;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int ano = 0;
        float valorVeiculo = 0f;
        float valorDesconto = 0f;
        float porcDesconto = 0f;
        float totalPagar = 0f;
        char continua = 's';
        int semiNovo = 0;
        int totalVeiculos = 0;
        
        while (continua == 's' || continua == 'S'){
            
            System.out.print("Digite o ano: ");
            ano = leitor.nextInt();
            
            System.out.print("Digite o valor: ");
            valorVeiculo = leitor.nextFloat();
        
            if (ano <= 2000){
                porcDesconto = 0.12f;
            }else {
                porcDesconto = 0.07f;
                semiNovo++;
            }
            totalVeiculos++;
            
            valorDesconto = valorVeiculo * porcDesconto;
            totalPagar = valorVeiculo - valorDesconto;
            
            System.out.print("O valor desconto: " + valorDesconto + "\n");
            System.out.print("Valor Pago é: " + totalPagar + "\n");
            
            System.out.print("Continua? s -> sim / n -> nao: ");
            continua = leitor.next().charAt(0);
        }
        
        System.out.print("Total Semi Novos: " + semiNovo + "\n");
        System.out.print("Total de Veiculos: " + totalVeiculos);

    }
}
