package Es_Sequencial;

public class PdadoCasting {
    public static void main(String[] args) {


        int a, b, resultado, resultado1, resultado2, resultado3;

        a = 15;
        b = 29;

        resultado = a + b;
        resultado1 = a - b;
        resultado2 = (a * b) + a;
        resultado3 = (45 / a) + 42;

        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

        // Resultado para double

        int c = 2;
        int d = 5;

        double res = c * d;

        System.out.println(res);
        System.out.println();


        double h, base, B, area;

        h = 5;
        base = 6;
        B = 8;

        area = (base + B) / 2 * h;

        System.out.println(area);

        int v1, v2;

        v1 = 5;
        v2 = 2;

        double res2;

        res2 = (double) v1 / v2;

        System.out.println(res2);

        // Reverso

        double pr1 = 5.2;

        int pr2 = (int) pr1;

        System.out.println(pr2);


    }
}
