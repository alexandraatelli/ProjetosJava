package ExercicioTrintaTres;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        float salNivel1 = 12.00f;
        float salNivel2 = 17.00f;
        float salNivel3 = 25.00f;
        int quantAulas = 0;
        
        
        for (int i = 1; i <= 1; i++){
            
        System.out.print("Digite a quantidade horas/aula no nivel1: ");
        quantAulas = leitor.nextInt();
        
        System.out.print("Digite a quantidade horas/aula no nivel2: ");
        quantAulas = leitor.nextInt();
        
        System.out.print("Digite a quantidade horas/aula no nivel3: ");
        quantAulas = leitor.nextInt();
        
        }
        quantAulas++;
        
        salNivel1 = salNivel1 * quantAulas;
        salNivel2 = salNivel2 * quantAulas;
        salNivel3 = salNivel3 * quantAulas;
        
        System.out.print("Salario do Nivel 1: " + salNivel1 + "\n");
        System.out.print("Salario do Nivel 2: " + salNivel2 + "\n");
        System.out.print("Salario do Nivel 3: " + salNivel3 + "\n");
    }    
}
        

        

        

        
        
        
        

