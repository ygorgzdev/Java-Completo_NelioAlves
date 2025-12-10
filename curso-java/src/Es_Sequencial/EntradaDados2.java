package Es_Sequencial;

import java.util.Scanner;

public class EntradaDados2 {
    public static void main(String[] args) {

        // Só para de ler ao apertar Enter, e não somente com o espaço

        Scanner leitura = new Scanner(System.in);
        int altura;
             String nome;
             String mae;
             String pai;

            altura = leitura.nextInt();
            leitura.nextLine(); // nextLine para consumir a quebra de linha pendendo do Int
            nome = leitura.nextLine();
            mae = leitura.nextLine();
            pai = leitura.nextLine();

        System.out.println(altura + nome + mae + pai);
    }


}
