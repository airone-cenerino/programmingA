import java.io.*;

/**
 * MultiTreeTest
 */
public class MultiThreeTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
            String line = reader.readLine();
            int number = Integer.parseInt(line);

            if(number%7==0){
                System.out.println("7‚Ì”{”‚Å‚·");
            }else{
                System.out.println("7‚Ì”{”‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
            }
        }catch(NumberFormatException e){
            System.out.println("®”‚ğ‘Å‚¿‚ñ‚Å‚­‚¾‚³‚¢");
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }   
}