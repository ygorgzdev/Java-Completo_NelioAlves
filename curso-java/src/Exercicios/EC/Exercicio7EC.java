package Exercicios.EC;

import java.util.Scanner;

public class Exercicio7EC {

    public static void main(String[] args) {

        Scanner pnt = new Scanner(System.in);


        double x, y;

        System.out.print("Valor de x: ");
        x = pnt.nextDouble();
        System.out.print("Valor de y: ");
        y = pnt.nextDouble();

        System.out.println();
        if (x > 0 && y > 0 ) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if ( x == 0.00 && y == 0.00) {
            System.out.println("Origem"); // Daqui pra frente parte do eixo x
        } else if (x == 0.0) {
            System.out.println("Eixo X");
        } else if (y == 0.0) {
            System.out.println("Eixo Y");
        } else System.out.println("Q4");

        pnt.close();
    }
}
