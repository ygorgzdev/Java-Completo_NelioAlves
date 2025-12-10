package Exercicios.EC;

import java.util.Scanner;

public class Exercicio8EC {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double sal;

        System.out.println();
        System.out.print("Salário: ");
        sal = ler.nextDouble();

        System.out.println();
        if (sal > 0.00 && sal <= 2000.00) {
            System.out.println("Isento!");
        } else if (sal > 2000.00 && sal <= 3000.00) {
            System.out.printf("R$ %.2f",  ((sal - 2000.00) / 100 * 8) );
        } else if (sal > 3000.00 && sal <= 4500.00) {
            System.out.printf("R$ %.2f", ((1000 / 100 * 8) + (sal - 3000.00) / 100 * 18));
        } else if (sal > 4500.00) {
            System.out.printf("R$ %.2f", ((1000 / 100 * 8) + (1500 / 100 * 18) + (sal - 4500.00) / 100 * 28));
        }
        ler.close();
    }
}
