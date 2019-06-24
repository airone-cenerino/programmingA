import tomo_k.ruri.waseda.jp;

/**
 * SubClass
 */
public class SubClass extends PublicClass{

    public static void main(String[] args) {
        System.out.println(PublicClass.protectedField);
        System.out.println(PublicClass.publicField);
        PublicClass.protectedMethod();
        PublicClass.publicMethod();
    }
}