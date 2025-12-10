package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {


        Scanner cont = new Scanner(System.in);
        int a, b, c, d, prodA, prodB, dif;

        System.out.print("Digite o número 1: ");
        a = cont.nextInt();
        System.out.print("Digite o número 2: ");
        b = cont.nextInt();
        System.out.print("Digite o número 3: ");
        c = cont.nextInt();
        System.out.print("Digite o número 4: ");
        d = cont.nextInt();

        prodA = a * b;
        prodB = c * d;

        //dif = prodA - prodB;

        dif = (a * b) - (c * d);

        // Duas formas de fazer

        System.out.printf("A diferença é igual a %d!", dif);

        cont.close();

    }
}
