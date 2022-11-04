package ExercicioMediaIFSP;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        NotasMediaAlunos notas = new NotasMediaAlunos(0, 0, 0);
        
        System.out.print("Digite a nota 1: ");
        notas.setNota1(leitor.nextFloat());
        System.out.print("A nota 1  é: " + notas.getNota1());
        
        System.out.print("Digite a nota 2: ");
        notas.setNota2(leitor.nextFloat());
         System.out.print("A nota 2  é: " + notas.getNota2());
        
        System.out.print(notas.MediaNotas());
    }
}
