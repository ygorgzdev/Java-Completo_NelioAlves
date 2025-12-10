package Exercicios.EC;

import java.util.Scanner;


public class Exercicio3EC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A, B;

        System.out.print("Numéro 1: ");
        A = ler.nextInt();
        System.out.print("Número 2: ");
        B = ler.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.printf("Os números %d e %d são múltiplos!", A, B);
        } else System.out.printf("Os números %d e %d não são múltiplos!", A, B);
    }
}
