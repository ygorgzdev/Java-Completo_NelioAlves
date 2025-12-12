package Exercicios.ER;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x, y;

        System.out.print("Digite X: ");
        x = ler.nextInt();
        System.out.print("Digite Y: ");
        y = ler.nextInt();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0){
                System.out.println("primeiro \n");
            } else if (x < 0 && y > 0){
                System.out.println("segundo \n");
            } else if (x < 0 && y < 0){
                System.out.println("terceiro \n");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto \n");
            }

            System.out.print("Digite X: ");
            x = ler.nextInt();
            System.out.print("Digite Y: ");
            y = ler.nextInt();
        }

        ler.close();
    }


}
