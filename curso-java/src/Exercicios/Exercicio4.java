package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);

        int num, hrt;
        double vhora, res;

        System.out.print("Digite o número do funcionario: ");
        num = sal.nextInt();
        System.out.print("Digite horas trabalhadas: ");
        hrt = sal.nextInt();
        System.out.print("Digite o valor da hora: ");
        vhora = sal.nextDouble();

        res = hrt * vhora;

        System.out.println();
        System.out.printf("Número do funcionário = %d\n", num);
        System.out.printf("Salário do funcionário = U$%.2f", res);

        sal.close();

    }
}
