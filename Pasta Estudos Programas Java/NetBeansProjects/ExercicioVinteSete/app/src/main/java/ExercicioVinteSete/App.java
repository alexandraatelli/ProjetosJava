package ExercicioVinteSete;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float valorVeiculo = 0f;
        float porcentagemDesconto = 0f;
        float valorDesconto = 0f;
        float valorPago = 0f;
        String combustivel;
        float totalDescontos = 0f;
        float totalPagoClientes = 0f;

        while (true) {

            System.out.print("\n\nDigite o valor do Veiculo: ");
            valorVeiculo = leitor.nextFloat();

            //digitado zero no valor veiculo, sai fora do while
            if (valorVeiculo == 0) {
                break;
            }

            System.out.print("Digite o tipo de combustivel do veiculo: ");
            combustivel = leitor.next();

            //No java quando comparar objetos String usa-se o equals: questao de uso de memoria
            if (combustivel.equals("alcool")) {
                porcentagemDesconto = 0.25f;
            } else if (combustivel.equals("gasolina")) {
                porcentagemDesconto = 0.21f;
            } else if (combustivel.equals("diesel")) {
                porcentagemDesconto = 0.14f;
            }

            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPago = valorVeiculo - valorDesconto;
            totalDescontos = totalDescontos + valorDesconto;
            totalPagoClientes = totalPagoClientes + valorPago;

            System.out.print("O valor do desconto é: " + valorDesconto + "\n");
            System.out.print("O valor da porcentagem é: " + porcentagemDesconto + "\n");
            System.out.print("O valor a ser pago é: " + valorPago + "\n");

        }

        System.out.print("O valor total dos descontos foi: " + totalDescontos);

        System.out.print("O valor total pago pelos clientes foi: "
                    + totalPagoClientes);

    }
}
