package agenda;

import java.util.Date;

public class Pessoa {
    
    private String nome;
    private Date dataConcepcao;
    private TipoPessoa tipoPessoa;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
      
        this.nome = nome;
    }

    public void setDataConcepcao(Date dataConcepcao) {
        this.dataConcepcao = dataConcepcao;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
   
}
