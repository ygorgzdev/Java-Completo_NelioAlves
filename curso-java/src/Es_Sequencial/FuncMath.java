package Es_Sequencial;

public class FuncMath {

    public static void main(String[] args) {

        double x = 4.0;
        double y = 2.0;
        double z = 10.0;
        double g = -5.7;

        double A, B, C;

        A = Math.sqrt(x);
        B = Math.pow(y, z);
        C = Math.abs(g);

        System.out.println();
        System.out.println("Raiz quadrada de " + x + " é " + A + ", " + y + " elevado a " + z + " é " + B + " e o número absoluto de " + g + " é " + C);

    }
}
