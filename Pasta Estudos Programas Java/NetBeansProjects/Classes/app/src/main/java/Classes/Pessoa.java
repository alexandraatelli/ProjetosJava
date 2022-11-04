package Classes;

//Cada classe vai ter apenas os métodos que corresponde ao gerenciamento do seu
//dos seus dados. IMC trabalha com os dados da pessoa por exemplo. Caso essa 
//aplicação expanda, os comportamentos daquela entidade estará dentro dela, e 
//não dentro da classe pessoa. Isso organiza o código.
// Representa a entidade do mundo real dentro do algoritmo.
// Quais informações são necessárias para resolver o problema? ex: imc
public class Pessoa {

    //Atributos: 
    //modela a entidade pessoa (so informacoes "necessarias" para resolver)
    //Se não consta o modificador de acesso, significa que é publico. Por isso 
    //os demais casos devem ser explicitos na descrição, como o private
    private float peso;
    private float altura;
    
    //Metodo Construtor: ele é executado quando chamado. É chamado quando um
    //objeto é instanciado, exemplo objetoPessoa.
    //Recebe o mesmo nome da classe
    public Pessoa(float peso, float altura){
        //posso passar na criação do metodo la no main
        this.peso = peso;
        this.altura = altura;
        
        //"this": temos o parametro peso e o atributo peso. O this diz que quer-se
        //acessar o atributo peso, e nao o paramentro peso. Pensando no objeto,
        // o meu atributo vai ter zero. Assim o metodo construtor vai pegar o 
        // esse parametro de peso e vai definir como peso da pessoa, diante do 
        //parametro passado la no Main na instancia do objeto
        // o this serve para informar: MUDA O ATRIBUTO PESO.
        
        //metodo construtor so é necessario quando quero passar um valor 
        //default. Como passar valor quando o objeto e criado?
        //usa-se o recurso de parametros, passamos parametros para os metodos.
        
        //System.out.print("Executando o metodo construtor");
    }

    //Metodos: a acoes que a entidade realiza dentro do sistema
    // Tem regras pre definidas, modelos
    //(basicamente uma funcao ou um procedimento)
    // float me diz qual informacao o metodo retornara, aqui um valor float
    // O retorno poderia ser qualquer outro tipo, depende da necessidade.
    // calculo IMC é o nome do método - descreve o que aquele algoritmo faz.
    // Todos os metodos tem que ter o nome no infinitivo: calcular, apagar...
    public float calcularIMC() {

        float imc = peso / (altura * altura);
        return imc;

    }

    //Objetos: será criado na classe do método Main - lá no APP.
    //Métodos acessores: que dão acesso a entidades externas acessar as 
    //informações dessas classe que não são publicas, como exemplo a private 
    //dentre outras. São eles: Get e Set.
    public void setPeso(float peso) {
        this.peso = peso;
        //seta o peso da pessoa com o valor que o usuario digitar
    }
    // aqui poderiamos fazer uma validacao de dados.

    // o get
    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        //seta a altura da pessoa com o valor que o usuario digitar
    }

    public float getAltura() {
        return altura;
    }
}
