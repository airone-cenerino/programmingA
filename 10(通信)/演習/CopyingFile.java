import java.io.*;

/**
 * CopyingFile
 */
public class CopyingFile {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int data = 0;
        InputStream is = null;
        OutputStream os = null;

        try {
            if(Boolean.valueOf(args[2])){
                is = new BufferedInputStream(new FileInputStream(args[0]));
                os = new BufferedOutputStream(new FileOutputStream(args[1]));

            }else{
                is = new FileInputStream(args[0]);
                os = new FileOutputStream(args[1]);
            }
            while((data = is.read()) != -1) {
                os.write(data);
            }
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            try{
                is.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            try{
                os.close();
            }catch(Exception e){
                e.printStackTrace();
            }

            long end = System.currentTimeMillis();
            System.out.println((end - start)  + "ms");
        }
    }
}