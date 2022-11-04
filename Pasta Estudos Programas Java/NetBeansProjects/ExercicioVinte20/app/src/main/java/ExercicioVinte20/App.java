package ExercicioVinte20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int anoFabricacao = 0;
        float valorVeiculo = 0f;
        float porcentDesconto = 0f;
        float valorDesconto = 0f;
        float valorPagar = 0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        char desejaRepetir = 'S';
        
        //Como não sabemos quantas vezes repetir - faremos com while
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            
            //Entrada de Dados:
            System.out.print("Digite o ano de fabricação do veiculo: ");
            anoFabricacao = leitor.nextInt();
            
            System.out.print("Digite o valor do veiculo: ");
            valorVeiculo = leitor.nextFloat();
            
                if (anoFabricacao <= 2000){
                    porcentDesconto = 0.12f;
                }else {
                    porcentDesconto = 0.07f;
                    //quando o ano nao for menor que 2000 ai contabiliza semi novo
                    totalCarrosSemiNovos++;
                }
                //total de todos independente do ano
                totalCarros++;
            
            valorDesconto = valorVeiculo * porcentDesconto;
            valorPagar = valorVeiculo - valorDesconto;
            
            System.out.print("O valor de desconto foi de " + valorDesconto + "\n");
            System.out.print("O valor a ser pago é: " + valorPagar + "\n");
            
            //A condição de continuar o while ou nao é feita dentro dele
            System.out.print("Digita continuar os registros? S - Sim / N - Nao: ");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        //Quando while acaba mostra
        System.out.print("Total de carros semi novos é: " + totalCarrosSemiNovos);
        System.out.print("Total de Carros: " + totalCarros);
    }
}
 