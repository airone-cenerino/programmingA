import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriting
 */
public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter filewriter = null;
        try {
            File file = new File(args[0]);
            filewriter = new FileWriter(file);

            while(true){
                String str = sc.nextLine();
                if(str.equals("END")){
                    break;
                }
                filewriter.write(str + "\n");
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            filewriter.close();
            sc.close();
        }
    }
}