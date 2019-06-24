import java.util.Arrays;

/**
 * StringMain2
 */
public class StringMain2 {
    static String text = "helloworld";

    void sort() {
        char[] textArray =  text.toCharArray();
        for(int i=0;i<textArray.length;i++){
            for(int j=textArray.length-1;j>i;j--){
                if (textArray[j - 1] > textArray[j]) {
                    char tmp = textArray[j - 1];
                    textArray[j - 1] = textArray[j];
                    textArray[j] = tmp;
                }			
            }
        }

        System.out.println(new String(textArray));
    }
    
    public static void main(String[] args) {
        StringMain2 strMain2 = new StringMain2();
        strMain2.sort();
    }  
}