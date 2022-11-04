package ExercicioTrintaUm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float a = 0f;
        float b = 0f;
        char operadorAritmetico='1';

        System.out.print("Digite o valor um numero para a: ");
        a = leitor.nextFloat();

        System.out.print("Digite o valor um numero para b: ");
        b = leitor.nextFloat();

        System.out.print("Digite o valor um operador aritmetico:"
                            + "1 - Soma; "
                            + "2 - Subtracao; "
                            + "3 - Multiplicacao; "
                            + "4 - Divisao. ");
        operadorAritmetico = leitor.next().charAt(0);
        

        System.out.print(a);
        System.out.print(b);
        System.out.print(operadorAritmetico);
        
        switch(operadorAritmetico){
            
            case '1':
                System.out.print("A soma é: " + (a + b));
                break;
            case '2':
                System.out.print("A subtracao é: " + (a - b));
                break;
            case '3':
                System.out.print("A multiplicacao é: " + (a * b));
                break;
            case '4':
                System.out.print("A divisao é: " + (a / b));
                break;
            default:
                System.out.print("Operador inválido!");
                break;
        }
    }
}
    
