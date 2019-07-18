/**
 * ExtendClass
 */
public class ExtendClass extends AbstractClass{

    ExtendClass(){
        System.out.println("ê∂ê¨Ç≥ÇÍÇ‹ÇµÇΩÅB");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GCÇ…âÒé˚Ç≥ÇÍÇ‹Ç∑ÅB");
    }

    public static void main(String[] args) {
        new ExtendClass();
        System.gc();
    }
}