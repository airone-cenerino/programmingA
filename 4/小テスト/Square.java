/**
 * Square
 */
public class Square {

    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            ans += i * i;
        }

        System.out.println("1から100までの平方数の和は" + ans + "です。");
    }
}