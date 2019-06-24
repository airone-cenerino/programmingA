/**
 * Human
 */
public class Human implements Animal{
    private String name = null;
    private int size = 4;

    Human(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }
}