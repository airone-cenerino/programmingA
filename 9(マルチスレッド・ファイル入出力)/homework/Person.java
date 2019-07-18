public class Person {
	
	final private Address address;
	
	public Person(String s) {
		address = new Address(s);
	}
	
	public Address getAddress() {
		return address;
	}
	
	public String toString() {
		return "Living in " + address.getText()	;
	}
}
