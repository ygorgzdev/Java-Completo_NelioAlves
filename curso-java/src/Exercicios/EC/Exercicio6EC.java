package Exercicios.EC;

import java.util.Scanner;

public class Exercicio6EC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double val;

        System.out.print("Digite um valor qualquer: ");
        val = ler.nextDouble();

        System.out.println();
        if (val > 0 && val <= 25.00) {
            System.out.println("Intervalo [0, 25]");
        } else if (val > 25.00 && val <= 50.00) {
            System.out.println("Intervalo [25, 50]");
        } else if (val > 50.00 && val <= 75.00) {
            System.out.println("Intervalo [50, 75]");
        } else if (val > 75.00 && val <= 100.00) {
            System.out.println("Intervalo [75, 100]");
        } else System.out.println("Fora de intervalo!");

        ler.close();
    }

}
