package ExercicioDezessete17;

//Biblioteca leitor
import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        //instacia o objeto leitor
        Scanner leitor = new Scanner (System.in);
        
        //variável que recebera os numeros
        int numero = 0;
        int aux = 0;
        
        for(int i = 0; i <=5; i++){
            
            System.out.print("Digite um numero: ");
            numero = leitor.nextInt();
                              
            if (numero >= 10 && numero <= 150){
                aux = aux + 1;
                //Essa variavel quem vai armazenar os numeros no intervalo
            }
        }
        //fora do for pois caso contrario mostraria abaixo de cada vez que um
        //numero é digitado, e armazenado na variavel X se dentro do intervalo.
        System.out.println("Foram digitados " + aux + " numeros no intervalo.");
    }
}
