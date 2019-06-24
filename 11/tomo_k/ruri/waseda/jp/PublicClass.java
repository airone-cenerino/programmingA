package tomo_k.ruri.waseda.jp;
/**
 * PublicClass
 */
public class PublicClass {
    private static int privateField = 0;
    static int field = 1;
    protected static int protectedField = 2;
    public static int publicField = 3;

    private static void privateMethod(){
        System.out.println("privateMethod");
    }

    static void method(){
        System.out.println("method");
    }

    protected static void protectedMethod(){
        System.out.println("protectedMethod");
    }

    public static void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        System.out.println(privateField);
        System.out.println(field);
        System.out.println(protectedField);
        System.out.println(publicField);
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}