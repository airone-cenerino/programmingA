import java.io.*;

public class FileCopy {
   public static void main(String[] args) {
        int data = 0;
        try {
            InputStream is = new FileInputStream(args[0]);
            OutputStream os = new FileOutputStream(args[1]);
            while((data = is.read()) != -1) {
                //System.out.println(data);
                //System.out.print(data);
                //System.out.write(data);
                os.write(data);
            }
        } catch(Throwable throwable) {
            throwable.printStackTrace();
        }finally{
            is.close();
            os.close();
        }
    } 
}