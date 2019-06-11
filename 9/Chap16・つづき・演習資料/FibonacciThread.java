public class FibonacciThread extends Thread {
	
	private int value = 0;
	
	public FibonacciThread(int v) {
		value = v;
	}
	
	public void run() {
		printFibonacci(value);
	}
	
	public static void printFibonacci(int n) {
		System.out.println(Thread.currentThread() + "" + fibonacci(n));
	}
	
	public static long fibonacci(int n) {
		return (n == 0 || n == 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) {
		long previousTime = 0;
		
		previousTime = System.currentTimeMillis();
		// HERE
		System.out.println("Time spent for multi-threaded execution: " 
				+ (System.currentTimeMillis() - previousTime));
		
		previousTime = System.currentTimeMillis();
		for(int i = 30; i < 40; i++) {
			printFibonacci(i);
		}
		System.out.println("Time spent for single-threaded execution: " 
				+ (System.currentTimeMillis() - previousTime));
	}
}