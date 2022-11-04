package MultiplicadorForAninhado;

public class MultiplicadorForAninhado {

    public static void main(String[] args) {

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int linha = 1; linha <= 10; linha++) {
            for (int coluna = 0; coluna <= 10; coluna++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int linha = 1; linha <= 10; linha++) {
            for (int coluna = 0; coluna <= 10; coluna++) {
                if (linha == coluna) {
                    break;
                }
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // multiplos de tres
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 3; i < 100; i += 3) {
            System.out.println(i);
        }
        
        //Fatorial
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
        
        
    




