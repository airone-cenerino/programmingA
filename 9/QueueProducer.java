class QueueProducer extends Thread {
	Queue queue = null;
	QueueProducer(Queue q) {
		queue = q;
	}
	
	public void run() {
		for (int i = 0; i < 30; i++) {
			queue.enqueue(i);
			System.out.println(getName() + " " + i + " �ǉ�");
			sleepRandomly();
		}
	}
	
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}
}
