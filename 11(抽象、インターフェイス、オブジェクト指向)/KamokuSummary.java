import java.util.ArrayList;

/**
 * KamokuSummary
 */
public class KamokuSummary {

    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(80);
        list.add(100);
        list.add(90);
        list.add(75);
        list.add(90);

        for (int num : list) {
            sum += num;
            System.out.println(num);
        }

        System.out.println("‡Œv: " + sum);
        System.out.println("•½‹Ï: " + sum/list.size());
    }
}