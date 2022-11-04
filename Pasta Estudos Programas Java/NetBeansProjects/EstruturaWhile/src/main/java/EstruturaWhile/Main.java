package EstruturaWhile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // criar condicao de parada = deve ser logica
        int totalAlunos = 10;

        Scanner leitorScanner = new Scanner(System.in);

        // Se colocamos o "True" aqui poderia ficar em loop infinito - deve cuidade
        //para que em algum momento ela fique falsa
        // A parada depende da minha estrutura de repetição - algo no código 
        //traga a condição de parada
        // A VARIAVEL DO CONTROLE - CONDIÇÃO - E SEMPRE CRIADA FORA
        while (totalAlunos > 0) {
            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();

            System.out.println("O nome do aluno e: " + nomeAluno + "e sua "
                        + "idade e: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }
}
