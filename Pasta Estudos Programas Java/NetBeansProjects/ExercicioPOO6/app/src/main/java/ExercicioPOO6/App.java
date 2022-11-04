package ExercicioPOO6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int opcao = -1, total, capacidade, auxiliar;

        Scanner leitor = new Scanner(System.in);

        //objeto Elevador
        Elevador elev[] = new Elevador[1];

        elev[0] = new Elevador(0, 0, 0, 0);

        //Inicializando (capacidade total e andares)
        System.out.printf("Capacidade total: ");
        capacidade = leitor.nextInt();
        System.out.printf("Total de andares: ");
        total = leitor.nextInt();
        elev[0].Inicializar(capacidade, total);

        while (true) {
            pintaMenu();
            opcao = leitor.nextInt();
            if (opcao == 0) {
                break;
            }

            System.out.printf("\n\n");
            switch (opcao) {
                case 1:
                    System.out.printf("Numero de pessoas atualmente: ");
                    auxiliar = leitor.nextInt();
                    if (auxiliar < elev[0].getCapacidade()) {
                        elev[0].setPessoasPresentes(auxiliar);
                    }
                    break;
                case 2:
                    //só sobe se o andar atual for menor que o total
                    if (elev[0].getAndarAtual() < elev[0].getTotalAndares()) {
                        elev[0].Sobe();
                    }
                    break;
                case 3:
                    //só desce se o andar atual for maior que o terreo
                    if (elev[0].getAndarAtual() > 0) {
                        elev[0].Desce();
                    }
                    break;
                case 4:
                    //só entra, se não tiver atingido a capacidade
                    if (elev[0].getPessoasPresentes() < elev[0].getCapacidade()) {
                        elev[0].Entra();
                    }
                    break;
                case 5:
                    //só sai, se houverem pessoas (>0)
                    if (elev[0].getPessoasPresentes() > 0) {
                        elev[0].Sai();
                    }
                    break;
                case 6:
                    System.out.printf("Quantidade de Pessoas: %d\n", elev[0].getPessoasPresentes());
                    System.out.printf("Capacidade Suportada: %d\n", elev[0].getCapacidade());
                    System.out.printf("Andar Atual: %d\n", elev[0].getAndarAtual());
                    System.out.printf("Quantidade de Andares: %d\n", elev[0].getTotalAndares());
                    //espera 2 segundos
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                    }
                    break;
                default:
                    System.out.printf("\n --> Valor Incorreto <--");
                    break;
            }
        }
        System.out.printf("\n\nPrograma Finalizado!\n\n");
    }

    //função eu mostra menu
    private static void pintaMenu() {
        System.out.printf("\n\n > Menu ");
        System.out.printf("\n  1- Numero de pessoas ");
        System.out.printf("\n  2- Sobe de Andar ");
        System.out.printf("\n  3- Desce de Andar ");
        System.out.printf("\n  4- Entra Pessoa ");
        System.out.printf("\n  5- Sai Pessoa ");
        System.out.printf("\n  6- Mostrar dados ");
        System.out.printf("\n  0- Sair ");
        System.out.printf("\n > Resposta: ");
    }
}
