//pacotes:
package ExercicioVinteDois;

import java.util.Scanner;

public class App {

    //programa principal: main
    public static void main(String[] args) {

        //variaveis fora do for para que cada repetição nao crie novas 
        //variaveis. Evita o desperdicio de memoria.
        String nomeProduto;
        float precoCusto;
        float precoVenda;

        /*variaveis acumuladoras. 
        * Devem ser iniciadas, pois caso contr�rio o programa não entende 
        * o que deve ser lid0, pois realizando um cálculo.
        * Quando for fazer a primeira soma, dentro não tem valor nenhum e ai
        * retorna um erro. Por isso devem ser inicializada, com zero.
        */
        float totalCusto = 0.0f; //Sempre especificar o tipo "f"
        float totalVenda = 0.0f;

        //leitor das atribuições:
        Scanner leitor = new Scanner(System.in);

        /*
        *A variável "i" foi colocada fora do for porque o dentro dele, 
        *o escopo da variavel "i" e somente dentro da estrura. Colocando fora 
        * da estruta de repetição, ela vale para todo o metodo main
        * Isso foi feito porque necessita-se do numero de repetições desse laco
        * para podermos dividi-lo pelo total de custo e de venda.
        * Vamos utilizar ela fora do FOR - caso contrário seria colocado 
        * dentro do for.
         */
        int i = 0;
        for (; i < 4; i++) {
            
            //Lê o nome digitado e aloca na variável
            System.out.print("Digite o nome do produto: ");
            nomeProduto = leitor.next();
            
            System.out.print("Digite o preco de custo: ");
            precoCusto = leitor.nextFloat();

            System.out.print("Digite o preco de venda: ");
            precoVenda = leitor.nextFloat();

            //A cada repetição será guardado os valores dos pre�os de custo e
            // e de venda.
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            //compara os valores:
            if (precoCusto == precoVenda) {
                System.out.println("Empate nos pre�os!");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Prejuizo!");
                } else {
                    System.out.println("Lucro!");
                }
            }

            //Informar os valores para o usuário.
            System.out.println(nomeProduto + ", preco de custo = " + precoCusto
                        + ", preco de venda = " + precoVenda);
        }

        // Calcula a media dos preços de custo e venda dos produtos:
        System.out.println("A media do preco de custo e de: " + (totalCusto/i));
        System.out.println("A media do preco de venda e de: " + (totalVenda/i));
    }
}
