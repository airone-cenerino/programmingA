class ParkTest {
	public static void main(String[] args) {
		Park.setCommon("Œö‰€");
		Park p1 = new Park();
		Park p2 = new Park();
		p1.setName("ã–ì");
		p2.setName("ŒËR");
		p1.print();
		p2.print();
		Park.setCommon("Park");
		p1.print();
		p2.print();
	}
}
