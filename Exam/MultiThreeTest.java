import java.io.*;

/**
 * MultiTreeTest
 */
public class MultiThreeTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("数値を入力してください");
            String line = reader.readLine();
            int number = Integer.parseInt(line);

            if(number%7==0){
                System.out.println("7の倍数です");
            }else{
                System.out.println("7の倍数ではありません");
            }
        }catch(NumberFormatException e){
            System.out.println("整数を打ち込んでください");
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }   
}