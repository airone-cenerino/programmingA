import java.util.ArrayList;
public class GcTest {
   static ArrayList<int[]> list
      = new ArrayList<int[]>();
   public static void main(String[] args) {
      while (true) {
         int[] a = new int[1000];
         for (int i = 0; i < 1000; i++) {
a[i] = i;
         }
         list.add(a);
         System.out.println("残りメモリ = "
   + Runtime.getRuntime().freeMemory());
      }
   }
}