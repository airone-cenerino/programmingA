class StudentTest {
	
	public static void main(String[] args) {
		Student s1 = new Student("��", 80);
		Student s2 = new Student("�c��", 120);
		System.out.println(s1.getName() + "�͑��Ƃł���: " + s1.isOK());
		System.out.println(s2.getName() + "�͑��Ƃł���: " + s2.isOK());
	}

}
