import java.util.Random;
import java.util.concurrent.locks.*;

public class Room {
    private Random random = new Random();
    private boolean flg = false;
    
    public void rest() {
        if(flg){
            return;
        }

        flg = true;
        synchronized(this){
        System.out.println("Start resting :" + Thread.currentThread().getName());

        try {
        	Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
        }

        System.out.println("End resting :" + Thread.currentThread().getName());
        flg = false;
        }
    }
}
