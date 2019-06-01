
class Person {
	String name = null;
	Person friend = null;
	Person(String s) {
		name = s;
	}
	
	void setFriend(Person p) {
		friend = p;
	}
}

public class GcHomework {
	
	public static void main(String[] args) {
		Person p1 = new Person("P1");
		Person p2 = new Person("P2");
		Person p3 = new Person("P3");
		p1.setFriend(p2);	// p1.friend = p2, p1.friend.friend = null
		p2.setFriend(p3);	// p2.friend = p3, p2.friend.friend = null
		p3.setFriend(p1);	// p3.friend = p1, p3.friend.friend = p2
		p1 = null;
		p2 = null;
		//p3 = null;
		System.gc();
	}
	
}
