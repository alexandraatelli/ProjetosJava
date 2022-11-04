package ExercicioVinte;

//biblioteca
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        //leitor dos dados de entrada
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 'S';
                    
        //enquanto essa variavel desejaRepetir for igual a true, continua 
        //a repeticao.
        while (desejaRepetir == 'S' || desejaRepetir == 's'){
            
            //Entrada de dados:
            System.out.println("Digite o ano de fabricacao do veículo: ");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            }else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
                
            }
            
            //faz o incremento fora da verificacao do ano, porque é de todos
            // os carros, independente de semi-novos ou nao.
            totalCarros++;
            
            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;
            
            System.out.println("O valor do desconto é de: " + valorDesconto);
            System.out.println("O valor a pagar e de: " + valorPagar);
            
            System.out.println("Deseja fazer mais calculos? S - Sim / N - Nao");
            desejaRepetir = leitor.next().charAt(0);
        }
            
        System.out.println("Total dos carros semi-novos: " + totalCarros);
       System.out.println("Total geral dos carros: " + totalCarros);
    }
}
