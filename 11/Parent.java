/**
 * Parent
 */
public class Parent {
    void method(){
        System.out.println("parent");
    }

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        ch1.method();
        ch2.method();
    }
}