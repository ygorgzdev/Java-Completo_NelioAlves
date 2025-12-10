package Es_Condicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num;
        String item;

        System.out.println("-----------> Lanchonete do gordão!");
        System.out.print("Digite o número do item: ");
        num = ler.nextInt();

        System.out.println();
        switch (num){
            case 1:
                item = "Misto";
                break;
            case 2:
                item = "Pão de queijo";
                break;
            case 3:
                item = "Coxinha";
                break;
            case 4:
                item = "Esfiha";
                break;
            case 5:
                item = "Bolo de chocolate";
                break;
            case 6:
                item = "Café";
                break;
            default:
                item = "Valor Inválido";
                break;
        }

        System.out.printf("O item escolhido foi %s", item);
        System.out.println();
        ler.close();

    }


}
