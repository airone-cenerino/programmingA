import java.util.*;
import java.lang.*;

/**
 * HowManyWays
 */
public class HowManyWays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ans = 0;

            int n = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());

            if (n == 0 && x == 0)
                break;

            // 1����n�܂ł̐���3�I��ő�����x������̂����p�^�[����
            for (int i = 1; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}