package ExercicioSeis;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String a = "";
        String b = "";
        String temp = "";
      
        
        System.out.println("Digite um valor para a: ");
        a = leitor.nextLine();
        
        System.out.println("Digite um valor para b");
        b = leitor.nextLine();
        
       temp = a;
       a = b;
       b = temp;
       
       System.out.println("a vale: " + a + " e b vale: " + b);
       
       
       
      
        
       
    }
}
