package ExercicioPOO4;

public class App {
  
    public static void main(String[] args) {
        
        Invoice inv = new Invoice (1,"mouse",10,
                    50.0f);
        
        System.out.print("O valor total da compra é: R$ " + 
                    inv.getInvoiceAmount());
    }
}
