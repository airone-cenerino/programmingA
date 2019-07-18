public class GCD_LCM {
	
	public static int gcd1(int a, int b){
		while(true){
			if(a<b){
				int tmp = a;
				a = b;
				b = tmp;
			}
	
			int r = a%b;
			if(r==0) return b;
		}
	}
	
	public static int gcd2(int a, int b) {
		if(a<b){
			int tmp = a;
			a = b;
			b = tmp;
		}

		int r = a%b;
		if(r==0) return b;
		else return gcd2(b,r);
}
	
	public static int lcm(int a, int b) {
		return a * b / gcd2(a,b);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd1(6, 3));
		System.out.println(lcm(6, 3));
		System.out.println(gcd2(6, 8));
		System.out.println(lcm(6, 8));
	}
}
