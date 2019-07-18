public class PersonClient {
	
	public static void main(String[] args) {
		Person p = new Person("Tokyo");
		System.out.println(p);
		
		// HERE
		String st =  p.getAddress().getText();
		System.out.println(st);

		System.out.println(p);
	}

}
