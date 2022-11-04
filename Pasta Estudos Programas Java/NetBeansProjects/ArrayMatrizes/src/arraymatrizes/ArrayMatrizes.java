package arraymatrizes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayMatrizes {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //vetor dos alunos
        String[] alunos = {"Joao", "Jose", "Maria"};

        //matriz de notas : um vetor de vetores
        float[][] notas = new float[3][4]; // [3 linhas][4 colunas]

        //controla a somatoria de notas de cada aluno e calcula a media do aluno
        float somaNotas, mediaAluno;

        //armazena o status do aluno, se aprovado, recuperação ou reprovado
        String statusAluno = "";

        //for externo - associa o aluno a nota - faz varredura das linhas
        for (int i = 0; i < 3; i++) {
            //System.out.println("\n" + alunos[i]);

            // for interno para informar as notas de cada aluno - faz varredura das notas
            somaNotas = 0;//zera a cada interação - e refaz a soma de cada aluno
            mediaAluno = 0;//zera a cada interação - e refaz a media de cada aluno
            
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog(""
                            + "\nInforme a nota " + (j + 1) + " do aluno " + 
                            alunos[i] ));
                somaNotas += notas [i][j];
            }
            mediaAluno = somaNotas / 4; 
            if (mediaAluno < 5.5) {
               statusAluno = "Reprovado";
            } else if (mediaAluno >= 5.5 && mediaAluno < 7.0) {
                statusAluno = "Recuperação";
            } else {
                statusAluno = "Aprovado";
            }
            System.out.println("\n***************** BOLETIN ***************");
            System.out.println("\n Aluno: " + alunos[i]);
            System.out.println("Notas");
            for (int g = 0; g < 4; g++){
                System.out.println((g+1) + " - " + notas[i][g]);
            }
            System.out.println("Media: " + mediaAluno + " - " + statusAluno);
        }
    }
}
