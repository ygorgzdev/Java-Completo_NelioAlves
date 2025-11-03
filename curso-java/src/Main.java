import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int num = 345;

        double decimal = 12.45689;

        double x = 15.46758;

        double y = 23.763890;

        String nome = "Giovanna";
        int idade = 18;
        double salario = 780.56;

        System.out.print("Hello World!"); // Imprime sem quebra de linha no final
        System.out.println("Hello World!"); // Imprime e pula uma linha abaixo
        System.out.println(num); // Imprime o valor inteiro guardado na variável
        System.out.println(decimal); // Imprime o valor decimal guardadon na variável
        System.out.printf("%.2f%n", decimal); // %.2f implica que queremos somente 2 casas decimais. %n ou \n no final aciona a quebra de linha
        System.out.printf("%.4f", decimal); // Outro exemplo
        System.out.println("Nao pulou linha sem %n");
        Locale.setDefault(Locale.US); // Muda a localização para os EUA, de virgula pra ponto
        System.out.println(decimal);
        System.out.printf("Numero inteiro: " + num + " Numero decimal: " + decimal); // Concatenação de elementos usando +
        System.out.println();
        System.out.printf("Numero decimal %f\n", decimal);
        System.out.printf("%.2f\n", decimal);
        System.out.printf ("O número %.2f e o número %.3f são números de ponto flutuante\n", x, y);

        System.out.printf("A %s é muito linda. Ela tem %d anos e ganha %.1f na empresa em que trabalha", nome, idade, salario); // Cada tipo tem sua %f respectiva
    }
}