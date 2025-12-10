package Exercicios;

import  java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner soma = new Scanner(System.in);

        int a, b, total;

        System.out.print("Digite um número: ");
        a = soma.nextInt();
        System.out.print("Digite outro número: ");
        b = soma.nextInt();

        total = a + b;

        System.out.printf("A soma de %d e %d é igual a %d!", a, b, total );

        soma.close(); // Não esquecer de fechar
    }
}
