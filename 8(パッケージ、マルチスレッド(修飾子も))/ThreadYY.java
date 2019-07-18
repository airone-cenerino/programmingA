/**
 * ThreadYY
 */
public class ThreadYY implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("YY");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }        
        }
    }
}