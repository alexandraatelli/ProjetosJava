package TestaCadastro;

import java.util.Date;

public class Gerente extends Funcionario {

    public String area;

    public Gerente(String nome, Date nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return getSalario() * 0.05f;
    }

    @Override
    public String imprimeDados() {
        return "O nome do gerente eh: " + this.nome
                    + ", sua data e nascimento eh " + nascimento.getDataNascimento()
                    + ", seu salario eh " + Float.toString(this.salario)
                    + " e sua area eh " + this.area;
    }
}
