package ExercicioVinteSete27a;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float valorVeiculo = 0f;
        float valorDesconto = 0f;
        float porcentagemDesconto = 0f;
        String combustivel;
        float valorPago = 0f;
        float totalVeiculosVendidos = 0f;
        float totalValorDesconto = 0f;
        
        while (true){
            
            System.out.print("\nDigite o valor do veiculo: ");
            valorVeiculo = leitor.nextFloat();
            
            if (valorVeiculo == 0){
                break;
            }
            
            System.out.print("Digite o tipo de combustivel: ");
            combustivel = leitor.next();
            
            if (combustivel.equals("alcool")){
                porcentagemDesconto = 0.25f;
            } else if (combustivel.equals("gasolina")){
                porcentagemDesconto = 0.21f;
            }else if (combustivel.equals("diesel")){
                porcentagemDesconto = 0.14f;
            }
            
            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPago = valorVeiculo - valorDesconto;
            totalValorDesconto = totalValorDesconto + valorDesconto; 
            totalVeiculosVendidos = totalVeiculosVendidos + valorPago;
            
            System.out.print("O valor do desconto é: " + valorDesconto);
            System.out.print("O valor pago é: " + valorPago);
            
        }
        
        System.out.print("O valor total dos descontos foi: " + 
                    totalValorDesconto);
        System.out.print("O valor total dos veiculos vendidos foi: " + 
                    totalVeiculosVendidos);
    }
}