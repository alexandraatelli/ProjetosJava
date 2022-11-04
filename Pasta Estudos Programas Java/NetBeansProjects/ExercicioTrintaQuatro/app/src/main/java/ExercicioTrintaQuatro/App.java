package ExercicioTrintaQuatro;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int idade = 0;
        
        System.out.print("Digite a idade: ");
        idade = leitor.nextInt();
        
        if (idade >= 5 && idade <= 7){
            System.out.print("Infantil A");
        }else if (idade >= 8 && idade <= 10){
            System.out.print("Infantil B");
        }else if (idade >= 11 && idade <= 13){
            System.out.print("Juvenil A");
        }else if (idade >= 14 && idade <= 17){
            System.out.print("Juvenil B");
        }else if (idade >= 18 && idade <= 25){
            System.out.print("Senior");
        }else{
            System.out.print("Idade fora da faixa etária!");
        }
    }
}
