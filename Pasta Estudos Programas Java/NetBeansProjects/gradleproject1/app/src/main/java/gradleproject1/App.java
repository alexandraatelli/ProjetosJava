package gradleproject1;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int n;
        String w;
        
        System.out.print("Digite n: ");
        n = leitor.nextInt();
        leitor.nextLine();
        
        System.out.print("Digite w: ");
        w = leitor.nextLine();
        
        if((n >= 0 && n <= 100) && (w.length() > 0 && w.length() <= 50)){
            for(int i = 0; i < n; i++){
            System.out.print(w.trim() + "\n");}
        }else{
             System.out.print("Valor deve ser entre 0 e 100 e a palavra entre 1 e 50 caracteres!");        
        }
    }
}
