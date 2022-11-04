package ExerciciosJava1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        /*
        int n1;
        System.out.print("Digite um numero: ");
        n1 = leitor.nextInt();
        leitor.nextLine();
        System.out.println("O numero digitado é: " + n1);

        float n2;
        System.out.print("Digite um numero: ");
        n2 = leitor.nextFloat();
        System.out.println("O numero digitado é: " + n2);

        float n3;
        System.out.print("Digite um numero: ");
        n3 = leitor.nextFloat();
        System.out.println("O numero digitado é: " + n3);
        if (n3 <= 50) {
            System.out.print("O numero digitado é menor ou igual a 50! \n");
        }

        float n4;
        System.out.print("Digite um numero: ");
        n4 = leitor.nextFloat();
        System.out.println("O numero digitado é: " + n4);
        if (n4 < 100) {
            System.out.print("O numero digitado é menor que 100! \n");
        } else if (n4 >= 100) {
            System.out.print("O numero digitado é maior ou igual a 100! \n");
        }

        int n5;
        System.out.print("Digite um numero: ");
        n5 = leitor.nextInt();
        if (n5 % 2 == 0) {
            System.out.print("Par! \n");
        } else {
            System.out.print("Impar! \n");
        }

        //ex6
        float a;
        float b;
        System.out.print("Digite um numero: ");
        a = leitor.nextFloat();
        System.out.print("Digite um numero: ");
        b = leitor.nextFloat();
        if (a == 0) {
            System.out.print(" a igual a zero \n");
        } else if (b < 0) {
            System.out.print("b menor que zero \n");
        } else if (a > 0 && b > 0) {
            System.out.print("a e b são maior que zero \n");
        }

        //ex7 idem ex06
        //ex8
        int n8;
        int n8a;
        int n8b;
        System.out.print("Digite um numero: ");
        n8 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n8a = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n8b = leitor.nextInt();
        leitor.nextLine();
        if (n8 > n8a || n8 > n8b) {
            System.out.print(n8 + " é maior \n");
        } else if (n8a > n8 || n8a > n8b) {
            System.out.print(n8a + " é maior \n");
        } else {
            System.out.print(n8b + " é maior \n");
        }

        //ex9
        int n9;
        int n9a;
        int n9b;
        System.out.print("Digite um numero: ");
        n9 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n9a = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n9b = leitor.nextInt();
        leitor.nextLine();
        if (n9 < n9a || n9 < n9b) {
            System.out.print(n9 + " é menor \n");
        } else if (n9a < n9 || n9a < n9b) {
            System.out.print(n9a + "é menor \n");
        } else {
            System.out.print(n9b + "é menor \n");
        }

        
        //ex10 - verificar
        int n10;
        int n10a;
        int n10b;
        System.out.print("Digite um numero: ");
        n10 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n10a = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n10b = leitor.nextInt();
        leitor.nextLine();
        if (n10 < n10a) {
            if (n10a < n10b) {
                System.out.print(n10 + "\n" + n10a + "\n" + n10b + "\n");
            } else if (n10 < n10b) {
                System.out.print(n10 + "\n" + n10b + "\n" + n10a + "\n");
            } else {
                System.out.print(n10b + "\n" + n10 + "\n" + n10a + "\n");
            }
        } else if (n10a < n10b) {
            if (n10 < n10b) {
                System.out.print(n10a + "\n" + n10 + "\n" + n10b + "\n");
            } else {
                System.out.print(n10a + "\n" + n10b + "\n" + n10 + "\n");
            }
        } else {
            System.out.print(n10b + "\n" + n10a + "\n" + n10 + "\n");
        }
        
        //ex11 - verificar
        int n11a;
        int n11b;
        System.out.print("Digite um numero: ");
        n11a = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite um numero: ");
        n11b = leitor.nextInt();
        leitor.nextLine();
        if (n11a % n11b == 0){
            System.out.println(n11a + " multiplo de: " + n11b + "\n");
        }else if (n11b % n11a == 0){
            System.out.println(n11b + " multiplo de: " + n11a + "\n");
        }
         
        //ex12
        float valorUnitario = 0f;
        int quantidade = 0;
        float valorTotal = 0f;
        System.out.print("Qual a quantidade de copos: ");
        quantidade = leitor.nextInt();
        leitor.nextLine();
        if (quantidade <= 100) {
            valorUnitario = 0.05f;
        } else if (quantidade > 100 && quantidade <= 500) {
            valorUnitario = 0.04f;
        } else if (quantidade > 500) {
            valorUnitario = 0.035f;
        }

        valorTotal = quantidade * valorUnitario;
        System.out.print("O valor total a pagar é de: R$ " + valorTotal + "\n");
         
        //ex13
        //Triangulo
        float lado1 = 0f;
        float lado2 = 0f;
        float lado3 = 0f;
        System.out.print("Digite o lado 1: ");
        lado1 = leitor.nextFloat();
        System.out.print("Digite o lado 2: ");
        lado2 = leitor.nextFloat();
        System.out.print("Digite o lado 3: ");
        lado3 = leitor.nextFloat();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.print("Triangulo Equilátero!");
        } else if (lado1 == lado2 && lado2 != lado3) {
            System.out.print("Triangulo Isóceles!");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.print("Triangulo Escaleno!");
        }
        
        //ex14
        float n1 = 0f;
        float n2 = 0f;
        float n3 = 0f;
        System.out.print("Digite o n1: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite o n2: ");
        n2 = leitor.nextFloat();
        System.out.print("Digite o n3: ");
        n3 = leitor.nextFloat();
        float media = (n1 + n2 + n3) / 3;
        if (media >= 7 && media <= 10){
          System.out.print("Aprovado");
        }else if (media < 3){
              System.out.print("Reprovado");
        }else if (media >= 3 && media < 7){
          System.out.print("Recuperacao"); 
        }
        */
        
        //ex15
        float x = 0f;
        float y = 0f;
        System.out.print("Digite o valor de x: ");
        x = leitor.nextFloat();
        System.out.print("Digite o valor de x: ");
        y = leitor.nextFloat();
        System.out.print("Os valores de x e y são respectivamente: " + x + ", " + y + ".\n");
        System.out.print("A soma de x e y é: " + (x + y) + "\n");
        
        
        
        
        
    }
}
