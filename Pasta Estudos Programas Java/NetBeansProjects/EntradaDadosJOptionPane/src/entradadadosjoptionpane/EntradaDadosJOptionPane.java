
package entradadadosjoptionpane;

import javax.swing.JOptionPane;

public class EntradaDadosJOptionPane {

    public static void main(String[] args) {
       
        //Cria grafico para entrar com a idade - uma caixinha. 
        //Converte tudo que o JoptionPane pegar.
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        System.out.println("A idade eh: " + idade + " anos!");
        JOptionPane.showMessageDialog(null, "A idade e " + idade + " anos!");
        JOptionPane.showMessageDialog(null, "A idade e " + idade + " anos!", "ATENCAO!!!", 1);
    }
    
}
