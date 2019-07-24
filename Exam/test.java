import java.util.*; 
import java.util.*;
import java.util.Random;
import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        Random random = new Random();
        random.nextInt(10);
        sc.nextLine();
        List<String> aList = new ArrayList<String>();
        aList.add("hello");
        for (String str : aList) {
            System.out.println(str);
        }
    }
}