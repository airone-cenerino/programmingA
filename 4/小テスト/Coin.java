import java.util.*;

public class Coin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int money[] = { 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

        for (int i = 0; i < 9; i++) {
            if (money[i] > 500) {
                System.out.println(money[i] + "�~�D�F " + n / money[i] + "��");
            } else {
                System.out.println(money[i] + "�~�ʁF " + n / money[i] + "��");
            }
            n -= money[i] * (n / money[i]);
        }

    }
}
