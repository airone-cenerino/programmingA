public class Container {

	static void printArray(int[] a) {
		int i;
		for (i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[i]);
	}

	static int search(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
		int key = 10000;
		printArray(array);
		System.out.println(key + " at " + search(array, key));
	}
}
