public class MessageHost {
	
	private final MessageHelper helper = new MessageHelper();
	
	public void request(final int number) {
		noNameInnerClass th = new noNameInnerClass(number);
		th.start();
	}
	
	class noNameInnerClass extends Thread {
		private int num;

		noNameInnerClass(int num){
			this.num = num;

		}
		
		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				helper.handle(num + i);
			}
		}
	}

	public static void main(String[] args) {
		MessageHost host = new MessageHost();
		host.request(10);
		host.request(100);
		host.request(1000);
	}
}
