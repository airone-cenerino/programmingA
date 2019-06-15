public class Scanner extends Thread {
	public String data = null;

	public void run() {
		while(true) {
			synchronized(this){
				if(data == null) {
					data = "’l‚ªİ’è‚³‚ê‚Ä‚¢‚Ü‚·";
					System.out.println("scan: " + data);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		Fax fax = new Fax(scanner); 
		scanner.start();
		fax.start();
	}
}

class Fax extends Thread {
	Scanner scanner = null;

	public Fax(Scanner s) {
		super();
		scanner = s;
	}

	public void run() {
		while(true) {
			synchronized(scanner){
				if(scanner.data != null) {
					System.out.println("fax : " + scanner.data);
					scanner.data = null;
				}
			}
		}
	}
}
