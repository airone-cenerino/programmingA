import java.util.*;

/**
 * Random
 */
public class problem4 {

    public static void main(String[] args) {
        Random random = new Random();
        double max = 0;
        double min = 100;
        double sum = 0;

        for (int i = 0; i < 1000; i++) {
            double num = random.nextDouble() * 100;

            sum += num;
            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        System.out.println("最大値は" + max + "です。");
        System.out.println("最小値は" + min + "です。");
        System.out.println("平均値は" + sum / 1000 + "です。");
    }
}