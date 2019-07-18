/**
 * Dog
 */
public class Dog implements Animal{
    private String name = null;
    private int size = 1;

    Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }
}