import java.util.Random;

public class Room {
    private Random random = new Random();
    
    public synchronized void rest() {
    	System.out.println("Start resting :" + Thread.currentThread().getName());
        try {
        	Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
        }
        System.out.println("End resting :" + Thread.currentThread().getName());
    }

}
