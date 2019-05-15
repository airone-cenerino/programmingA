public class Container2 {
	int[] values;

	Container2(int[] temp) {
		this.values = temp;
	}

	void printArray() {
		int i;
		for (i = 0; i < values.length - 1; i++) {
			System.out.print(values[i] + ", ");
		}
		System.out.println(values[i]);
	}

	int search(int k) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
		int key = 10000;

		Container2 container2 = new Container2(array);
		container2.printArray();
		System.out.println(key + " at " + container2.search(key));
	}
}
