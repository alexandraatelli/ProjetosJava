package ExercicioDezesseis;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        float nota1 = 0f;
        float nota2 = 0f;
        float nota3 = 0f;
        float media = 0f;
        
        System.out.println("Digite o nome: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite a nota1: ");
        nota1 = leitor.nextFloat();
        
        System.out.println("Digite a nota2: ");
        nota2 = leitor.nextFloat();
        
        System.out.println("Digite a nota3: ");
        nota3 = leitor.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7 && media <= 10){
            System.out.println("Aprovado!");
        } else if (media < 7 && media >= 5) {
            System.out.println("Recuperacao!");
        }else if (media < 5){
            System.out.println("Reprovado!");
        }
    }
}
