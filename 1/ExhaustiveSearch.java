import java.util.*;

/**
 * ExhaustiveSearch
 */
public class ExhaustiveSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = 0;
        int[] list = new int[n * (n - 1)];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                list[k] = a[i] + a[i + j + 1];
                System.out.println(list[k]);
                k++;
            }
        }

        Arrays.sort(list);
        int q = Integer.parseInt(sc.next());

        for (int i = 0; i < q; i++) {
            int m = Integer.parseInt(sc.next());

            System.out.println(Arrays.binarySearch(list, m));

            if (Arrays.binarySearch(list, m) < 0) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

        sc.close();
    }
}