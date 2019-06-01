import java.io.IOException;

public class Length {
	
	public static char[] encode(char[] data) {
		char last = data[0];
		String ans = "";
		int num = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == last && num <= 8){
				num++;
			}else{
				ans += Integer.toString(num);
				ans += last;
				last = data[i];
				num = 1;
			}
		}

		ans += Integer.toString(num);
		ans += last;

		return ans.toCharArray();
	}
	
	public static char[] decode(char[] data) {
		String ans = "";

		for(int i=0;i<data.length/2;i++){
			try{
				for(int j=0;j<Integer.parseInt(String.valueOf(data[i*2]));j++){
					ans += data[i*2+1];
				}
			}catch(NumberFormatException e){
				e.printStackTrace();
				System.exit(0);
			}
		}

		return ans.toCharArray();
	}
	
	public static void print(char[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		char input[] = {
				'a','a','a','a','a','a','a','a','a','a',
				'b','b','b','b','b',
				'c','c',
		};
		print(input);
		print(encode(input));
		print(decode(encode(input)));
		print(decode(input)); 
	}
}
