class UniversityTest {
	
	public static void main(String[] args) {
		University waseda = new University();
		Student[] s = new Student[] {
				new Student("“c’†", 100), 
				new Student("R–{", 50),
				new Student("X", 68),
		};
		waseda.students = s;
		waseda.list();
	}

}
