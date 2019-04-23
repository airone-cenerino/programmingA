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

        System.out.println("�ő�l��" + max + "�ł��B");
        System.out.println("�ŏ��l��" + min + "�ł��B");
        System.out.println("���ϒl��" + sum / 1000 + "�ł��B");
    }
}