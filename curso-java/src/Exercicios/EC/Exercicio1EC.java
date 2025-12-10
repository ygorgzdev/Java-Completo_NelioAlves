package Exercicios.EC;

import java.util.Scanner;

public class Exercicio1EC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número positivo ou negativo: ");
        numero = ler.nextInt();

        if (numero < 0){
            System.out.printf("%d é um número negativo!", numero);
        } else {
            System.out.printf("%d é um número positivo!", numero);
        }

        ler.close();

    }


}
