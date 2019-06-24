/**
 * Child
 */
public class Child extends Thread{
    Bank bank = null;
    Child(Bank bank){
        this.bank = bank;
    }

    public void run(){
        while(true){
            bank.withdrawal();
        }
    }
}