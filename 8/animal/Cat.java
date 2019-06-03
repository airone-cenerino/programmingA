package animal;

/**
 * Cat
 */
public class Cat extends Animal{
    private static Cat cat;

    private Cat(){} 

    public static Cat getInstance(){
        cat = new Cat();
        return cat;
    }

    @Override
    public String say() {
        return "ƒjƒƒ[";
    }
}