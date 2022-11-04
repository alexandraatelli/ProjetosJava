package ExercicioDezessete;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int n = 0; //recebe o numero digitado pelo teclado
        int x = 0; //mostrar quantos numeros estão entre o intervalo definido
        
        // i é o contador que inicia com 1 que contara ate 5 numeros
        for (int i = 1; i <= 5; i++){
            
            System.out.println("Digite um numero: ");
            n = leitor.nextInt();// le o numero digitado
             
            //dentro da quantidade de numeros digitados no for, ele mostrara 
            //quantos numeros estao no intervalo abaixo definido
            // o x vai receber os numeros entre o intervalo e mostrara a quantidade
            if (n >= 10 && n <= 150){
                x = x + 1; // a cada numero lido entre o intervalo a variavel x
                           // recebera  - acumulador
            }
        }
        System.out.println(x); // mostrara a quantidade de numeros entre o
                               // entre o interva-lo.
    }
}
