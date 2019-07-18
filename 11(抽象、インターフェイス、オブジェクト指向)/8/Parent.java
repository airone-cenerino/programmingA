/**
 * Parent
 */
public class Parent extends Thread{
    Bank bank = null;
    Parent(Bank bank){
        this.bank = bank;
    }

    public void run(){
        while(true){
            bank.deposit();
        }
    }
}