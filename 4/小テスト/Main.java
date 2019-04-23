import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ans = random.nextInt(1000);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "回目： 0～999までの整数を入力してください。");
            int num = sc.nextInt();

            if (ans > num) {
                System.out.println("入力は正解よりも小さいです。");
            } else if (ans < num) {
                System.out.println("入力は正解よりも大きいです。");
            } else {
                System.err.println(i + "回目で正解です");
                return;
            }
        }

        System.out.println("正解は " + ans + " でした。Game Over");
    }
}