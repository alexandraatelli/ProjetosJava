package Heranca;

import java.util.Date;

public class App {
  
    public static void main(String[] args) {
        
        //instanciando objeto - chama o metodo construtor, se necessario.
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCPF("11111111111");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salario do vendedor é: " + v.calcularSalario());
    
        //v.setNome(nome); da erro pois codigos repetidos, aqui existe heranca.
        //Assim cria-se uma classe Funcionario.
        
        //se precisar mudar as informações de um de dois faria: Só que os dois 
        //objetos acima tem muitos codigos repetidos nas classes. A heranca quer
        //evitar  duplicação de codigo.
        
        
        //instanciando objeto - chama o metodo construtor, se necessario.
        Motorista m = new Motorista();

    }
}
