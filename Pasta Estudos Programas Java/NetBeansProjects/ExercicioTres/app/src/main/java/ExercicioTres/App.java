package ExercicioTres;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        float kmRodado = 0f;
        float combustGasto = 0f;
        float mediaGastoCombust = 0f;
        
        System.out.println("Digite a KM rodada: ");
        kmRodado = leitor.nextFloat();
        
        System.out.println("Digite a quantidade de combustivel gasto: ");
        combustGasto = leitor.nextFloat();
        
        mediaGastoCombust = kmRodado / combustGasto;
        
        System.out.println("A media de consumo de combustivel por km foi de "
                    + mediaGastoCombust + " litros.");
    }
}
