package ExercicioVinte20b;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int ano = 0;
        float valorVeiculo = 0f;
        float porcentDesconto = 0f;
        int totalSemiNovos = 0;
        float valorDesconto = 0f;
        float valorPagar = 0f;
        int totalGeral = 0;
        char continuar = 's';
        
        while(continuar == 's' || continuar == 'S'){
            
            System.out.print("Digite o ano: ");
            ano = leitor.nextInt();
            
            System.out.print("Digite o valor: ");
            valorVeiculo = leitor.nextFloat();
            
            if(ano <= 2000){
                porcentDesconto = 0.12f;
            } else {
                porcentDesconto = 0.07f;
                totalSemiNovos++;
            }
            totalGeral++;
                        
            valorDesconto = valorVeiculo * porcentDesconto;
            valorPagar = valorVeiculo - valorDesconto;
                        
            System.out.print("O valor do desconto é: " + valorDesconto + "\n");
            System.out.print("O valor a pagar é: " + valorPagar + "\n");
            
            System.out.print("Continuar? s = sim / n = nao");
            continuar = leitor.next().charAt(0);
        } 
        
       System.out.print("Total Semi Novos: " + totalSemiNovos + "\n");
       System.out.print("Total geral carros: " + totalGeral);
    }
}
