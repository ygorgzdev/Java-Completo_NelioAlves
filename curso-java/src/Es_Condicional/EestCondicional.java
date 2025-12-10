package Es_Condicional;

import java.util.Scanner;

public class EestCondicional {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        int hora;
        int dia;

        System.out.print("Idade: ");
        idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Pode ser preso já hein!");
        }

        System.out.println();
        System.out.print("Hora: ");
        hora = ler.nextInt();

        if (hora < 12 && hora > 5) {
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa tarde");
        }


        System.out.println();
        System.out.print("Dia da semana (numero): ");
        dia = ler.nextInt();

        if (dia == 6) {
            System.out.println("Bom sábado pra você, amigo");
        } else if (dia == 7 ) {
            System.out.println("Bom domingo Fi!");
        } else {
            System.out.println("Bom trabalho CLT Fudido!!");
        }


    }







}
