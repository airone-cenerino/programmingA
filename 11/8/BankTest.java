/**
 * BankTest
 */
public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Parent parent = new Parent(bank);
        Child child = new Child(bank);
        parent.start();
        child.start();
        try {
        	parent.join();
        	child.join();
        } catch(InterruptedException ie) {
        }
    }
}