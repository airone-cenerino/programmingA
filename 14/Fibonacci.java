public class Fibonacci {

	public static int N = 9;
	
	public static void main(String[] args) {
		// Fibonacci sequence by recursion
		for(int i = 0; i < N + 1; i++) {
			System.out.print(fibonacciR(i) + ",");
		}
		System.out.println();
		
		// Fibonacci sequence by loop
		for(int i = 0; i < N + 1; i++) {
			System.out.print(fibonacciL(i) + ",");
		}
		System.out.println();
		
		// Fibonacci sequence by array
		int[] list = fibonacciSequenceByArray(N);
		for(int i = 0; i < N + 1; i++) {
			System.out.print(list[i] + ",");
		}
		System.out.println();
	}	
	
	public static int fibonacciR(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonacciR(n-1) + fibonacciR(n-2);
	}
	
	public static int fibonacciL(int n) {
		int last1 = 1;
		int last2 = 0;
		for(int i=2;i<=n;i++){
			int tmp = last1;
			last1 += last2;
			last2 = tmp;
		}
		return last1;
	}
	
	public static int[] fibonacciSequenceByArray(int n) {
		int[] list = new int[n + 1];
		list[0] = 0;
		list[1] = 1;
		for(int i=2;i<=n;i++){
			list[i] = list[i-1] + list[i-2];
		}
		return list;
	}
	
}
