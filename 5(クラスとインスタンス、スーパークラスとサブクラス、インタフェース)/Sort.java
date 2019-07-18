public class Sort {

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static int binarySearch(int[] a, int k) {
		int low = 0;
		int high = a.length - 1;

		while (true) {
			if (a[(low + high) / 2] == k) {
				return (low + high) / 2;
			} else if (low == high) {
				return -1;
			} else if (a[(low + high) / 2] > k) {
				high = (low + high) / 2;
			} else {
				low = (low + high) / 2 + 1;
			}
		}
	}

	static void sortArray(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
		int key = 10000;
		printArray(array);
		System.out.println(key + " at " + binarySearch(array, key));
		sortArray(array);
		printArray(array);
		System.out.println(key + " at " + binarySearch(array, key));
	}
}
