package ExercicioPOO3;

import java.util.Scanner;

public class BombaCombustivel {
    
      //atributos:
    private String tipoCombustivel;
    private float valorLitro;
    private float quantidade;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidade) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidade = quantidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    public String Itens(){
        return "Tipo de combustivel: " + getTipoCombustivel() + ". Valor por "
                    + "litro: R$ " + getValorLitro() + ". Quantidade de: "
                    + getQuantidade() + " litros.";
    }
    //alterar valor litro do combustivel
    public float AlterarValorLitro(float alterarValorLitro){
        return valorLitro = alterarValorLitro;
    }
    //alterar o tipo de combustivel
    public String AlterarTipoCombustivel(String alterarTipoCombustivel){
        return tipoCombustivel = alterarTipoCombustivel;
    }
    //alterar a quantidade de combustivel abastecida
    public float AlterarQuantidade(float alterarQuantidade){
        return quantidade = alterarQuantidade;
    }
    
    //Calcula quantos litros foi abastecido com um determinado valor em dinheiro.
    public float AbastecerPorValor(float abastecerPorValor){
        float resultado;
        resultado = abastecerPorValor / valorLitro;
        return quantidade = (int) resultado;
    }
    
    public float AbastecerPorLitro (float abastecerPorLitro){
        quantidade = abastecerPorLitro;
        return abastecerPorLitro * valorLitro; 
    }
}    



