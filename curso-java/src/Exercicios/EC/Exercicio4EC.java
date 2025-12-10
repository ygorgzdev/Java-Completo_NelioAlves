package Exercicios.EC;

import java.util.Scanner;

public class Exercicio4EC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int hi, hf;

        System.out.print("Hora inicial: ");
        hi = ler.nextInt();
        System.out.print("Hora final: ");
        hf = ler.nextInt();

        if (hf < hi) {
            hi = (24 - hi) + hf;
            System.out.printf("O jogo durou %d hora(s)!", hi);
        } else if (hi == hf) {
            System.out.println("O jogo durou 24 horas!");
        } else {
            System.out.println("O jogo durou " + (hf - hi) + " horas!");
        }

        ler.close();
    }




}
