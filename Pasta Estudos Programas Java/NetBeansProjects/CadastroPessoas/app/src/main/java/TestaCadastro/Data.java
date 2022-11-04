package TestaCadastro;

public class Data {

    private int ano;
    private int mes;
    private int dia;

    public Data(int ano, int mes, int dia) {

        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
     public String getDataNascimento() {
        return ano + "/" + mes + "/" + dia;
    }  
    
    
    // Integer.toString devolve uma String
    
    public String getDataNascimento() {
        return Integer.toString(ano) + "/" + 
                    Integer.toString(mes) + "/" + 
                    Integer.toString(dia);
    }
}
