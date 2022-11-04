package ExercicioMediaIFSP;

public class NotasMediaAlunos {
    
    private float nota1;
    private float nota2;
    private float mediaNotas;
    
    public NotasMediaAlunos(float nota1, float nota2, float mediaNotas) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.mediaNotas = mediaNotas;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }
    
    public float MediaNotas(){
        mediaNotas = (nota1 + nota2) / 2;
        if (mediaNotas >= 6 && mediaNotas <= 10){
            System.out.print("Aprovado! media: ");
        }else if (mediaNotas >= 4 && mediaNotas < 6){
            System.out.print("Recuperacao! media: ");
        }else if ( mediaNotas >= 0 && mediaNotas < 4){
            System.out.print("Reprovado! media: ");
        }else{
            System.out.print("Entrada invalida! valor de: ");
        }
        return mediaNotas;
    }
}
