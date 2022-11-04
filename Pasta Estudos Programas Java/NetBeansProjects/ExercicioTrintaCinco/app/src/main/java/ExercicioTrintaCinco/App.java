package ExercicioTrintaCinco;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String tipoCliente;
        int quantKwConsumida;
        float porcentagem = 0.00f;
        float valorPagar = 0;
        
        System.out.print("Qual o tipo de cliente? Residencia ou Comercial? ");
        tipoCliente = leitor.nextLine();
        
        System.out.print("Quantos KW/h foram consumidos: ");
        quantKwConsumida = leitor.nextInt();
        
        if (tipoCliente.equals("residencia")){
            porcentagem = 0.60f;
        }if (tipoCliente.equals("comercial")){
            porcentagem = 0.48f;
        }
        
        valorPagar = quantKwConsumida * porcentagem;
        
        System.out.print("Valor a pagar: R$ " + valorPagar);
        valorPagar = leitor.nextFloat();
    }
}
