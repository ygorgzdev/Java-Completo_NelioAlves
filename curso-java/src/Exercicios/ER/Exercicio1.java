package Exercicios.ER;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a senha da porta: ");
        int senha = ler.nextInt();

        while ( senha != 2002) {
            System.out.println();
            System.out.println("Senha inválida!");
            System.out.println();
            System.out.print("Digite novamente: ");
            senha = ler.nextInt();
        }

        System.out.println();
        System.out.println("Acesso Permitido!");

        ler.close();

    }


}
