/**
 * Fibonatch
 */
public class Fibonatch {

    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        int b = 1;

        while (true) {
            System.out.println("F[" + n + "]=" + a);

            if (a > 10000)
                break;

            int tmp = b;
            b = a + b;
            a = tmp;
            n++;
        }
    }
}