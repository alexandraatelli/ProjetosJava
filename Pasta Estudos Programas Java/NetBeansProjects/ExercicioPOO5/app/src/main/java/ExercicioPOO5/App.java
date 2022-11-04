package ExercicioPOO5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        
        char continua = 'S';

        MatriculasDisciplina alunos = new MatriculasDisciplina(0,
                    "", 0.00f, 0.00f, 0.00f);

        while (continua == 'S' || continua == 's') {

            System.out.print("Digite o numero da matricula: ");
            alunos.setMatricula(leitor.nextInt());
            leitor.nextLine();

            System.out.print("Digite o nome do aluno: ");
            alunos.setNome(leitor.next());

            System.out.print("Digite a nota da prova 1: ");
            alunos.setNotaProva1(leitor.nextFloat());

            System.out.print("Digite a nota da prova 2: ");
            alunos.setNotaProva2(leitor.nextFloat());

            System.out.print("Digite a nota do trabalho: ");
            alunos.setNotaTrabalho(leitor.nextFloat());

           System.out.print("Continua? s -> sim // n -> nao: ");
           continua = leitor.next().charAt(0);
        
        }      
              
        System.out.print("Media das notas: " + alunos.MediaFinal() 
                    + ". Na prova final necessario a nota minima de: " 
                    + alunos.ProvaFinal());
    }
}
