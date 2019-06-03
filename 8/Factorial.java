public class Factorial {
	
	public static int factorial1(int n){
		int ans=1;
		for(int i=2;i<=n;i++){
			ans*=i;
		}
		return ans;
	}

	public static int factorial2(int n){
		if(n==0){
			return 1;
		}
		return n * factorial2(n-1);
	}

	public static int factorial3(int n){
		long ans=1;
		for(int i=2;i<=n;i++){
			ans*=i;

			if(ans>Integer.MAX_VALUE){
				throw new RuntimeException();
			}
		}
		return (int)ans;
	}

	public static void main(String[] args) {
		System.out.println(factorial1(0));
		System.out.println(factorial2(0));
		System.out.println(factorial1(10));
		System.out.println(factorial2(10));
		System.out.println(factorial3(13));
	}
}