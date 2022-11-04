package Heranca;

//importar a bibioteca que tem o tipo de dado Date que não é um tipo primitivo.

public class Vendedor extends Funcionario {
    
    private int totalItensVendidos;
    private float comissaoPorItem;

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    //utilizamos heranca: tem todas informacoes dele mais da classe funcionario,
    //que são informacoes comuns
    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

    //metodo construtor: super é para o vendedor ter tudo que o funcionario tem
    public Vendedor() {
        super();
    }
    
    //metodo calculo salario do vendedor
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }
}
