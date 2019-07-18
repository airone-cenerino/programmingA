import java.util.Arrays;

public class StringMain {
	static String text = "helloworld";
	
	static void sort() {
		char[] textArray =  text.toCharArray();
		for(int i=0;i<textArray.length;i++){
			for(int j=textArray.length-1;j>i;j--){
                if (textArray[j - 1] > textArray[j]) {
                    // “ü‚ê‘Ö‚¦
                    char tmp = textArray[j - 1];
                    textArray[j - 1] = textArray[j];
                    textArray[j] = tmp;
				}			
			}
		}

		System.out.println(new String(textArray));
	}
	
	public static void main(String[] args) {
		sort();
	}
}
