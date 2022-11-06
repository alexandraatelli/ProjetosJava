package LanchoneteTresLanches;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args, Prato pizza1) {

        Scanner leitor = new Scanner(System.in);
        
        /*
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Jack Sparrow");
        cliente.setCpf("00000000001");

        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setCep("01001001");
        enderecoCliente.setLogradouro("Rua Leme que nao gira");
        enderecoCliente.setComplemento("02 - Convés");
        enderecoCliente.setBairro("Anarquia");
        enderecoCliente.setCidade("Tortuga");
        
        //setando valores para o Endereço me retornar na chamada do método
        cliente.setEndereco(enderecoCliente1);

        Telefone telefoneCliente = new Telefone();
        telefoneCliente.setTelefone("11995531708");

        //setando valores para o Endereço me retornar na chamada do método
        cliente.setTelefone(telefoneCliente1);

        //Retorna os dados do Cliente completo
        System.out.println(
                    cliente.getDadosClientePessoaFisica());

        //Banco Dados Fictício - retorna os tipos de pratos cadastrados na base de Dados
        BancoDeDados dB = new BancoDeDados();
        System.out.println(dB.populate());

        Pedido pedidoCliente = new Pedido();
       // pedidoCliente.setItensConsumidos(pizza1);
        
        Lanche Cliente = new Lanche();

        pedidoCliente.calcularPrecoPedido();
        pedidoCliente.calcularTaxaServico();
        pedidoCliente.calcularTotal();
        pedidoCliente.calcularTroco(0);
        */

           
        String nomeCliente;
        Cliente cliente = new Cliente();
        
        double valorTaxaServico;
        double totalRecebido;

        //Banco Dados Fictício - retorna os tipos de pratos cadastrados na base de Dados
        ArrayList<Prato> bancoDeDados = new ArrayList<Prato>();

        //Controla os pratos
        ArrayList<Prato> pratosPedidos = new ArrayList<Prato>();
        int contador = 1;
        int indiceDoPrato = 0;

        //Populando
        bancoDeDados = new BancoDeDados().populate();

        System.out.println("Cliente: ");
        cliente.setNomeCliente(leitor.toString());
        System.out.println("\n");

        System.out.println("Taxa de Serviço: ");
        valorTaxaServico = leitor.nextDouble();
        System.out.println("\n");

        System.out.println("Pratos: ");
        System.out.println("\n");

        for (Prato prato : bancoDeDados) {
            System.out.println(contador + " : " + prato.toString());
            contador++;
        }

        System.out.println("Informe o prato desejado ou -1 (zero) para Sair. \n");

        while (true) {

            System.out.println("Informe prato desejado: ");

            indiceDoPrato = leitor.nextInt();

            if (indiceDoPrato == 0) {
                System.out.println("Pedido finalizado!");
            } else if (indiceDoPrato >= 1 && indiceDoPrato < bancoDeDados.size()) {
                pratosPedidos.add(bancoDeDados.get(indiceDoPrato -1));
                System.out.println("Prato " + 
                            bancoDeDados.get(indiceDoPrato -1).getNome() + 
                                        " adicionado! \n");
            }else{
                System.out.println("Opção inválida! Favor informar uma opção válida. \n");
            }
        }
        
        Pedido pedido = new Pedido(nomeCliente, valorTaxaServico, pratosPedidos);
        
        System.out.println("Valor Total dos Pedidos: " + pedido.calcularPrecoPedido());
        
        System.out.println("Valor da Taxa de Serviço: " + pedido.calcularTaxaServico());
        
        System.out.println("Valor Total da Conta: " + pedido.calcularTotal());
        
        System.out.println("Valor recebido: " );
        totalRecebido = leitor.nextDouble();
        
        System.out.println("Nota Fiscal: ");
        System.out.println("Itens Consumidos: \n" + pedido.toString());
        System.out.println("Valor Total da Conta: \n" + pedido.calcularTotal());
        
        if(pedido.calcularTroco(totalRecebido) > 0){
            System.out.println("Valor do Troco: " 
                        + pedido.calcularTroco(totalRecebido) + "\n");
        }else{
            System.out.println("Recebimento menor que o valor total de Consumo!");
        }
        
        System.out.println("consumo finalizado!");
    }
}
