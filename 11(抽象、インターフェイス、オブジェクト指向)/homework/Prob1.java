import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Prob1
 */
public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order;
        int num;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(true){
            System.out.print(">");
            order = sc.next();

            if(order.equals("add")){
                num = sc.nextInt();
                list.add(num);
            }else if(order.equals("remove")){
                num = sc.nextInt();
                final int num2 = num;
                list.removeIf(a->{ return a==num2;});
            }else if(order.equals("list")){
                for (int n : list) {
                    System.out.print(n + ",");
                }
                System.out.println();
            }else if(order.equals("sum")){
                int sum = 0;
                for (int n : list) {
                    sum += n;
                }
                System.out.println(sum);
            }else if(order.equals("mean")){
                int sum = 0;
                for (int n : list) {
                    sum += n;
                }
                System.out.println(sum/list.size());
            }else if(order.equals("sort")){
                Collections.sort(list);
            }else if(order.equals("end")){
                break;
            }
        }
    }
}