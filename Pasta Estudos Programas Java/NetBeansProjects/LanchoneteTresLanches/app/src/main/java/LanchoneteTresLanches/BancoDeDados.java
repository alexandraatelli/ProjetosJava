package LanchoneteTresLanches;

import java.util.ArrayList;

public class BancoDeDados {
    
    //Uma classe ArrayList para simular um banco de dados
    public ArrayList<Prato> pratos;

    //metodo que popula o banco de dados
    public ArrayList<Prato> popular() {

        //pratos recebe nova instancia de ArrayList
        pratos = new ArrayList<Prato>();

        Pizza pizza1 = new Pizza("Pizza Calabresa", 40, "08/09/2022", 0.80, "Molho de tomate", "calabresa, cebola e azeitonas", "sem borda recheada");
        Pizza pizza2 = new Pizza("Pizza Mussarela", 40, "08/09/2022", 0.80, "Molho de tomate", "mussarela, tomate, oregano e azeitonas", "sem borda recheada");
        Pizza pizza3 = new Pizza("Pizza Frango Cataupiry", 55, "08/09/2022", 0.80, "Molho de tomate", "frango desfiado, catupiry, milho e azeitonas", "sem borda recheada");

        Lanche lanche1 = new Lanche("Bauru", 15, "08/09/2022", 0.15, "Pão frances", "Presunto, mussarela e tomate", "sem molho");
        Lanche lanche2 = new Lanche("Misto quente", 10, "08/09/2022", 0.10, "Pão frances", "Presunto e mussarela", "sem molho");

        Salgadinho salgadinho1 = new Salgadinho("Coxinha", 5, "08/09/2022", 0.1, "Frango desfiado", "Massa de batata");
        Salgadinho salgadinho2 = new Salgadinho("Kibe", 5, "08/09/2022", 0.1, "Soh deus sabe", "Massa arabe");

        pratos.add(pizza1);
        pratos.add(pizza2);
        pratos.add(pizza3);

        pratos.add(lanche1);
        pratos.add(lanche2);

        pratos.add(salgadinho1);
        pratos.add(salgadinho2);

        return pratos;
    }

    static class popular extends ArrayList<Prato> {

        public popular() {
        }
    }
}
