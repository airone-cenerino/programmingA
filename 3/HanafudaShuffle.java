import java.util.*;
import java.lang.*;

/**
 * HanafudaShuffle
 */
public class HanafudaShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            int n = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());

            // 配列初期化（上から考えている）
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = n - i - 1;
            }

            if (n == 0 && r == 0)
                break out_of_loop;

            for (int i = 0; i < r; i++) {
                int p = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());

            }
        }
    }
}