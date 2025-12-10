package Exercicios.EC;

import java.util.Scanner;

public class Exercicio2EC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número impar ou par: ");
        numero = ler.nextInt();

        if (numero % 2 == 0){
            System.out.printf("%d é um número par!", numero);
        } else {
            System.out.printf("%d é um número ímpar!\n", numero);
        }
        ler.close();
    }
}

