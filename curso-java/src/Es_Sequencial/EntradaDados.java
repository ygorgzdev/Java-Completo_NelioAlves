package Es_Sequencial;

;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        // Usando Scanner

        String nome;

        Scanner leitura = new Scanner(System.in); // Boa prática, dar um leitura.close() quando não usarmos mais o scanner

        nome = leitura.next(); // leitura vem do Scanner

        System.out.println("Seu nome é " + nome);

        System.out.println();

        // Número inteiro

        int idade;

        // Scanner lerInt = new Scanner(System.in); nao preciso criar outro Scanner

        idade = leitura.nextInt();

        System.out.println("Você tem " + idade + " anos ");

        System.out.println();

        // Double

        Double altura;

        altura = leitura.nextDouble();

        System.out.println("Sua altura é " + altura);

        System.out.println();


        // Char

        char sexo;

        sexo = leitura.next().charAt(0);

        System.out.println("Seu sexo é " + sexo);

        System.out.println();

        // Juntado tudo

        String nome2;
        double altura2;
        int idade2;
        char sexo2;

        nome2 = leitura.next();
        altura2 = leitura.nextDouble();
        idade2 = leitura.nextInt();
        sexo2 = leitura.next().charAt(0);

        // Posso digitar separando por espaço ou dando enter:
        // Ygor 1,86 20 Masculino
        // Seu nome é Ygor, sua altura é 1.86, sua idade é 20 e seu sexo é M


        System.out.println("Seu nome é " + nome2 + ", sua altura é " + altura2 + ", sua idade é " + idade2 + " e seu sexo é " + sexo2);





      //  double contaBar = 66,13;
        //Strinng nome =

        leitura.close();

    }
}
