package tomo_k.ruri.waseda.jp;

/**
 * SamePackageClass
 */
public class SamePackageClass {
    public static void main(String[] args) {
        System.out.println(PublicClass.field);
        System.out.println(PublicClass.protectedField);
        System.out.println(PublicClass.publicField);
        PublicClass.method();
        PublicClass.protectedMethod();
        PublicClass.publicMethod();
    }
}