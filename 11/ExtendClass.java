/**
 * ExtendClass
 */
public class ExtendClass extends AbstractClass{

    ExtendClass(){
        System.out.println("��������܂����B");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC�ɉ������܂��B");
    }

    public static void main(String[] args) {
        new ExtendClass();
        System.gc();
    }
}