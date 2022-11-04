package ExercicioCinco;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float media;
        
        System.out.println("Digite o nome: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite a nota1: ");
        nota1 = leitor.nextFloat();
        
        System.out.println("Digite a nota2: ");
        nota2 = leitor.nextFloat();
        
        System.out.println("Digite a nota3: ");
        nota3 = leitor.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A media das notas é de " + media);
        
        
    }
}
