public class Sorter {
	int[] values;

	Sorter(int[] temp) {
		this.values = temp;
	}

	void printArray() {
		int i;
		for (i = 0; i < values.length - 1; i++) {
			System.out.print(values[i] + ", ");
		}
		System.out.println(values[i]);
	}

	int binarySearch(int k) {
		int low = 0;
		int high = values.length - 1;

		while (true) {
			if (values[(low + high) / 2] == k) {
				return (low + high) / 2;
			} else if (low == high) {
				return -1;
			} else if (values[(low + high) / 2] > k) {
				high = (low + high) / 2;
			} else {
				low = (low + high) / 2 + 1;
			}
		}
	}

	void sortArray() {
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = values.length - 1; j > i; j--) {
				if (values[i] > values[j]) {
					int tmp = values[i];
					values[i] = values[j];
					values[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
		int key = 10000;

		Sorter sorter = new Sorter(array);
		sorter.printArray();
		System.out.println(key + " at " + sorter.binarySearch(key));
		sorter.sortArray();
		sorter.printArray();
		System.out.println(key + " at " + sorter.binarySearch(key));
	}

}
