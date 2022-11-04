package ExercicioVinteQuatro;

//biblioteca do leitor
import java.util.Scanner;

public class App {

    //classe principal
    public static void main(String[] args) {
        
        //instancia objeto leitorScanner para ler o dado de entrada.
        Scanner leitorScanner = new Scanner(System.in);

        //Condição do while para continuar ou parar a repeticao. 
	//Char somente permite uma letra.
        //char utiliza aspas simples e ela so guarda uma letra
        char desejaContinuar = 'S';

        //estrutura de repetição - contem a condição de repeticao.
        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um numero: ");
            //abaixo será lido (entrada do dado digitado) o numero digitado 
            //e atribuido a variavel numero do tipo int.
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O numero é zero!");
            } else {
                if (numero > 0) {
                    System.out.print("O numero é maior que zero!");
                } else {
                    System.out.print("O numero é menor que zero!");
                }
            }

            System.out.println("Deseja continuar? S - Sim / N - Nao");
            
            /*
            *Le a primeira letra de uma palavra.
            *Nao precisa usar o nextLine pois somente necessita de uma palavra.
            *Na verdade quer-se um caracter somente.
            *Para pegar somente um caracter dessa palavra usa-se 
            * "ponto" .charAt(0); coloca o indice zero que e o primeiro.
            *Diz para leitor ler a palavra, pega a primeira letra dela, 
            *qualquer letra, nesse exercicio o S ou N.
            */
            desejaContinuar = leitorScanner.next().charAt(0);
        }
    }
}
