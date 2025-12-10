package Es_Repetitiva;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = ler.nextInt();

        int soma = 0;

        while (x != 0){
            soma += x;  // Ou soma = soma + x;
            System.out.printf("Digite outro número: ");
            x = ler.nextInt();
        }

        System.out.println("Soma: " + soma);

        ler.close();

    }

}
