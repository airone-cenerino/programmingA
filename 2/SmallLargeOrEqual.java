import java.util.*;

/**
 * SmallLargeOrEqual
 */
public class SmallLargeOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a > b");
        }
    }
}