package Es_Condicional;

import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();

        String sit = (idade >= 18) ? "Maior de idade!" : "Menor de idade!";

        System.out.println();

        System.out.println(sit);

        ler.close();

    }

}
