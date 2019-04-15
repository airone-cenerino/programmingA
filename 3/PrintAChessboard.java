import java.util.*;
import java.lang.*;

/**
 * PrintAChessboard
 */
public class PrintAChessboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());

            if (h == 0 && w == 0)
                break out_of_loop;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if ((j + i) % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }

                System.out.println("");
            }

            System.out.println("");
        }

        sc.close();

    }
}