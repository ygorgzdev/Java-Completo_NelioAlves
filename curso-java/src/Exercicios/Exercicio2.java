package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner raio = new Scanner(System.in);

        double radio, area, A;

        System.out.print("Digite o valor do raio do círculo: ");
        radio = raio.nextDouble();
        System.out.println();

        A = Math.pow(radio, 2);

        area = 3.14159 * A;

        System.out.printf("A área do retangulo de raio %.2f é igual a %.4f!", radio, area);
        System.out.println();

        raio.close();

    }
}
