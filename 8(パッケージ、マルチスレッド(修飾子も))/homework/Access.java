package test;

class Access {

	String name = null;

	private Access() {
		super();
	}
	
	public Access(String s) {
		this();
		name = s;
	}
	
	protected void dosome() {
	}
}
	