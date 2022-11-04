//entidade do mundo real é modelada dentro do algoritmo, via classe que descreve
//essa entidade.
package Classes;

//leitor
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //criar vaiaveis para guardar os valores de entrada na estrutura. Mas
        // na POO ao inves disso cria-se uma pessoa.
        //float peso;
        //float altura;
        //Variável do tipo pessoa - dentro dela já tem o peso e altura - 
        //nao primitiva. O new faz a variavel tipo pessoa existir - cria ela
        //na memoria. Ela é chamada de objeto (objetoPessoa é o nome desse 
        //objeto)
        Pessoa objetoPessoa = new Pessoa();//executa o metodo construtor quando
        //esse trecho de código é executado...ocorre quando instanciamos um
        //objeto

        //float imc; não é mais necessário
        Scanner leitor = new Scanner(System.in);

        //Aqui solicito os dados e os leios. São atribuidos as variaveis. 
        //Mas na POO eu leio as informações para dentro do objetoPessoa
        System.out.print("Digite o peso: ");
        //peso = leitor.nextFloat();
        //objetoPessoa.peso = leitor.nextFloat();
        objetoPessoa.setPeso(leitor.nextFloat());//o objetoPessoa muda o 
        //peso dele o objetoPessoa que gerencia suas informações, e todos os 
        //atributos da privados da classe são acessados através dos métodos 
        //acessores.
        System.out.print("Digite a altura: ");
        //altura = leitor.nextFloat();
        //se fosse publico seria assim:
        //objetoPessoa.altura = leitor.nextFloat();
        objetoPessoa.setAltura(leitor.nextFloat());

        //Não precisa mais:
        //imc = peso / (altura * altura);
        objetoPessoa.getPeso(); // a pessoa me da o peso dela, eu não acesso 
        //diretamente

        //Pega os dados, leva para o metodo imc, calcula e me devolve um float
        //aqui. Ocorre quando essa linha é executada.
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
        
        //Todos os atributos da classe privados, somente sao acessados pelos
        //metodos acessores. 
        
        //Quando falamos de modificadores de acesso, estamos falando de:
        // 1 Principio de Encapsulamento;
        // 2 De garantir segurança as informacoes de cada objeto.

    }
}
