import java.io.*;

/**
 * MultiTreeTest
 */
public class MultiThreeTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("���l����͂��Ă�������");
            String line = reader.readLine();
            int number = Integer.parseInt(line);

            if(number%7==0){
                System.out.println("7�̔{���ł�");
            }else{
                System.out.println("7�̔{���ł͂���܂���");
            }
        }catch(NumberFormatException e){
            System.out.println("������ł�����ł�������");
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }   
}