package ExercicioVinteOito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = "";
        float valorSalarioMinimo = 1212.0f;
        float valorSalarioAtual = 0f;
        float porcentagemReajuste = 0f;
        float valorSalarioReajustado = 0f;
        float valorReajuste = 0f;
        float totalDispendidoReajuste = 0f;

        for (int i = 1; i <= 4; i++) {

            System.out.print("Digite o nome do funcionario: ");
            nome = leitor.next();

            System.out.print("Digite o valor do salario atual: ");
            valorSalarioAtual = leitor.nextFloat();

            if (valorSalarioAtual < (valorSalarioMinimo * 3)) {
                porcentagemReajuste = 0.50f;
            } else if (valorSalarioAtual >= valorSalarioMinimo * 3
                        && valorSalarioAtual <= valorSalarioMinimo * 10) {
                porcentagemReajuste = 0.20f;
            } else if (valorSalarioAtual > valorSalarioMinimo * 10
                        && valorSalarioAtual <= valorSalarioMinimo * 20) {
                porcentagemReajuste = 0.15f;
            } else {
                porcentagemReajuste = 0.10f;
            }
        
        valorReajuste = valorSalarioAtual * porcentagemReajuste;
        valorSalarioReajustado = valorSalarioAtual + valorReajuste;
        totalDispendidoReajuste = totalDispendidoReajuste + valorReajuste;
        
    
        System.out.print("O valor do salario minimo vigente é de: R$ "
                    + valorSalarioMinimo + "\n");
        
        System.out.print(nome + " tem o salario atual de R$ "
                    + valorSalarioAtual + "\n");

        System.out.print(nome + " com o reajuste de " + porcentagemReajuste
                    + " tem o seu salario reajustado para: R$ "
                    + valorSalarioReajustado + "\n");
        
        }
        
        System.out.print("A empresa teve um dispendio para os reajuste no"
                    + " valor de R$ " + totalDispendidoReajuste);
    }
}
