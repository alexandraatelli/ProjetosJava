package ExercicioPOO3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        BombaCombustivel combustivel = new BombaCombustivel
            ("",0.00f,0.0f);
        
        System.out.print("Digite o tipo de combustivel: ");
        combustivel.setTipoCombustivel(leitor.nextLine());
        
        System.out.print("Digite o valor por litro: R$ ");
        combustivel.setValorLitro(leitor.nextFloat());
        
        System.out.print("Digite a quantidade de combustivel abastecida: ");
        combustivel.setQuantidade(leitor.nextFloat());
        //leitor.nextLine();
        
        System.out.print(combustivel.Itens() + "\n");
        
        combustivel.AlterarValorLitro(7.00f);
        combustivel.AlterarTipoCombustivel("alcool");
        combustivel.AlterarQuantidade(60);
        combustivel.AbastecerPorValor(200.00f);
        combustivel.AbastecerPorLitro(100.0f);
        
       
        System.out.print("\nValorLitro: R$ " + combustivel.getValorLitro() + "\n" 
                    + "Tipo: " + combustivel.getTipoCombustivel() + "\n"
                    + "Quantidade: " + combustivel.getQuantidade() + "\n"
                    + "Quantidade por Valor = litros: " + combustivel.getQuantidade() + "\n" 
                    + "Quantidade por Litro (quantidade): " 
                    + combustivel.AbastecerPorLitro(leitor.nextFloat()) + "\n"); 
        
        /*
        System.out.print(combustivel.MostrarAlteracoes()+ "\n");*/
    }
}
