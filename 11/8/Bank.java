import java.util.Random;

/**
 * Bank
 */
public class Bank {
    public int accountBalance = 0;

    public synchronized void deposit(){
        while(accountBalance >= 10000){
            try{
                wait();
            }catch(Exception e){

            }
        }

        accountBalance += new Random().nextInt(10000) + 1;
        System.out.println("—a‚¯‚½ : " + accountBalance);
        notifyAll();
    }

    public synchronized void withdrawal(){
        if(accountBalance <= 0){
            try{
                wait();
            }catch(Exception e){
                
            }
        }

        accountBalance -= new Random().nextInt(accountBalance) + 1;
        System.out.println("ˆø‚«o‚µ‚½ : " + accountBalance);
        notifyAll();
    }
}