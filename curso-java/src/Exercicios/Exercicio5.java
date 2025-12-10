package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner pec = new Scanner(System.in);

        int cod1, cod2, num1, num2;
        double v1, v2, total;

        System.out.print("Código peça 1: ");
        cod1 = pec.nextInt();
        System.out.print("Número de peças 1: ");
        num1 = pec.nextInt();
        System.out.print("Valor unitário 1: ");
        v1 = pec.nextDouble();

        System.out.println();
        System.out.print("Código peça 2: ");
        cod2 = pec.nextInt();
        System.out.print("Número de peças 2: ");
        num2 = pec.nextInt();
        System.out.print("Valor unitário 2: ");
        v2 = pec.nextDouble();

        total = num1 * v1 + num2 * v2;

        System.out.printf("Valor a pagar: R$%.2f", total);

        pec.close();
    }
}
