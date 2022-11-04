package ExercicioPOO4a;

public class App {
   
    public static void main(String[] args) {
        
        Invoice1 inv = new Invoice1(2, "mouse", 20, 
                    10.0f);
        
        System.out.print("O valor total da compra é: R$ " + 
                    inv.getInvoice1Amount());
    }
}
