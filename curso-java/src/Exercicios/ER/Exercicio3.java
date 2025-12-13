package Exercicios.ER;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Selecione o tipo de combustível: ");
        System.out.println(" - 1. Alcool \n - 2. Gasolina \n - 3. Diesel \n - 4. Fim");
        System.out.print("Digite o número: ");
        int x = ler.nextInt();
        int gas = 0, alc = 0, die = 0;

        if (x == 1){
            alc = alc + 1;
        } else if (x == 2){
            gas = gas + 1;
        } else if (x == 3){
            die = die + 1;
        }

        while (x != 1 && x != 2 && x !=3 && x != 4){

            System.out.println();
            System.out.println("Código Inválido!!!!!");
            System.out.print("Digite novamente: ");
            x = ler.nextInt();
        }

        System.out.println();

        while (x == 1 || x == 2 || x ==3) {

            System.out.println("Selecione o tipo de combustível: ");
            System.out.println(" - 1. Alcool \n - 2. Gasolina \n - 3. Diesel \n - 4. Fim");
            System.out.print("Digite o número: ");
            x = ler.nextInt();

            if (x == 1){
                alc = alc + 1;
            } else if (x == 2){
                gas = gas + 1;
            } else if (x == 3){
                die = die + 1;
            }

        }

        System.out.println();
        System.out.println("Clientes -> ");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
        System.out.println("MUITO OBRIGADO!");

        ler.close();
    }



}
