/**
 * ExtendClass
 */
public class ExtendClass extends AbstractClass{

    ExtendClass(){
        System.out.println("生成されました。");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GCに回収されます。");
    }

    public static void main(String[] args) {
        new ExtendClass();
        System.gc();
    }
}