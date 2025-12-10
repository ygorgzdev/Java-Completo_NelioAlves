package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double A, B, C, a, b, c, d, e;

        System.out.print("v1: ");
        A = ler.nextDouble();
        System.out.print("v2: ");
        B = ler.nextDouble();
        System.out.print("v3: ");
        C = ler.nextDouble();

        a = A * C/2;
        b = 3.14159 * C * C;
        c = ((A + B) * C)/2;
        d = B * B;
        e = A * B;

        System.out.printf("Area triangulo = %.2f\n", a);
        System.out.printf("Area circulo = %.2f\n", b);
        System.out.printf("Area trapezio = %.2f\n", c);
        System.out.printf("Area quadraddo = %.2f\n", d);
        System.out.printf("Area retangulo = %.2f\n", e);

        ler.close();





    }


}
