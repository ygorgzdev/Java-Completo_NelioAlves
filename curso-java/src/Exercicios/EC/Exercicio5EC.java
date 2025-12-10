package Exercicios.EC;

import java.util.Scanner;

public class Exercicio5EC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("----------- Gordão Lanches ------------");
        System.out.println("Ecolha seu lanche! Todos são deilciosos!");
        System.out.println("1. Cachorro Quente ------ R$ 4,00 ");
        System.out.println("2. X-Salada ------------- R$ 4,50 ");
        System.out.println("3. X-Bacon -------------- R$ 5,00 ");
        System.out.println("4. Torrada simples ------ R$ 3,00 ");
        System.out.println("5. Refrigerante --------- R$ 1,50 ");

        int num, qtd;
        double x1 = 4.00, x2 = 4.50, x3 = 5.00, x4 = 3.00, x5 = 1.50;

        System.out.println();
        System.out.print("Digite o número do item: ");
        num = ler.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        qtd = ler.nextInt();

        System.out.println();
        if (num == 1) {
            System.out.printf("Total a pagar: R$ %.2f", (x1 * qtd) );
        }
        if (num == 2) {
            System.out.printf("Total a pagar: R$ %.2f", (x2 * qtd) );
        }
        if (num == 3) {
            System.out.printf("Total a pagar: R$ %.2f", (x3 * qtd));
        }
        if (num == 4) {
            System.out.printf("Total a pagar: R$ %.2f", (x4 * qtd) );
        }
        if (num == 5) {
            System.out.printf("Total a pagar: R$ %.2f", (x5 * qtd) );
        }

        ler.close();
        // Else if seria melhor pois para quando 1 é verdadeira
        //Vários if: todas as condições são testadas, mesmo que uma já seja verdadeira.
        //if/else if: para na primeira condição verdadeira; as seguintes não são testadas.
        // Na maioria dos casos a diferença é irrelevante

    }

}
