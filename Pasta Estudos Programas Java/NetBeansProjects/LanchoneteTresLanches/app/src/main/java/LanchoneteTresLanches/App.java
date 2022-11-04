package LanchoneteTresLanches;

public class App {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("Jack Sparrow");
        cliente1.setCpf("00000000001");

        Endereco enderecoCliente1 = new Endereco();
        enderecoCliente1.setCep("01001001");
        enderecoCliente1.setLogradouro("Rua Leme que nao gira");
        enderecoCliente1.setComplemento("02 - Convés");
        enderecoCliente1.setBairro("Anarquia");
        enderecoCliente1.setCidade("Tortuga");
        
        //setando valores para o Endereço me retornar na chamada do método
        cliente1.setEndereco(enderecoCliente1);

        Telefone telefoneCliente1 = new Telefone();
        telefoneCliente1.setTelefone("11995531708");

        //setando valores para o Endereço me retornar na chamada do método
        cliente1.setTelefone(telefoneCliente1);

        //Retorna os dados do Cliente completo
        System.out.println(
                    cliente1.getDadosClientePessoaFisica());

        //Banco Dados Fictício - retorna os tipos de pratos cadastrados na base de Dados
        BancoDeDados dB = new BancoDeDados();
        System.out.println(dB.populate());

        Pedido pedidoCliente1 = new Pedido();
       // pedidoCliente1.setItensConsumidos(pizza1);
        
        Lanche Cliente1 = new Lanche();
        
        
        /*
        pedidoCliente1.calcularPrecoPedido();
        pedidoCliente1.calcularTaxaServico();
        pedidoCliente1.calcularTotal();
        pedidoCliente1.calcularTroco(0);
        */
        
        
    }

}
